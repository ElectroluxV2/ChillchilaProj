package com.chillchila.xd;

import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandKit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack diamond_axx = new ItemStack(Material.DIAMOND_AXE);
            ItemStack Totem = new ItemStack(Material.TOTEM_OF_UNDYING);
            // Create a new ItemStack (type: brick)
            ItemStack bricks = new ItemStack(Material.EMERALD_BLOCK);
            ItemStack Helmet = new ItemStack(Material.NETHERITE_HELMET);
            ItemStack Trident = new ItemStack(Material.TRIDENT);
            Trident.addUnsafeEnchantment(Enchantment.RIPTIDE, 200);
            Trident.addUnsafeEnchantment(Enchantment.MENDING, 69);
            // Set the amount of the ItemStack
            bricks.setAmount(64);
            diamond_axx.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2137);
            diamond_axx.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 255);
            Helmet.addUnsafeEnchantment(Enchantment.THORNS, 255);
            Helmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 255);
            Helmet.addUnsafeEnchantment(Enchantment.MENDING,69);
            // Give the player our items (comma-seperated list of all ItemStack)
            player.getInventory().clear();
            player.getInventory().addItem(bricks, diamond_axx, Trident);
            player.getInventory().setItemInOffHand(Totem);
            player.getInventory().setHelmet(Helmet);
        } else if (sender instanceof Server){
            System.out.println("YOU TRIED");
        }

        // If the player (or console) uses our command correct, we can return true
        return true;
    }
}
