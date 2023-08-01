package me.weonest.main.commands;

import me.weonest.main.Main;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawnCommand implements CommandExecutor {

    private Main main;

    public SetSpawnCommand(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p) {

            Location location = p.getLocation();

            main.getConfig().set("spawn", location);

            main.saveConfig();

            p.sendMessage("스폰지역을 설정합니다!");
        }

        return true;
    }
}
