package commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Command_Job_list implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command command, String index, String[] args) {
		//コマンド「/ff」を打ったときの処理。
		//argsにコマンドの続きが入る。
		//例： /ff args[0] args[1] args[2] ...

		sender.sendMessage(""+ChatColor.AQUA+ChatColor.BOLD+ChatColor.UNDERLINE+
				"_______________________");
		
		sender.sendMessage("            "+ChatColor.BOLD+"ジョブ一覧");
		
		sender.sendMessage("");
		sender.sendMessage("\n            "+
				            ChatColor.BLUE+ChatColor.BOLD+
							ChatColor.UNDERLINE+"  タンク  ");
		
		sender.sendMessage("\n"+ChatColor.YELLOW+ChatColor.BOLD+"Paladin");
		
		
		sender.sendMessage("");
		sender.sendMessage("\n           "+
							ChatColor.GREEN+ChatColor.BOLD+
							ChatColor.UNDERLINE+"  ヒーラー  ");
		
		sender.sendMessage("\n"+ChatColor.LIGHT_PURPLE+ChatColor.BOLD+"Magic"+
							ChatColor.GREEN+ChatColor.BOLD+"Doctor");
		
		
		sender.sendMessage("");
		sender.sendMessage("\n           "+
							ChatColor.DARK_RED+ChatColor.BOLD+
							ChatColor.UNDERLINE+"  ダメージ  ");
		
		
		sender.sendMessage("\n"+ChatColor.RED+ChatColor.UNDERLINE+" 近接 ");
		
		sender.sendMessage("\n"+ChatColor.DARK_PURPLE+ChatColor.BOLD+"Undead"+
							ChatColor.GOLD+ChatColor.BOLD+"Hunter");
		
		
		sender.sendMessage("\n"+ChatColor.AQUA+ChatColor.UNDERLINE+" 遠隔 ");
		
		sender.sendMessage("\n"+ChatColor.AQUA+ChatColor.BOLD+"Pixie"
							+ChatColor.YELLOW+ChatColor.BOLD+"Archer");
		
		
		sender.sendMessage("\n"+ChatColor.LIGHT_PURPLE+ChatColor.UNDERLINE+" 魔法 ");
		
		
		
		
		sender.sendMessage(""+ChatColor.AQUA+ChatColor.BOLD+ChatColor.UNDERLINE+
				"_______________________");

		return true;
	}
}
