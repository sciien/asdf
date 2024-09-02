package net.sci.akdm;

import net.sci.akdm.listeners.Movement;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic


        getServer().getPluginManager().registerEvents(new Movement(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
