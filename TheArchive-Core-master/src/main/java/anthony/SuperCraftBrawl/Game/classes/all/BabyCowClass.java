package anthony.SuperCraftBrawl.Game.classes.all;

import anthony.SuperCraftBrawl.Game.GameInstance;
import anthony.SuperCraftBrawl.Game.classes.BaseClass;
import anthony.SuperCraftBrawl.Game.classes.ClassType;
import anthony.SuperCraftBrawl.ItemHelper;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class BabyCowClass extends BaseClass {

	public BabyCowClass(GameInstance instance, Player player) {
		super(instance, player);
		baseVerticalJump = 1.1;
	}

	public ItemStack makePurple(ItemStack armour) {
		LeatherArmorMeta lm = (LeatherArmorMeta) armour.getItemMeta();
		lm.setColor(Color.RED);
		armour.setItemMeta(lm);
		return armour;
	}

	@Override
	public void SetArmour(EntityEquipment playerEquip) {
		String texture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDBiYzYxYjk3NTdhN2I4M2UwM2NkMjUwN2EyMTU3OTEzYzJjZjAxNmU3YzA5NmE0ZDZjZjFmZTFiOGRiIn19fQ==";
		ItemStack playerskull = ItemHelper.createSkullTexture(texture, "");

		SkullMeta meta = (SkullMeta) playerskull.getItemMeta();
		
		meta.setDisplayName("");

		playerskull.setItemMeta(meta);

		playerEquip.setHelmet(playerskull);
		playerEquip.setChestplate(makePurple(ItemHelper.addEnchant(new ItemStack(Material.LEATHER_CHESTPLATE),
				Enchantment.PROTECTION_ENVIRONMENTAL, 4)));
		playerEquip.setLeggings(makePurple(new ItemStack(Material.LEATHER_LEGGINGS)));
		playerEquip.setBoots(makePurple(
				ItemHelper.addEnchant(new ItemStack(Material.LEATHER_BOOTS), Enchantment.PROTECTION_ENVIRONMENTAL, 4)));
	}

	@Override
	public void SetItems(Inventory playerInv) {
		playerInv.setItem(0,
				ItemHelper.addEnchant(
						ItemHelper.setDetails(new ItemStack(Material.RED_MUSHROOM),
								"" + ChatColor.RESET + "Red Mushoom", ChatColor.GRAY + "", ChatColor.YELLOW + ""),
						Enchantment.DAMAGE_ALL, 3));
		playerInv.setItem(1,
				ItemHelper.addEnchant(
						ItemHelper.setDetails(new ItemStack(Material.BROWN_MUSHROOM),
								"" + ChatColor.RESET + "Brown Mushroom", ChatColor.GRAY + "", ChatColor.YELLOW + ""),
						Enchantment.KNOCKBACK, 2));
		playerInv.setItem(2,
				ItemHelper.setDetails(new ItemStack(Material.MILK_BUCKET),
						instance.getGameManager().getMain().color("&r&lMommy's Milk &7(Right Click)"), "",
						instance.getGameManager().getMain().color("&7Right click to gain:"),
						instance.getGameManager().getMain().color("   &rPermanent Speed I"),
						instance.getGameManager().getMain().color("   &r30 sec Strength I")));
	}

	@Override
	public void DoDamage(EntityDamageByEntityEvent event) {
		Random rand = new Random();
		int chance = rand.nextInt(9);

		if (chance == 5 || chance == 1 || chance == 7 || chance == 6) {
			if (event.getEntity() instanceof Player) {
				((LivingEntity) event.getEntity())
						.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 2, true));
			}
		}
	}

	@Override
	public void UseItem(PlayerInteractEvent event) {
		ItemStack item = event.getItem();

		if (item != null) {
			if (item.getType() == Material.MILK_BUCKET
					&& (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK)) {
				event.setCancelled(true);
				player.setFireTicks(0);
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999999, 0));
				player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 0));
				player.getInventory().clear(player.getInventory().getHeldItemSlot());
				player.sendMessage(instance.getGameManager().getMain().color(
						"&2&l(!) &rYour &eMommy's Milk &rgave you permanent Speed I and Strength I for 30 seconds!"));
			}
		}
	}

	@Override
	public ClassType getType() {
		return ClassType.BabyCow;
	}

	@Override
	public void SetNameTag() {
		// TODO Auto-generated method stub
	}

	@Override
	public ItemStack getAttackWeapon() {
		ItemStack item = ItemHelper
				.addEnchant(
						ItemHelper.setDetails(new ItemStack(Material.RED_MUSHROOM),
								"" + ChatColor.RESET + "Red Mushoom", ChatColor.GRAY + "", ChatColor.YELLOW + ""),
						Enchantment.DAMAGE_ALL, 3);
		return item;
	}
}
