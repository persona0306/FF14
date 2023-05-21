package potato.ball.ff14;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

public class PlayerStats {
	private UUID uuid;
	private int maxhp;
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int intelligence;
	private int mind;
	private int crit;
	
	public PlayerStats(OfflinePlayer player, int maxhp, int atk, int def,
									 int intelligence, int mind, int crit) {
		
		uuid = player.getUniqueId();
		this.maxhp = maxhp;
		this.atk = atk;
		this.def = def;
		this.intelligence = intelligence;
		this.mind = mind;
		this.crit = crit;
		
		hp = maxhp;
		mp = 10000;
		
	}
	
	public int getMaxhp() {
		return maxhp;
	}
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	public int getAtk() {
		return atk;
	}
	public int getDef() {
		return def;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public int getMind() {
		return mind;
	}
	public int getCrit() {
		return crit;
	}
	
	public OfflinePlayer getPlayer() {
		OfflinePlayer player = Bukkit.getOfflinePlayer(uuid);
		return player;
		
	}
	
	public void setHp(int hp) {
		HpUpdateEvent event = new HpUpdateEvent(getPlayer(), this.hp, hp);
		Bukkit.getPluginManager().callEvent(event);
		
		this.hp = event.getTo();
		
	}
	
	public void setDef(int def) {

		DefUpdateEvent event = new DefUpdateEvent(getPlayer(), this.def, def);
		Bukkit.getPluginManager().callEvent(event);
		
		this.def = event.getTo();
		
	}
}
