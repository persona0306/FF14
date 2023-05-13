package potato.ball.ff14;

import org.bukkit.OfflinePlayer;

import net.md_5.bungee.api.ChatColor;

public class UndeadHunter extends Job {
	private static final String jobName = ""+ChatColor.DARK_PURPLE+ChatColor.BOLD+"Undead"+
											ChatColor.GOLD+ChatColor.BOLD+"Hunter";

	public UndeadHunter(OfflinePlayer player) {
		super(player);
	}

	@Override
	public PlayerStats getBaseStats() {
		PlayerStats playerStats = new PlayerStats(getPlayer(),120, 60, 1000, 60, 60, 50);
		return playerStats;
	}

	public String getName() {
		return jobName;
	
	}
}
