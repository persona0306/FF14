package potato.ball.ff14;

import java.util.List;

import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class UndeadHunter extends Job {
	private static final String jobName = ""+ChatColor.DARK_PURPLE+ChatColor.BOLD+"Undead"+
											ChatColor.GOLD+ChatColor.BOLD+"Hunter";

	public UndeadHunter(OfflinePlayer player) {
		super(player);
	}

	@Override
	public PlayerStats getBaseStats() {
		PlayerStats playerStats = new PlayerStats(getPlayer(),120, 60, 1000, 60, 60, 50);
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
