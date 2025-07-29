package io.github.ialexvoss.fm;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class TestPaperPlugin extends JavaPlugin implements Listener {
    @Override
    public void onEnable(){

        getLogger().info("Plugin is Enabled");

        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable(){
        getLogger().info("Plugin is Disabled");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage(Component.text("Hello, " + event.getPlayer().getName() + "!"));
    }

}