package jobs;

import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import potato.ball.ff14.PlayerStats;

public abstract class Job {
	
	private UUID uuid;
	
	public Job(OfflinePlayer player) {
		this.uuid = player.getUniqueId();
		
		
	}
	
	public void setHotbar() {
		
		Player player = Bukkit.getPlayer(uuid);
		
		if (player == null) return;
		
		PlayerInventory inventory = player.getInventory();
		
		List<ItemStack> hotbarContents = getHotbarContents();
		
		for(int i = 0; i < 9; i ++ ) {
			
			if (hotbarContents.size() < i + 1 ) break;
			
			ItemStack item = hotbarContents.get(i);
			
			inventory.setItem(i, item);
			
		}
		
	}
	
	protected abstract List<ItemStack> getHotbarContents();
	
	public abstract PlayerStats getBaseStats();
	
	public OfflinePlayer getPlayer() {
		OfflinePlayer player = Bukkit.getOfflinePlayer(uuid);
		return player;
	}

	public abstract String getName();
	
	public abstract void action(int actionNumber);
	
}	
		
