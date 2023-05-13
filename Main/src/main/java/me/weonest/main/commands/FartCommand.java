package me.weonest.main.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FartCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p) {

            if (args.length == 0) {
                p.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "독한 방귀를 뀌셨습니다");
                p.setHealth(1);
            } else {
                String playerName = args[1];
                Player target = Bukkit.getPlayerExact(playerName);

                if (target != null) {
                    p.sendMessage("대상에게 방귀를 선물하였습니다");
                    target.sendMessage(p.getDisplayName() + ChatColor.DARK_RED + "" + ChatColor.BOLD + " 님에게 방귀를 선물받았습니다");
                    target.setHealth(1);

                }
            }
        }



        return true;
    }
}
