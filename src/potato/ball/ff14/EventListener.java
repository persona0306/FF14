package potato.ball.ff14;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class EventListener implements Listener {
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		//プレイヤーがクリックしたり感圧版を踏んだりしたときのイベント。
		//ここから処理を書く

		e.getPlayer().sendMessage("PlayerInteractEventが発動！ Action:" + e.getAction());

		//ここまで処理を書く
	}
}
