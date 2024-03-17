package anthony.SuperCraftBrawl.Game.classes.all;

import anthony.SuperCraftBrawl.Game.GameInstance;
import anthony.SuperCraftBrawl.Game.classes.BaseClass;
import anthony.SuperCraftBrawl.Game.classes.ClassType;
import anthony.SuperCraftBrawl.ItemHelper;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
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
import org.bukkit.scheduler.BukkitRunnable;

import java.lang.reflect.Field;
import java.util.UUID;

public class BunnyClass extends BaseClass {

	public BunnyClass(GameInstance instance, Player player) {
		super(instance, player);
		baseVerticalJump = 1.15;
	}

	public ItemStack makeRed(ItemStack armour) {
		LeatherArmorMeta lm = (LeatherArmorMeta) armour.getItemMeta();
		lm.setColor(Color.GRAY);
		armour.setItemMeta(lm);
		return armour;
	}

	@Override
	public void SetArmour(EntityEquipment playerEquip) {
		String texture = "e3RleHR1cmVzOntTS0lOOnt1cmw6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzRiMTJkZDJkOTljNDdlMTkxM2M0YjFkNGQ5ZmFmNjlhZDYxZTk1YWUyN2NkNGU5ZjlmZTVlMzBhNjM0M2ExNiJ9fX0=";
		ItemStack skull = ItemHelper.createSkullTexture(texture, "");
		
		playerEquip.setHelmet(skull);
		playerEquip.setChestplate(makeRed(ItemHelper.addEnchant(new ItemStack(Material.LEATHER_CHESTPLATE),
				Enchantment.PROTECTION_ENVIRONMENTAL, 4)));
		playerEquip.setLeggings(makeRed(new ItemStack(Material.LEATHER_LEGGINGS)));
		playerEquip.setBoots(makeRed(
				ItemHelper.addEnchant(new ItemStack(Material.LEATHER_BOOTS), Enchantment.PROTECTION_ENVIRONMENTAL, 4)));
	}

	@Override
	public void SetItems(Inventory playerInv) {
		playerInv.setItem(0,
				ItemHelper.addEnchant(
						ItemHelper.addEnchant(new ItemStack(Material.CARROT_ITEM), Enchantment.DAMAGE_ALL, 3),
						Enchantment.KNOCKBACK, 1));
		playerInv.setItem(1,
				ItemHelper.setDetails(new ItemStack(Material.GOLDEN_CARROT), "", "",
						instance.getGameManager().getMain().color("&7Right click to gain:"),
						instance.getGameManager().getMain().color("   &r5 sec Regeneration II"),
						instance.getGameManager().getMain().color("   &r5 sec Speed V")));
		player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999999, 2));
		player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 999999999, 2));
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void Tick(int gameTicks) {
		if (!(player.getActivePotionEffects().contains(PotionEffectType.SPEED)))
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999999, 2));
		if (!(player.getActivePotionEffects().contains(PotionEffectType.JUMP)))
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 999999999, 2));
	}

	private void carrotEffect() {
		BukkitRunnable runTimer = new BukkitRunnable() {
			int ticks = 5;

			@Override
			public void run() {
				if (ticks == 5) {
					player.removePotionEffect(PotionEffectType.SPEED);
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 110, 4));
					player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 110, 1));
				} else if (ticks == 0) {
					player.removePotionEffect(PotionEffectType.SPEED);
					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999999, 2));
					this.cancel();
				}

				ticks--;
			}
		};
		runTimer.runTaskTimer(instance.getGameManager().getMain(), 0, 20);
	}

	@Override
	public void UseItem(PlayerInteractEvent event) {
		ItemStack item = event.getItem();

		if (item != null && item.getType() == Material.GOLDEN_CARROT
				&& (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK)) {
			int amount = item.getAmount();
			if (amount > 0) {
				amount--;
				if (amount == 0)
					player.getInventory().clear(player.getInventory().getHeldItemSlot());
				else
					item.setAmount(amount);

				event.setCancelled(true);
			}
			carrotEffect();
		}
	}

	@Override
	public ClassType getType() {
		return ClassType.Bunny;
	}

	@Override
	public void SetNameTag() {
		// TODO Auto-generated method stub
	}

	@Override
	public ItemStack getAttackWeapon() {
		ItemStack item = ItemHelper
				.addEnchant(
						ItemHelper.addEnchant(
								ItemHelper.setDetails(new ItemStack(Material.CARROT_ITEM),
										"" + ChatColor.RESET + "Carrot", ChatColor.GRAY + "", ChatColor.YELLOW + ""),
								Enchantment.DAMAGE_ALL, 3),
						Enchantment.KNOCKBACK, 1);
		return item;
	}
}
