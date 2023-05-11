package potato.ball.ff14;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

public abstract class Job {
	
	private UUID uuid;
	
	public Job(OfflinePlayer player) {
		this.uuid = player.getUniqueId();
		
	}
	
	public abstract PlayerStats getBaseStats();
	
	public OfflinePlayer getPlayer() {
		OfflinePlayer player = Bukkit.getOfflinePlayer(uuid);
		return player;
	}


	
}

