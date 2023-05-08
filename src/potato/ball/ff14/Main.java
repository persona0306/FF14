package potato.ball.ff14;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public static Main instance;

	public static Main getInstance() {
		return instance;
	}

	public Main(){
		instance = this;
	}

	@Override
	public void onDisable() {
		super.onDisable();

	}

	@Override
	public void onEnable() {
		super.onEnable();

		PluginManager pm = getServer().getPluginManager();

		pm.registerEvents(new EventListener(), this);

		getCommand("ff").setExecutor(new Command_FF());
		
		getCommand("stats").setExecutor(new Command_Stats());
	}

}
