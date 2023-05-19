package jobs;

import java.util.ArrayList;
import java.util.List;

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

public class Knight extends Job {
	private static final String jobName = ""+ChatColor.BLUE+ChatColor.BOLD+"Knight";
	
	private static final ArrayList<ItemStack> hotbarContents = new ArrayList<>();
	
	
	
	static {
		
		ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
		
		ItemMeta swordMeta =  sword.getItemMeta();
		
		PersistentDataContainer swordDataContainer = swordMeta.getPersistentDataContainer();
		
		swordDataContainer.set(NamespacedKey.fromString("action"), PersistentDataType.INTEGER, 
								1);
		
		swordMeta.setCustomModelData(1111);
		
		swordMeta.setDisplayName(""+ChatColor.BLUE+ChatColor.BOLD+"ナイトソード");
		
		sword.setItemMeta(swordMeta);
		
		hotbarContents.add(sword);
		
		
		ItemStack skill2 = new ItemStack(Material.NAME_TAG);
		
		ItemMeta skill2Meta = skill2.getItemMeta();
		
		skill2Meta.setCustomModelData(2);
		
		skill2.setItemMeta(skill2Meta);
		
		hotbarContents.add(skill2);
		
		
		
	}

	public Knight(OfflinePlayer player) {
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
	protected List<ItemStack> getHotbarContents() {
		
		return hotbarContents;
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
