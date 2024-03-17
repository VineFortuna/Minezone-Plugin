package anthony.SuperCraftBrawl.Game.classes.all;

import anthony.SuperCraftBrawl.Game.GameInstance;
import anthony.SuperCraftBrawl.Game.classes.BaseClass;
import anthony.SuperCraftBrawl.Game.classes.ClassType;
import anthony.SuperCraftBrawl.Game.projectile.ItemProjectile;
import anthony.SuperCraftBrawl.Game.projectile.ProjectileOnHit;
import anthony.SuperCraftBrawl.ItemHelper;
import net.md_5.bungee.api.ChatColor;
import net.minecraft.server.v1_8_R3.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import org.bukkit.*;
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

import java.util.Random;

public class VillagerClass extends BaseClass {

	private int cooldownSec;

	public VillagerClass(GameInstance instance, Player player) {
		super(instance, player);
	}

	@Override
	public ClassType getType() {
		return ClassType.Villager;
	}

	public ItemStack makeBrown(ItemStack armour) {
		LeatherArmorMeta lm = (LeatherArmorMeta) armour.getItemMeta();
		lm.setColor(Color.GRAY);
		armour.setItemMeta(lm);
		return armour;
	}

	@Override
	public void SetArmour(EntityEquipment playerEquip) {
		ItemStack playerskull = new ItemStack(Material.SKULL_ITEM, 1, (short) SkullType.PLAYER.ordinal());

		SkullMeta meta = (SkullMeta) playerskull.getItemMeta();

		meta.setOwner("Villager");
		meta.setDisplayName("");

		playerskull.setItemMeta(meta);

		playerEquip.setHelmet(playerskull);
		playerEquip.setChestplate(makeBrown(ItemHelper.addEnchant(new ItemStack(Material.LEATHER_CHESTPLATE),
				Enchantment.PROTECTION_ENVIRONMENTAL, 4)));
		playerEquip.setLeggings(makeBrown(new ItemStack(Material.LEATHER_LEGGINGS)));
		playerEquip.setBoots(makeBrown(
				ItemHelper.addEnchant(new ItemStack(Material.LEATHER_BOOTS), Enchantment.PROTECTION_ENVIRONMENTAL, 4)));
	}

	@Override
	public ItemStack getAttackWeapon() {
		return ItemHelper.addEnchant(ItemHelper.addEnchant(new ItemStack(Material.EMERALD), Enchantment.DAMAGE_ALL, 3),
				Enchantment.KNOCKBACK, 2);
	}

	@Override
	public void SetNameTag() {

	}

	@Override
	public void SetItems(Inventory playerInv) {
		villager.startTime = System.currentTimeMillis() - 100000;
		playerInv.setItem(0, this.getAttackWeapon());
		playerInv.setItem(1,
				ItemHelper.setDetails(new ItemStack(Material.BAKED_POTATO, 1), "", "",
						instance.getGameManager().getMain().color("&7Gives players 1 of 3 things:"),
						instance.getGameManager().getMain().color("   &r3 sec Blindness I"),
						instance.getGameManager().getMain().color("   &r3 sec Slowness II"),
						instance.getGameManager().getMain().color("   &r4 sec Weakness I")));
		playerInv.setItem(2, instance.getItemToDrop());
	}

	@Override
	public void Tick(int gameTicks) {
		if (instance.classes.containsKey(player) && instance.classes.get(player).getType() == ClassType.Villager
				&& instance.classes.get(player).getLives() > 0) {
			this.cooldownSec = (5000 - villager.getTime()) / 1000 + 1;

			if (villager.getTime() < 5000) {
				String msg = instance.getGameManager().getMain()
						.color("&2Baked Potato &rregenerates in: &e" + this.cooldownSec + "s");
				getActionBarManager().setActionBar(player, "potato.cooldown", msg, 2);
			} else {
				String msg = instance.getGameManager().getMain().color("&rYou can use &2Baked Potato");
				getActionBarManager().setActionBar(player, "potato.cooldown", msg, 2);
			}
		}
	}

	@Override
	public void UseItem(PlayerInteractEvent event) {
		ItemStack item = event.getItem();

		if (item != null) {
			if (item.getType() == Material.BAKED_POTATO
					&& (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK)) {
				event.setCancelled(true);
				if (villager.getTime() < 5000) {
					int seconds = (5000 - villager.getTime()) / 1000 + 1;
					event.setCancelled(true);
					player.sendMessage("" + ChatColor.BOLD + "(!) " + ChatColor.RESET + "Yooo you gotta wait "
							+ ChatColor.YELLOW + seconds + " more seconds ");
				} else {
					villager.restart();
					for (Player gamePlayer : instance.players)
						gamePlayer.playSound(player.getLocation(), Sound.VILLAGER_HAGGLE, 1, 1);
					
					ItemProjectile proj = new ItemProjectile(instance, player, new ProjectileOnHit() {
						@Override
						public void onHit(Player hit) {
							if (hit == null || hit.getGameMode() != GameMode.SPECTATOR) {
								Location hitLoc = this.getBaseProj().getEntity().getLocation();
								Random r = new Random();
								int chance = r.nextInt(100);

								for (Player gamePlayer : this.getNearby(2.5)) {
									if (instance.duosMap != null) {
										if (!(instance.team.get(gamePlayer).equals(instance.team.get(player)))) {
											if (chance >= 0 && chance <= 40)
												gamePlayer.addPotionEffect(
														new PotionEffect(PotionEffectType.BLINDNESS, 75, 0));
											else if (chance > 40 && chance <= 79)
												gamePlayer.addPotionEffect(
														new PotionEffect(PotionEffectType.SLOW, 75, 1));
											else
												gamePlayer.addPotionEffect(
														new PotionEffect(PotionEffectType.WEAKNESS, 90, 0));
										}
									} else if (gamePlayer != player) {
										if (chance >= 0 && chance <= 40)
											gamePlayer.addPotionEffect(
													new PotionEffect(PotionEffectType.BLINDNESS, 75, 0));
										else if (chance > 40 && chance <= 79)
											gamePlayer.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 75, 1));
										else
											gamePlayer.addPotionEffect(
													new PotionEffect(PotionEffectType.WEAKNESS, 90, 0));
									}
								}
								for (Player gamePlayer : instance.players) {
									gamePlayer.playSound(hitLoc, Sound.SPLASH2, 2, 1);
									gamePlayer.playEffect(hitLoc, Effect.SPLASH, 1);
								}

							}
						}

					}, new ItemStack(Material.BAKED_POTATO));
					instance.getGameManager().getProjManager().shootProjectile(proj, player.getEyeLocation(),
							player.getLocation().getDirection().multiply(2.0D));
				}
			}
		}
	}

}
