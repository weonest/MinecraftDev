package me.weonest.event.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {



        // 위와 다른 방식으로 커맨드 등록
        if (sender instanceof Player) {
            Player p = (Player) sender;

            if (p.isInvulnerable()) {
                p.setInvulnerable(false);
                p.sendMessage("갓모드 해제");
            } else {
                p.setInvulnerable(true);
                p.sendMessage("갓모드 활성화");
            }

        }


        return true;
    }
}
