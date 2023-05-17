package updateEvents;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class IntUpdateEvent extends Event {
	private static final HandlerList handlers = new HandlerList();
	
	public static HandlerList getHandlerList() {
		return handlers;
	}
	
	private final OfflinePlayer player;
	private final int from ;
	private int to ;
	@Override
	public HandlerList getHandlers() {
    
		return handlers;
	}

	public IntUpdateEvent (OfflinePlayer player , int from , int to ) {
		this.player = player;
		this.from = from;
		this.to = to;
		
	}
	
	public int getFrom() {
		return from;
		
	}
	
	public OfflinePlayer getPlayer() {
		return player;
		
	}
	
	public int getTo() {
		return to;
		
	}
	
	public void setTo(int to) {
		this.to = to;
		
	}
	
}
