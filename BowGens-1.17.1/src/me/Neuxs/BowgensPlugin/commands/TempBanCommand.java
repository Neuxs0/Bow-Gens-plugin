package me.Neuxs.BowgensPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Neuxs.BowgensPlugin.Plugin;

public class TempBanCommand implements CommandExecutor{

	@SuppressWarnings("unused")
	private Plugin plugin;
	
	public TempBanCommand(Plugin plugin) {
		this.plugin = plugin;
		plugin.getCommand("ban-temp").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			
			return true;
		}
		
		Player p = (Player) sender;
		
		if(p.hasPermission("ban.use")) {
			
			return true;
		} else {
			
		}
		
		return false;
	}
}
