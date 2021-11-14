package com.chillchila.xd;

import org.bukkit.plugin.java.JavaPlugin;

public class ChillchilaProj extends JavaPlugin {
    @Override
    public void onLoad(){
        System.out.println("Loading...");
    }
    @Override
    public void onEnable(){
        System.out.println("Enabled");
    }
    @Override
    public void onDisable(){
        System.out.println("OK BYE");
    }

}
