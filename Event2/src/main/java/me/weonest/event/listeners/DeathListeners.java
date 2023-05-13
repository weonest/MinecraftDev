package me.weonest.event.listeners;

import me.weonest.event.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListeners implements Listener {

    // 생성자 주입
    private final Main main;

    public DeathListeners(Main main) {
        this.main = main;
    }

    @EventHandler
    void onPlayerDeath(PlayerDeathEvent event) {


    }
}
