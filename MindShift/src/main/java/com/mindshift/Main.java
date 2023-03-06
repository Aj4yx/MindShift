package com.mindshift.mindshiftplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class Main extends JavaPlugin implements Listener {

    private Creeper creeper;
    private Zombie zombie;
    private Skeleton skeleton;

    @Override
    public void onEnable() {
        // Initialize the Creeper, Zombie, and Skeleton classes
        this.creeper = new Creeper();
        this.zombie = new Zombie();
        this.skeleton = new Skeleton();

        // Register event listeners
        getServer().getPluginManager().registerEvents(this, this);

        // Log that the plugin has been enabled
        getLogger().info("MindShift plugin enabled");
    }

    @Override
    public void onDisable() {
        // Log that the plugin has been disabled
        getLogger().info("MindShift plugin disabled");
    }

    // Event listener for when a Creeper explodes
    @EventHandler
    public void onCreeperExplode(EntityExplodeEvent event) {
        if (event.getEntity() instanceof Creeper) {
            // Code to modify the Creeper's explosion behavior
        }
    }

    // Command handler for the /mindshift command
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("mindshift")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;

                // Code to toggle MindShift on or off for the player
            } else {
                sender.sendMessage("Only players can use this command");
            }
            return true;
        }
        return false;
    }

}