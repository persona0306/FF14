package jobs;

import java.util.ArrayList;
import java.util.List;

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
	
	private static final ArrayList<ItemStack> hotbarContents = new ArrayList<>();
	
	static {
		
		ItemStack bow = new ItemStack(Material.BOW);
		
		ItemMeta bowMeta =  bow.getItemMeta();
		
		bowMeta.setCustomModelData(1);
		
		bowMeta.setDisplayName(""+ChatColor.AQUA+ChatColor.BOLD+"マジックアロー"
								+ChatColor.WHITE+ChatColor.BOLD+"・"+
								ChatColor.RED+ChatColor.BOLD+"ファイア");
		
		bow.setItemMeta(bowMeta);
		
		hotbarContents.add(bow);
		
		
		ItemStack skill2 = new ItemStack(Material.NAME_TAG);
		
		ItemMeta skill2Meta = skill2.getItemMeta();
		
		skill2Meta.setCustomModelData(5);
		
		skill2.setItemMeta(skill2Meta);
		
		hotbarContents.add(skill2);
		
		
		
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
	protected List<ItemStack> getHotbarContents() {
		
		return hotbarContents;
	}

	@Override
	public void action(int actionNumber) {
		
		if (!getPlayer().isOnline()) return;
		
		Player player = getPlayer().getPlayer();
		
	}
}
