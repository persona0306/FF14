package jobs;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;
import potato.ball.ff14.PlayerStats;

public class UndeadHunter extends Job {
	private static final String jobName = ""+ChatColor.DARK_PURPLE+ChatColor.BOLD+"Undead"+
											ChatColor.GOLD+ChatColor.BOLD+"Hunter";

	private static final HashMap<Integer,ItemStack> inventoryContents =
															new HashMap<Integer,ItemStack>();
	
	static {
		
		ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
		
		ItemMeta swordMeta =  sword.getItemMeta();
		
		swordMeta.setCustomModelData(3331);
		
		swordMeta.setDisplayName(""+ChatColor.AQUA+ChatColor.BOLD+"ハントランス");
		
		sword.setItemMeta(swordMeta);
		
		inventoryContents.put(0,sword);
		
		
		
		ItemStack jobIcon = new ItemStack(Material.NAME_TAG);
		
		ItemMeta jobIconMeta = jobIcon.getItemMeta();
		
		jobIconMeta.setCustomModelData(4);
		
		jobIconMeta.setDisplayName(""+ChatColor.RED+ChatColor.BOLD+"近接 "+
									ChatColor.DARK_RED+ChatColor.BOLD+"ダメージ"+
									ChatColor.WHITE+ChatColor.BOLD+" : "+
									ChatColor.DARK_PURPLE+ChatColor.BOLD+"屍"+
									ChatColor.GOLD+ChatColor.BOLD+"狩士");
		
		jobIcon.setItemMeta(jobIconMeta);
		
		inventoryContents.put(22,jobIcon);
		
		
		
		ItemStack prSymbol = new ItemStack(Material.PAPER);
		
		ItemMeta prSymbolMeta = prSymbol.getItemMeta();
		
		prSymbolMeta.setCustomModelData(3900);
		
		prSymbolMeta.setDisplayName(""+ChatColor.YELLOW+ChatColor.BOLD+"パスター"+
									ChatColor.WHITE+ChatColor.BOLD+"＆"+
									ChatColor.DARK_PURPLE+ChatColor.BOLD+"レネゲイズ"+
									ChatColor.WHITE+ChatColor.BOLD+"シンボル "+
									ChatColor.GOLD+ChatColor.BOLD+"トワイライト"+
									ChatColor.WHITE+ChatColor.BOLD+"シンボル ");
		
		prSymbol.setItemMeta(prSymbolMeta);
		
		inventoryContents.put(40,prSymbol);
	}
	
	public UndeadHunter(OfflinePlayer player) {
		super(player);
	}

	@Override
	public PlayerStats getBaseStats() {
		PlayerStats playerStats = new PlayerStats(getPlayer(),7000, 100, 60, 60, 60, 50);
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
