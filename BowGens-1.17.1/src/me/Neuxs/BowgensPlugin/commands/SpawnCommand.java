package me.Neuxs.BowgensPlugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Neuxs.BowgensPlugin.Plugin;

public class SpawnCommand implements CommandExecutor{

	@SuppressWarnings("unused")
	private Plugin plugin;
	
	public SpawnCommand(Plugin plugin) {
		this.plugin = plugin;
		plugin.getCommand("spawn").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Error : Not a Player");
			return true;
		}
		
		Player p = (Player) sender;
		
		if(sender instanceof Player) {
		    Location loc = new Location(Bukkit.getWorld("ul_world"), 0, 65, 0, 0, 0);
		    p.teleport(loc);
		    return true;
		}
		
		return false;
	}
}
