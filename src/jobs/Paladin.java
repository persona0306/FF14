package jobs;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.util.Vector;

import net.md_5.bungee.api.ChatColor;
import potato.ball.ff14.PlayerStats;

public class Paladin extends Job {
	private static final String jobName = ""+ChatColor.YELLOW+ChatColor.BOLD+"Paladin";
	
	private static final HashMap<Integer,ItemStack> inventoryContents =
													new HashMap<Integer,ItemStack>();
	
	static {
		
		ItemStack shield = new ItemStack(Material.SHIELD);
		
		ItemMeta shieldMeta = shield.getItemMeta();
		
		shieldMeta.setCustomModelData(1);
		
		shieldMeta.setDisplayName(""+ChatColor.BLUE+ChatColor.BOLD+"ガード"+
									ChatColor.WHITE+ChatColor.BOLD+"＆"+
									ChatColor.GOLD+ChatColor.BOLD+"チャージ");
		
		shield.setItemMeta(shieldMeta);
		
		inventoryContents.put(40,shield);
		
		
		
		ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
		
		ItemMeta swordMeta =  sword.getItemMeta();
		
		PersistentDataContainer swordDataContainer = swordMeta.getPersistentDataContainer();
		
		swordDataContainer.set(NamespacedKey.fromString("action"), PersistentDataType.
								INTEGER, 1);
		
		swordMeta.setCustomModelData(1111);
		
		swordMeta.setDisplayName(""+ChatColor.BLUE+ChatColor.BOLD+"ナイトソード");
		
		sword.setItemMeta(swordMeta);
		
		inventoryContents.put(0,sword);
		
		
		
		ItemStack jobIcon = new ItemStack(Material.NAME_TAG);
		
		ItemMeta jobIconMeta = jobIcon.getItemMeta();
		
		jobIconMeta.setCustomModelData(2);
		
		jobIconMeta.setDisplayName(""+ChatColor.BLUE+ChatColor.BOLD+"タンク"+
									ChatColor.WHITE+ChatColor.BOLD+" : "+
									ChatColor.YELLOW+ChatColor.BOLD+"聖騎士");
		
		jobIcon.setItemMeta(jobIconMeta);
		
		inventoryContents.put(22,jobIcon);
		
		
		
	}

	public Paladin(OfflinePlayer player) {
		super(player);
	}

	@Override
	public PlayerStats getBaseStats() {
		PlayerStats playerStats = new PlayerStats(getPlayer(),12000, 70, 100, 40, 30, 50);
		return playerStats;
	}

	public String getName() {
		return jobName;
	
	}

	@Override
	protected HashMap<Integer,ItemStack> getInventoryContents() {
		
		return inventoryContents;
	}

	@Override
	public void action(int actionNumber) {
		
		if (!getPlayer().isOnline()) return;
		
		Player player = getPlayer().getPlayer();
		
		if(actionNumber == 1) {
			TNTPrimed tnt = (TNTPrimed) player.getWorld().spawnEntity(player.getEyeLocation(), EntityType.PRIMED_TNT);
			
			Vector velocity = player.getLocation().getDirection();
			
			tnt.setVelocity(velocity.multiply(3));
				
		}
		
		if(actionNumber == 2) {
			
		
		}
	}
}
