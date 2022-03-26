package me.Neuxs.BowgensPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Neuxs.BowgensPlugin.Plugin;

public class PermBanCommand implements CommandExecutor{

	@SuppressWarnings("unused")
	private Plugin plugin;
	
	public PermBanCommand(Plugin plugin) {
		this.plugin = plugin;
		plugin.getCommand("ban-perm").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Error : Not a Player");
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
