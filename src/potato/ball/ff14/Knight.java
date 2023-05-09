package potato.ball.ff14;

import org.bukkit.OfflinePlayer;

public class Knight extends Job {


	public Knight(OfflinePlayer player) {
		super(player);
	}

	@Override
	public PlayerStats getBaseStats() {
		PlayerStats playerStats = new PlayerStats(getPlayer(),70, 120, 1500, 40, 30, 50);
		return playerStats;
	}

	
}
