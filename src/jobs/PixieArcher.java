package jobs;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;
import potato.ball.ff14.PlayerStats;

public class PixieArcher extends Job {
	private static final String jobName = ""+ChatColor.AQUA+ChatColor.BOLD+"Pixie"
											+ChatColor.YELLOW+ChatColor.BOLD+"Archer";
	
	private static final HashMap<Integer,ItemStack> inventoryContents =
													new HashMap<Integer,ItemStack>();
	
	static {
		
		ItemStack bow = new ItemStack(Material.BOW);
		
		ItemMeta bowMeta =  bow.getItemMeta();
		
		bowMeta.setCustomModelData(1);
		
		bowMeta.setDisplayName(""+ChatColor.YELLOW+ChatColor.BOLD+"マジックアロー"
								+ChatColor.WHITE+ChatColor.BOLD+"・"+
								ChatColor.RED+ChatColor.BOLD+"ファイア");
		
		bow.setItemMeta(bowMeta);
		
		inventoryContents.put(0,bow);
		
		
		
		ItemStack jobIcon = new ItemStack(Material.NAME_TAG);
		
		ItemMeta jobIconMeta = jobIcon.getItemMeta();
		
		jobIconMeta.setCustomModelData(5);
		
		jobIconMeta.setDisplayName(""+ChatColor.AQUA+ChatColor.BOLD+"遠隔 "
									+ChatColor.DARK_RED+ChatColor.BOLD+"ダメージ"+
									ChatColor.WHITE+ChatColor.BOLD+" : "+
									ChatColor.AQUA+ChatColor.BOLD+"精"+
									ChatColor.YELLOW+ChatColor.BOLD+"弓士");
		
		jobIcon.setItemMeta(jobIconMeta);
		
		inventoryContents.put(22,jobIcon);
		
		
		
	}

	public PixieArcher(OfflinePlayer player) {
		super(player);
	}

	@Override
	public PlayerStats getBaseStats() {
		PlayerStats playerStats = new PlayerStats(getPlayer(),6000, 80, 50, 20, 40, 50);
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
		
	}
}
