package potato.ball.ff14;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_JobChange implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command command, String index, String[] args) {
		//コマンド「/ff」を打ったときの処理。
		//argsにコマンドの続きが入る。
		//例： /ff args[0] args[1] args[2] ...
		if (args.length == 0) {
			sender.sendMessage("ジョブを入れてください");
			return true;
		}
		
		Player player = (Player)sender;
		
		Job job;
		if (args[0].equalsIgnoreCase("Knight")) {
			job = new Knight(player);
		}else if (args[0].equalsIgnoreCase("MagicDoctor")) {
			job = new MagicDoctor(player);
		}else {
			sender.sendMessage("そのジョブは存在しません");
			sender.sendMessage("\nジョブ一覧");
			sender.sendMessage("\nKnight");
			sender.sendMessage("MagicDoctor");
			return true;
		}
		
		PlayerData.get(player).setJob(job);
		return true;
	}
}
