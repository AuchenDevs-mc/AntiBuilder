package me.craciu25yt.AntiBuilder;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public void onEnable() {
        System.out.println("[AntiBuilder] Enabled AntiBuilder v0.0.2");

        getServer().getPluginManager().registerEvents(new BlockBreak(), this);
        getServer().getPluginManager().registerEvents(new BlockPlace(), this);
    }
}
