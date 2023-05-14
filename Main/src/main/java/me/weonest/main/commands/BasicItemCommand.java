package me.weonest.main.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class BasicItemCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        Inventory inventory = Bukkit.createInventory(p, 9, ChatColor.RED + "기본장비");

        ArrayList<String> lore = new ArrayList<>();
        lore.add("서버에서 제공하는");
        lore.add("기본 장비입니다");
        
        ItemStack basic1 = new ItemStack(Material.IRON_PICKAXE, 1);
        ItemStack basic2 = new ItemStack(Material.IRON_SWORD, 1);
        ItemStack basic3 = new ItemStack(Material.IRON_AXE, 1);
        ItemStack basic4 = new ItemStack(Material.IRON_SHOVEL, 1);

        // 아이템 메타 정보
        ItemMeta basicMeta1 = basic1.getItemMeta();
        basicMeta1.setDisplayName(ChatColor.GREEN + "곡괭이");
        basicMeta1.setLore(lore);
        basic1.setItemMeta(basicMeta1);

        ItemMeta basicMeta2 = basic2.getItemMeta();
        basicMeta2.setDisplayName(ChatColor.GREEN + "검");
        basicMeta2.setLore(lore);
        basicMeta2.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        basic2.setItemMeta(basicMeta2);

        ItemMeta basicMeta3 = basic3.getItemMeta();
        basicMeta3.setDisplayName(ChatColor.GREEN + "도끼");
        basicMeta3.setLore(lore);
        basic3.setItemMeta(basicMeta3);

        ItemMeta basicMeta4 = basic4.getItemMeta();
        basicMeta4.setDisplayName(ChatColor.GREEN + "삽");
        basicMeta4.setLore(lore);
        basic4.setItemMeta(basicMeta4);

        inventory.setItem(0, basic1);
        inventory.setItem(1, basic2);
        inventory.setItem(2, basic3);
        inventory.setItem(3, basic4);
        
        // 명령어로 열리기 때문에 여기서 모든 아이템 등록 후 플레이어가 열기
        p.openInventory(inventory);


        return true;
    }
}
