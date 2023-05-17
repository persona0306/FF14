package potato.ball.ff14;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class MagicDoctor extends Job {
	private static final String jobName = ""+ChatColor.LIGHT_PURPLE+ChatColor.BOLD+"Magic"+
											ChatColor.GREEN+ChatColor.BOLD+"Doctor";

	private static final ArrayList<ItemStack> hotbarContents = new ArrayList<>();
	
	static {
		
		ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
		
		ItemMeta swordMeta =  sword.getItemMeta();
		
		swordMeta.setCustomModelData(3);
		
		swordMeta.setDisplayName(""+ChatColor.GREEN+ChatColor.BOLD+"注射剣"+
								ChatColor.RESET+"・"+ChatColor.GOLD+ChatColor.BOLD+
								"剣撃");
		
		sword.setItemMeta(swordMeta);
		
		hotbarContents.add(sword);
		
		ItemStack skill2 = new ItemStack(Material.NAME_TAG);
		
		ItemMeta skill2Meta = skill2.getItemMeta();
		
		skill2Meta.setCustomModelData(2);
		
		skill2.setItemMeta(skill2Meta);
		
		hotbarContents.add(skill2);
		
	}
	
	public MagicDoctor(OfflinePlayer player) {
		super(player);
	}
	
	@Override
	public PlayerStats getBaseStats() {
		PlayerStats playerStats = new PlayerStats(getPlayer(),500, 50, 40, 60, 100, 50);
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
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
