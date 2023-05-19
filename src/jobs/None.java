package jobs;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;
import potato.ball.ff14.PlayerStats;

public class None extends Job {
	private static final String jobName = ""+ChatColor.GRAY+"none";
	
	private static final ArrayList<ItemStack> hotbarContents = new ArrayList<>();

	public None(OfflinePlayer player) {
		super(player);
	}

	@Override
	public PlayerStats getBaseStats() {
		PlayerStats playerStats = new PlayerStats(getPlayer(),1000, 10, 10, 10, 10, 10);
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
		
		}
	}

