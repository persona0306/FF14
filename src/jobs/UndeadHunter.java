package jobs;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;
import potato.ball.ff14.PlayerStats;

public class UndeadHunter extends Job {
	private static final String jobName = ""+ChatColor.DARK_PURPLE+ChatColor.BOLD+"Undead"+
											ChatColor.GOLD+ChatColor.BOLD+"Hunter";

	private static final ArrayList<ItemStack> hotbarContents = new ArrayList<>();
	
	static {
		
		ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
		
		ItemMeta swordMeta =  sword.getItemMeta();
		
		swordMeta.setCustomModelData(3331);
		
		swordMeta.setDisplayName(""+ChatColor.AQUA+ChatColor.BOLD+"ハントランス");
		
		sword.setItemMeta(swordMeta);
		
		hotbarContents.add(sword);
		
		ItemStack skill2 = new ItemStack(Material.NAME_TAG);
		
		ItemMeta skill2Meta = skill2.getItemMeta();
		
		skill2Meta.setCustomModelData(4);
		
		skill2.setItemMeta(skill2Meta);
		
		hotbarContents.add(skill2);
		
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
	protected List<ItemStack> getHotbarContents() {
		return hotbarContents;
		
	}

	@Override
	public void action(int actionNumber) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
