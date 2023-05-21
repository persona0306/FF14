package jobs;

import java.util.HashMap;
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
	
	public void setInventory() {
		
		Player player = Bukkit.getPlayer(uuid);
		
		if (player == null) return;
		
		PlayerInventory inventory = player.getInventory();
		
		HashMap<Integer,ItemStack> inventoryContents = getInventoryContents();
		
		inventoryContents.forEach((slot, item)->{
		
		inventory.setItem(slot, item);
		
		});
	}
	
	protected abstract HashMap<Integer,ItemStack> getInventoryContents();
	
	public abstract PlayerStats getBaseStats();
	
	public OfflinePlayer getPlayer() {
		OfflinePlayer player = Bukkit.getOfflinePlayer(uuid);
		return player;
	}

	public abstract String getName();
	
	public abstract void action(int actionNumber);
	
}	
		
