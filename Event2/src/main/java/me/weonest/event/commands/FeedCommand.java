package me.weonest.event.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;

            if (p.hasPermission("admin")) {
                p.setFoodLevel(20);
                p.sendMessage("배고픔 채우기");
            } else {
                p.sendMessage("admin 권한이 없습니다");
            }
        }
        return true;
    }
}
