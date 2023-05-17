package potato.ball.ff14;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

import jobs.Job;
import jobs.None;
import updateEvents.AtkUpdateEvent;
import updateEvents.CritUpdateEvent;
import updateEvents.DefUpdateEvent;
import updateEvents.HpUpdateEvent;
import updateEvents.IntUpdateEvent;
import updateEvents.MindUpdateEvent;
import updateEvents.MpUpdateEvent;

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
		setJob(new None(player));
		
		playerDataMap.put(uuid, this);
		
	}
	
	public OfflinePlayer getPlayer() {
		OfflinePlayer player = Bukkit.getOfflinePlayer(uuid);
		return player;
		
	}
	
	public PlayerStats getStats() {
		return stats;
		
	}
	
	public Job getJob() {
		return job;
		
	}
	
	public void setJob(Job job) {
		this.job = job;
		setStats(job.getBaseStats());
		job.setHotbar();
		
	}
	
	private void setStats (PlayerStats stats) {
		
		int hpFrom = this.stats == null ? 0 : this.stats.getHp();
		
		HpUpdateEvent hpUpdateEvent = new HpUpdateEvent(getPlayer(), hpFrom, stats.getHp());
		Bukkit.getPluginManager().callEvent(hpUpdateEvent);
		
		stats.setHp(hpUpdateEvent.getTo());
		
		
		
		int mpFrom = this.stats == null ? 0 : this.stats.getMp();
		
		MpUpdateEvent mpUpdateEvent = new MpUpdateEvent(getPlayer(), mpFrom, stats.getMp());
		Bukkit.getPluginManager().callEvent(mpUpdateEvent);
		
		stats.setMp(mpUpdateEvent.getTo());
		
		
		
		int atkFrom = this.stats == null ? 0 : this.stats.getHp();
		
		AtkUpdateEvent atkUpdateEvent = new AtkUpdateEvent(getPlayer(), atkFrom, stats.getAtk());
		Bukkit.getPluginManager().callEvent(atkUpdateEvent);
		
		stats.setAtk(atkUpdateEvent.getTo());
		
		
		
		int defFrom = this.stats == null ? 0 : this.stats.getHp();
		
		DefUpdateEvent defUpdateEvent = new DefUpdateEvent(getPlayer(), defFrom, stats.getDef());
		Bukkit.getPluginManager().callEvent(defUpdateEvent);
		
		stats.setDef(defUpdateEvent.getTo());
		
		
		
		int intFrom = this.stats == null ? 0 : this.stats.getIntelligence();
		
		IntUpdateEvent intUpdateEvent = new IntUpdateEvent(getPlayer(), intFrom, 
										stats.getIntelligence());
		
		Bukkit.getPluginManager().callEvent(intUpdateEvent);
		
		stats.setIntelligence(intUpdateEvent.getTo());
		
		
		
		int mindFrom = this.stats == null ? 0 : this.stats.getMind();
		
		MindUpdateEvent mindUpdateEvent = new MindUpdateEvent(getPlayer(), mindFrom, 
										stats.getMind());
		
		Bukkit.getPluginManager().callEvent(mindUpdateEvent);
		
		stats.setMind(mindUpdateEvent.getTo());
		
		
		
		int critFrom = this.stats == null ? 0 : this.stats.getCrit();
		
		CritUpdateEvent critUpdateEvent = new CritUpdateEvent(getPlayer(), critFrom, 
										stats.getCrit());
		
		Bukkit.getPluginManager().callEvent(critUpdateEvent);
		
		stats.setCrit(critUpdateEvent.getTo());
		
		this.stats = stats;
		
	}
	
}
