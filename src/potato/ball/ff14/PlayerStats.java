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
	private int crit;
	
	public PlayerStats(OfflinePlayer player, int atk, int def, int maxhp, int intelligence, int mind, int crit) {
		uuid = player.getUniqueId();
		this.atk = atk;
		this.def = def;
		this.maxhp = maxhp;
		this.intelligence = intelligence;
		this.mind = mind;
		this.crit = crit;
		
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
	public int getCrit() {
		return crit;
	}
	public OfflinePlayer getPlayer() {
		OfflinePlayer player = Bukkit.getOfflinePlayer(uuid);
		return player;
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public void setDef(int def) {

		DefUpdateEvent event = new DefUpdateEvent(getPlayer(), this.def, def);
		Bukkit.getPluginManager().callEvent(event);
		
		this.def = event.getTo();
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
