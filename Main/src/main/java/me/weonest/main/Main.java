package me.weonest.main;

import me.weonest.main.commands.*;
import me.weonest.main.listeners.JoinLeaveEvent;
import me.weonest.main.listeners.SpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("###### 플러그인 정상 작동 #######");

        getCommand("fart").setExecutor(new FartCommand());
        getCommand("die").setExecutor(new DieCommand());
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("setspawn").setExecutor(new SetSpawnCommand(this));
        getCommand("spawn").setExecutor(new SpawnCommand(this));

        getServer().getPluginManager().registerEvents(new JoinLeaveEvent(), this);
        getServer().getPluginManager().registerEvents(new SpawnEvent(this), this);


        getConfig().options().copyDefaults();
        saveDefaultConfig();
        //d


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
