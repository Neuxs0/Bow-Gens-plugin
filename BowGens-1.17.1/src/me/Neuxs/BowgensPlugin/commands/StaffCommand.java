package me.Neuxs.BowgensPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Neuxs.BowgensPlugin.Plugin;
import me.Neuxs.BowgensPlugin.utils.Utils;

public class StaffCommand implements CommandExecutor{

	@SuppressWarnings("unused")
	private Plugin plugin;
	
	public StaffCommand(Plugin plugin) {
		this.plugin = plugin;
		plugin.getCommand("staff").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Error : Not a Player");
			return true;
		}
		
		Player p = (Player) sender;
		
		if(sender instanceof Player) { 
			p.sendMessage(Utils.chat("Staff \n Owner: \n Neuxs \n Builders: \n EnigmaWho \n monocasual"));
			return true;
		}
		
		return false;
	}
}
