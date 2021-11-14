package com.chillchila.xd;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Mob;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class DetectBlockBreak implements Listener {

    @EventHandler
    public void onBlockDestroy(BlockBreakEvent event) {
        if(event.getBlock().getType().name().equals("DIAMOND_BLOCK")){
            event.setCancelled(true);
            Location loc = event.getBlock().getLocation();
            ItemStack dia_block = new ItemStack(Material.DIAMOND_BLOCK);
            Item item = event.getPlayer().getWorld().dropItem(loc, dia_block);
            item.setVelocity(new Vector(0, 1, 0));
        }
    }
}
