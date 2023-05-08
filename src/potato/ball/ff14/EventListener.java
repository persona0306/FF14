package potato.ball.ff14;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class EventListener implements Listener {
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		//プレイヤーがクリックしたり感圧版を踏んだりしたときのイベント。
		//ここから処理を書く

		e.getPlayer().sendMessage("PlayerInteractEventが発動！ Action:" + e.getAction());

		//ここまで処理を書く
	}
	
	@EventHandler
	public void onDamageByEntity(EntityDamageByEntityEvent e) {

		if (!(e.getDamager() instanceof Player)) {
			return;
		}
		
		Player player = (Player)e.getDamager();
		
		PlayerData playerData = PlayerData.get(player);
		
		PlayerStats playerStats = playerData.getStats();
		
		e.setDamage(playerStats.getAtk());
		//ここまで処理を書く
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onHpUpdate(HpUpdateEvent e) {
		//プレイヤーがクリックしたり感圧版を踏んだりしたときのイベント。
		//ここから処理を書く

		if(!(e.getPlayer().isOnline())){
			return;
		
		}
		
		e.getPlayer().getPlayer().setMaxHealth(e.getTo()/50);
		

		//ここまで処理を書く
	}
}
