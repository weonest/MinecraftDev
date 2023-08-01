package me.weonest.main.commands;

import me.weonest.main.Main;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {

    private Main main;

    public SpawnCommand(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p) {

            Location location = main.getConfig().getLocation("spawn");

            if (location != null) {
                p.teleport(location);
                p.sendMessage("스폰으로 이동하셨습니다!");

            }else {
                p.sendMessage("스폰 좌표가 설정되어있지 않습니다!");
            }
        }
        return true;
    }
}
