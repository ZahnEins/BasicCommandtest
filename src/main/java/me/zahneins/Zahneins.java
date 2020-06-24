package me.zahneins;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class Zahneins extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage( ChatColor.GREEN + "ปลั๊กอินทำงานว้อย");
    }

    @Override
    public void onDisable() {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player =(Player) sender;

        //เทสไอเทม Ez command
        if(command.getName().equals("Test")){
            ItemStack itemStack = new ItemStack(Material.DIAMOND);
            ItemMeta itemMeta = itemStack.getItemMeta();
            itemMeta.setDisplayName("Test Item");
            itemStack.setItemMeta(itemMeta);
            player.getInventory().addItem(itemStack);
        }

        return true;
    }
}
