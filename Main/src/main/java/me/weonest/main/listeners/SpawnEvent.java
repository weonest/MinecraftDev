package me.weonest.main.listeners;

import me.weonest.main.Main;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;


public class SpawnEvent implements Listener {

    private final Main main;

    public SpawnEvent(Main main) {
        this.main = main;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        Player p = event.getPlayer();

        if (!event.getPlayer().hasPlayedBefore()) {
            Location location = main.getConfig().getLocation("spawn");

            if (location != null) {
                p.teleport(location);
                p.sendMessage("스폰으로 이동합니다!");

            }
        }
    }

    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent event) {

        Location location = main.getConfig().getLocation("spawn");

        if (location != null) {
            event.setRespawnLocation(location);

        }
    }
}
