package potato.ball.ff14;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

public class PlayerStats {
	private UUID uuid;
	private int atk;
	private int def;
	private int hp;
	private int maxhp;
	private int mp;
	private int mind;
	private int intelligence;
	
	public PlayerStats(OfflinePlayer player, int atk, int def, int maxhp, int intelligence, int mind) {
		uuid = player.getUniqueId();
		this.atk = atk;
		this.def = def;
		this.maxhp = maxhp;
		this.intelligence = intelligence;
		this.mind = mind;
		
		hp = maxhp;
		mp = 10000;
		
	}
	
	public int getAtk() {
		return atk;
	}
	public int getDef() {
		return def;
	}
	public int getHp() {
		return hp;
	}
	public int getMaxhp() {
		return maxhp;
	}
	public int getMp() {
		return mp;
	}
	public int getMind() {
		return mind;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public OfflinePlayer getPlayer() {
		OfflinePlayer player = Bukkit.getOfflinePlayer(uuid);
		return player;
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public void setHp(int hp) {
		HpUpdateEvent event = new HpUpdateEvent(getPlayer(), this.hp, hp);
		Bukkit.getPluginManager().callEvent(event);
		
		this.hp = event.getTo();
	
	}
	public void setintelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public void setMind(int mind) {
		this.mind = mind;
	}
}
