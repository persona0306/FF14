package potato.ball.ff14;

import org.bukkit.OfflinePlayer;

public class MagicDoctor extends Job {


	public MagicDoctor(OfflinePlayer player) {
		super(player);
	}
	
	@Override
	public PlayerStats getBaseStats() {
		PlayerStats playerStats = new PlayerStats(getPlayer(),40, 80, 500, 60, 120, 50);
		return playerStats;
	}

	
	}
