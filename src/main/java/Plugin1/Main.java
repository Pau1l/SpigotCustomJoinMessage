package Plugin1;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("This is a console log used for debugging");
        getServer().getPluginManager().registerEvents(new EventLstnr(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
