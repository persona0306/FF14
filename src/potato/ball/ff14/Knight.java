package potato.ball.ff14;

import org.bukkit.OfflinePlayer;

import net.md_5.bungee.api.ChatColor;

public class Knight extends Job {
	private static final String jobName = ""+ChatColor.BLUE+ChatColor.BOLD+"Knight";

	public Knight(OfflinePlayer player) {
		super(player);
	}

	@Override
	public PlayerStats getBaseStats() {
		PlayerStats playerStats = new PlayerStats(getPlayer(),70, 120, 1500, 40, 30, 50);
		return playerStats;
	}

	public String getName() {
		return jobName;
	
	}
}
