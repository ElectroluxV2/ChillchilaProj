package com.chillchila.xd;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Fly implements Listener {
    @EventHandler
    public void move(PlayerMoveEvent e) {

        final Player p = e.getPlayer();

        if (p.isFlying()) {
            if(!p.isOp()) {
                p.setAllowFlight(false);
                p.sendMessage("§cYou cannot fly!");
            }
        }
    }
}
