package com.chillchila.xd;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ChillchilaProj extends JavaPlugin {
    ChillchilaProj instance;



    @Override
    public void onLoad(){
        System.out.println("Loading...");
        instance = this;
    }
    @Override
    public void onEnable(){
        this.getCommand("kit").setExecutor(new CommandKit());
        this.getCommand("hat").setExecutor(new CommandHat());
        this.getCommand("withers").setExecutor(new WitherStorm());
        Bukkit.getPluginManager().registerEvents(new Fly(), instance);
        Bukkit.getPluginManager().registerEvents(new DetectBlockBreak(), instance);

        System.out.println("Enabled");
    }
    @Override
    public void onDisable(){
        System.out.println("OK BYE");
    }

}
