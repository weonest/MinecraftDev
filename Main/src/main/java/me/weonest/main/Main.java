package me.weonest.main;

import me.weonest.main.commands.DieCommand;
import me.weonest.main.commands.FartCommand;
import me.weonest.main.commands.FeedCommand;
import me.weonest.main.events.JoinLeaveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("###### 플러그인 정상 작동 #######");

        getCommand("fart").setExecutor(new FartCommand());
        getCommand("die").setExecutor(new DieCommand());
        getCommand("feed").setExecutor(new FeedCommand());

        getServer().getPluginManager().registerEvents(new JoinLeaveEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
