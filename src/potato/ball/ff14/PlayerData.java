package potato.ball.ff14;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

public class PlayerData {
	private static final HashMap<UUID,PlayerData> playerDataMap = new HashMap<>();
	
	public static PlayerData get(OfflinePlayer player) {
		PlayerData playerData = playerDataMap.get(player.getUniqueId());
		
		if (playerData == null) {
			playerData = new PlayerData(player);
		}
		
		return playerData;
	}
	
	private final UUID uuid;
	private Job job;
	private PlayerStats stats;
	
	private PlayerData(OfflinePlayer player) {
		uuid = player.getUniqueId();
		setJob(new Knight(player));
		
		playerDataMap.put(uuid, this);
	}
	
	public OfflinePlayer getPlayer() {
		OfflinePlayer player = Bukkit.getOfflinePlayer(uuid);
		return player;
		
	}
	
	public PlayerStats getStats() {
		return stats;
		
	}
	public void setJob(Job job) {
		this.job = job;
		setStats(job.getBaseStats());
	}
	private void setStats (PlayerStats stats) {
		int from = this.stats == null ? 0 : this.stats.getHp();
		
		HpUpdateEvent event = new HpUpdateEvent(getPlayer(), from, stats.getHp());
		Bukkit.getPluginManager().callEvent(event);
		
		stats.setHp(event.getTo());
		
		this.stats = stats;
	}
}
