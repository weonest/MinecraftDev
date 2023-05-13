package me.weonest.myfirstplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
public final class MyFirstPlugin extends JavaPlugin{

    @Override // 플러그인 시작 시
    public void onEnable() {
        // Plugin startup logic

        System.out.println("### 플러그인이 시작되었습니다 ###");

    }

    @Override // 플러그인 종료 시
    public void onDisable() {
        // Plugin shutdown logic


        System.out.println("### 플러그인이 종료되었습니다 ###");
    }
}
