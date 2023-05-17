package potato.ball.ff14;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class None extends Job {
	private static final String jobName = ""+ChatColor.GRAY+"none";
	
	private static final ArrayList<ItemStack> hotbarContents = new ArrayList<>();
	
	static {
		
	}

	public None(OfflinePlayer player) {
		super(player);
	}

	@Override
	public PlayerStats getBaseStats() {
		PlayerStats playerStats = new PlayerStats(getPlayer(),100, 10, 10, 10, 10, 10);
		return playerStats;
	}

	public String getName() {
		return jobName;
	
	}

	@Override
	protected List<ItemStack> getHotbarContents() {
		
		return hotbarContents;
	}

	@Override
	public void action(int actionNumber) {
		
		if (!getPlayer().isOnline()) return;
		
		Player player = getPlayer().getPlayer();
		
		if(actionNumber == 1) {

				
		}
		
		if(actionNumber == 2) {
			
		
		}
	}
}

