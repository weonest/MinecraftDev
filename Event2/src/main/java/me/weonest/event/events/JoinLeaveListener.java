package me.weonest.event.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if (!player.hasPlayedBefore()) {
            event.setJoinMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.GREEN + " 님이 이세계에 도착했습니다");
        }else {
            event.setJoinMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.GREEN + " 새로운 용사가 이세계에 소환됐습니다");
        }
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.RED + " 님이 현생으로 떠났습니다");
    }


}
