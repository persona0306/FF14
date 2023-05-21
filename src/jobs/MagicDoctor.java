package jobs;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;
import potato.ball.ff14.PlayerStats;

public class MagicDoctor extends Job {
	private static final String jobName = ""+ChatColor.LIGHT_PURPLE+ChatColor.BOLD+"Magic"+
											ChatColor.GREEN+ChatColor.BOLD+"Doctor";

	private static final HashMap<Integer,ItemStack> inventoryContents =
													new HashMap<Integer,ItemStack>();
	
	static {
		
		ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
		
		ItemMeta swordMeta =  sword.getItemMeta();
		
		swordMeta.setCustomModelData(2221);
		
		swordMeta.setDisplayName(""+ChatColor.GREEN+ChatColor.BOLD+"注射剣"+
								ChatColor.RESET+"・"+ChatColor.GOLD+ChatColor.BOLD+
								"剣撃");
		
		sword.setItemMeta(swordMeta);
		
		inventoryContents.put(0,sword);
		
		
		
		ItemStack jobIcon = new ItemStack(Material.NAME_TAG);
		
		ItemMeta jobIconMeta = jobIcon.getItemMeta();
		
		jobIconMeta.setCustomModelData(3);
		
		jobIconMeta.setDisplayName(""+ChatColor.GREEN+ChatColor.BOLD+"ヒーラー"+
									ChatColor.WHITE+ChatColor.BOLD+" : "+
									ChatColor.LIGHT_PURPLE+ChatColor.BOLD+"魔法"+
									ChatColor.GREEN+ChatColor.BOLD+"医");
		
		jobIcon.setItemMeta(jobIconMeta);
		
		inventoryContents.put(22,jobIcon);
		
	}
	
	public MagicDoctor(OfflinePlayer player) {
		super(player);
	}
	
	@Override
	public PlayerStats getBaseStats() {
		PlayerStats playerStats = new PlayerStats(getPlayer(),5000, 50, 40, 60, 100, 50);
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
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
