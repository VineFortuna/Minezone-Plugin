package anthony.SuperCraftBrawl.Game.classes.all;

import java.lang.reflect.Field;
import java.util.UUID;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

import anthony.SuperCraftBrawl.ItemHelper;
import anthony.SuperCraftBrawl.Game.GameInstance;
import anthony.SuperCraftBrawl.Game.classes.BaseClass;
import anthony.SuperCraftBrawl.Game.classes.ClassType;
import net.md_5.bungee.api.ChatColor;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import net.minecraft.server.v1_8_R3.IChatBaseComponent.ChatSerializer;

public class OcelotClass extends BaseClass {

	private int cooldownSec = 0;

	public OcelotClass(GameInstance instance, Player player) {
		super(instance, player);
	}

	@Override
	public ClassType getType() {
		return ClassType.Ocelot;
	}

	public ItemStack makeYellow(ItemStack armor) {
		LeatherArmorMeta lm = (LeatherArmorMeta) armor.getItemMeta();
		lm.setColor(Color.YELLOW);
		armor.setItemMeta(lm);
		return armor;
	}

	@Override
	public void SetArmour(EntityEquipment playerEquip) {
		String texture = "e3RleHR1cmVzOntTS0lOOnt1cmw6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjU0ODM1MTlhYmY1MjM0MGNmM2FkOTNlNTE3NTY4YWQyNzZhZWFhMTg1OGZlMzNjNzdkOTM1M2Q5NzYwZDkwNSJ9fX0=";
		ItemStack skull = ItemHelper.createSkullTexture(texture, "");
		
		playerEquip.setHelmet(skull);
		playerEquip.setChestplate(makeYellow(ItemHelper.addEnchant(new ItemStack(Material.LEATHER_CHESTPLATE),
				Enchantment.PROTECTION_ENVIRONMENTAL, 4)));
		playerEquip.setLeggings(makeYellow(new ItemStack(Material.LEATHER_LEGGINGS)));
		playerEquip.setBoots(makeYellow(
				ItemHelper.addEnchant(new ItemStack(Material.LEATHER_BOOTS), Enchantment.PROTECTION_ENVIRONMENTAL, 4)));
		player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999999, 1));

	}

	@Override
	public void SetNameTag() {

	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void Tick(int gameTicks) {
		if (instance.classes.containsKey(player) && instance.classes.get(player).getType() == ClassType.Ocelot
				&& instance.classes.get(player).getLives() > 0) {
			this.cooldownSec = (20000 - ocelot.getTime()) / 1000 + 1;

			if (ocelot.getTime() < 20000) {
				String msg = instance.getGameManager().getMain()
						.color("&7&lPurr Attack &rregenerates in: &e" + this.cooldownSec + "s");
				getActionBarManager().setActionBar(player, "ocelot.cooldown", msg, 2);
			} else {
				String msg = instance.getGameManager().getMain().color("&rYou can use &7&lPurr Attack");
				getActionBarManager().setActionBar(player, "ocelot.cooldown", msg, 2);
			}
		}
		if (!(player.getActivePotionEffects().contains(PotionEffectType.SPEED)))
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999999, 1));
	}

	@Override
	public void SetItems(Inventory playerInv) {
		this.cooldownSec = 0; // Reset each life
		ocelot.startTime = System.currentTimeMillis() - 100000;
		playerInv.setItem(0, this.getAttackWeapon());
		playerInv.setItem(1,
				ItemHelper.setDetails(new ItemStack(Material.DIAMOND),
						instance.getGameManager().getMain().color("&7&lPurr Attack"), "",
						"" + ChatColor.RESET + "Right click to effect players with:",
						instance.getGameManager().getMain().color("   &r10 sec Slowness II")));
	}

	@Override
	public void UseItem(PlayerInteractEvent event) {
		ItemStack item = event.getItem();

		if (item != null) {
			if (item.getType() == Material.DIAMOND
					&& (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK)) {
				if (ocelot.getTime() < 20000) {
					int seconds = (20000 - ocelot.getTime()) / 1000 + 1;
					event.setCancelled(true);
					player.sendMessage("" + ChatColor.BOLD + "(!) " + ChatColor.RESET
							+ "Your Purr Attack is still regenerating for " + ChatColor.YELLOW + seconds + "s");
				} else {
					ocelot.restart();
					player.sendMessage(instance.getGameManager().getMain()
							.color("&r&l(!) &rYou attacked all players with &7&lPurr Attack"));
					for (Player gamePlayer : instance.players) {
						gamePlayer.playSound(gamePlayer.getLocation(), Sound.CAT_MEOW, 1, 1);
						if (player != gamePlayer) {
							gamePlayer.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 110, 2));
							gamePlayer.sendMessage(instance.getGameManager().getMain()
									.color("&r&l(!) &rYou were attacked by &7&lPurr Attack"));
						}
					}
				}
			}
		}
	}

	@Override
	public ItemStack getAttackWeapon() {
		ItemStack item = ItemHelper.addEnchant(
				ItemHelper.addEnchant(new ItemStack(Material.RAW_FISH), Enchantment.DAMAGE_ALL, 3),
				Enchantment.KNOCKBACK, 2);
		return item;
	}

}
