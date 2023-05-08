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
		
		PlayerStats playerStats = playerData.getStats();

		sender.sendMessage(""+ChatColor.GOLD+ChatColor.BOLD+ChatColor.UNDERLINE+"    ステータス    ");
		sender.sendMessage("\n"+ChatColor.WHITE+playerStats.getHp()+"  "+ChatColor.GOLD+ChatColor.BOLD+"HP");
		sender.sendMessage(("10000")+ChatColor.LIGHT_PURPLE+ChatColor.BOLD+" MP");
		sender.sendMessage(playerStats.getAtk()+"   "+ChatColor.DARK_RED+ChatColor.BOLD+"ATK");
		sender.sendMessage(playerStats.getDef()+"   "+ChatColor.BLUE+ChatColor.BOLD+"DEF");
		sender.sendMessage(playerStats.getIntelligence()+"   "+ChatColor.DARK_PURPLE+ChatColor.BOLD+" INT  ");
		sender.sendMessage(playerStats.getMind()+"   "+ChatColor.GREEN+ChatColor.BOLD+" MND  ");


		return true;
	}
}
