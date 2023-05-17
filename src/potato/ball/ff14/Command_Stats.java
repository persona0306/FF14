package potato.ball.ff14;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_Stats implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command command, String index, String[] args) {
		//コマンド「/ff」を打ったときの処理。
		//argsにコマンドの続きが入る。
		//例： /ff args[0] args[1] args[2] ...
		
		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.DARK_RED+"※プレイヤー専用コマンド※");
		}
		
        Player player = (Player)sender;
		
		PlayerData playerData = PlayerData.get(player);
		
		Job playerJob = playerData.getJob();
		
		PlayerStats playerStats = playerData.getStats();
		
		String jobName = playerJob.getName();
		
		

		sender.sendMessage(""+ChatColor.AQUA+ChatColor.BOLD+ChatColor.UNDERLINE+
							"_______________________");
		
		sender.sendMessage("\n"+ChatColor.WHITE+ChatColor.BOLD+player.getName() +"'s Stats");
		
		sender.sendMessage("\n"+ChatColor.GRAY+("your current job is  ")+playerJob.getName());
		
		sender.sendMessage("\n      "+ChatColor.GOLD+ChatColor.BOLD+"HP"+
							ChatColor.LIGHT_PURPLE+ChatColor.BOLD+"        MP");
		
		sender.sendMessage("        "+ChatColor.WHITE+playerStats.getHp()+
							"        "+playerStats.getMp());
		
		sender.sendMessage("      "+ChatColor.DARK_RED+ChatColor.BOLD+"ATK"+
							ChatColor.BLUE+ChatColor.BOLD+"       DEF");
		
		sender.sendMessage("          "+ChatColor.WHITE+playerStats.getAtk()+
							"          "+playerStats.getDef());
		
		sender.sendMessage("      "+ChatColor.DARK_PURPLE+ChatColor.BOLD+"INT"+
							ChatColor.GREEN+ChatColor.BOLD+"      MIND");
		
		sender.sendMessage("          "+ChatColor.WHITE+playerStats.getIntelligence()+
							"          "+playerStats.getMind());
		
		sender.sendMessage("      "+ChatColor.YELLOW+ChatColor.BOLD+"CRT");
		
		sender.sendMessage("          "+ChatColor.WHITE+playerStats.getCrit());
		
		sender.sendMessage(""+ChatColor.AQUA+ChatColor.BOLD+ChatColor.UNDERLINE+
							"_______________________");

		return true;
	}
}
