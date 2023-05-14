package potato.ball.ff14;

import java.util.List;

import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class MagicDoctor extends Job {
	private static final String jobName = ""+ChatColor.LIGHT_PURPLE+ChatColor.BOLD+"Magic"+
											ChatColor.GREEN+ChatColor.BOLD+"Doctor";

	public MagicDoctor(OfflinePlayer player) {
		super(player);
	}
	
	@Override
	public PlayerStats getBaseStats() {
		PlayerStats playerStats = new PlayerStats(getPlayer(),40, 80, 500, 60, 120, 50);
		return playerStats;
	}
	
	public String getName() {
		return jobName;
	
	}

	@Override
	protected List<ItemStack> getHotbarContents() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void action(int actionNumber) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
