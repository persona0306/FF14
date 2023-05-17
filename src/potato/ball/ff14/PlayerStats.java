package potato.ball.ff14;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

import updateEvents.AtkUpdateEvent;
import updateEvents.CritUpdateEvent;
import updateEvents.DefUpdateEvent;
import updateEvents.HpUpdateEvent;
import updateEvents.IntUpdateEvent;
import updateEvents.MindUpdateEvent;
import updateEvents.MpUpdateEvent;

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
	
	public void setMp(int mp) {
		MpUpdateEvent event = new MpUpdateEvent(getPlayer(), this.mp, mp);
		Bukkit.getPluginManager().callEvent(event);
		
		this.mp = event.getTo();
	
	}
	
	public void setAtk(int atk) {
		
		AtkUpdateEvent event = new AtkUpdateEvent(getPlayer(), this.atk, atk);
		Bukkit.getPluginManager().callEvent(event);
		
		this.atk = event.getTo();
		
	}
	
	public void setDef(int def) {

		DefUpdateEvent event = new DefUpdateEvent(getPlayer(), this.def, def);
		Bukkit.getPluginManager().callEvent(event);
		
		this.def = event.getTo();
		
	}
	
	public void setIntelligence(int intelligence) {
		
		IntUpdateEvent event = new IntUpdateEvent(getPlayer(), this.intelligence, intelligence);
		Bukkit.getPluginManager().callEvent(event);
		
		this.intelligence = event.getTo();
		
	}
	
	public void setMind(int mind) {

		MindUpdateEvent event = new MindUpdateEvent(getPlayer(), this.mind, mind);
		Bukkit.getPluginManager().callEvent(event);
		
		this.mind = event.getTo();
		
		
	}
	
	public void setCrit(int crit) {

		CritUpdateEvent event = new CritUpdateEvent(getPlayer(), this.crit, crit);
		Bukkit.getPluginManager().callEvent(event);
		
		this.crit = event.getTo();
		
		
	}
}
