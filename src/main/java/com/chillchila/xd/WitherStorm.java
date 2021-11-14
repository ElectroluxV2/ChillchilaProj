package com.chillchila.xd;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class WitherStorm implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            Location loc = player.getLocation();
            for(int i = 0; i > 10; i++){
                player.getWorld().spawnEntity(loc, EntityType.WITHER);
            }

        }
        return true;
    }
}
