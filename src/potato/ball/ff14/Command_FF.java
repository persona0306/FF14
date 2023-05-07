package potato.ball.ff14;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Command_FF implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command command, String index, String[] args) {
		//コマンド「/ff」を打ったときの処理。
		//argsにコマンドの続きが入る。
		//例： /ff args[0] args[1] args[2] ...

		sender.sendMessage("テストメッセージだよ");

		return true;
	}
}
