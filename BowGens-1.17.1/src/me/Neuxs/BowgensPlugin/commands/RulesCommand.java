package me.Neuxs.BowgensPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Neuxs.BowgensPlugin.Plugin;

public class RulesCommand implements CommandExecutor{

	@SuppressWarnings("unused")
	private Plugin plugin;
	
	public RulesCommand(Plugin plugin) {
		this.plugin = plugin;
		plugin.getCommand("rules").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Error : Not a Player");
			return true;
		}
		
		Player p = (Player) sender;
		
		if(p.hasPermission("nobody.use")) {
			p.sendMessage("Rules: \n 1. No Cheating/Exploiting of any kind. \n 2. No Spamming. \n 3. No Harrasment of any kind. \n 4. No Ban Baiting. \n 5. No Racial slurs. \n 6. No NSFW/sexual talk. \n 7. Be respectful. \n If any of these rules are broken you will be banned.");
			return true;
		} else {
			p.sendMessage("Rules: \n 1. No Cheating/Exploiting of any kind. \n 2. No Spamming. \n 3. No Harrasment of any kind. \n 4. No Ban Baiting. \n 5. No Racial slurs. \n 6. No NSFW/sexual talk. \n 7. Be respectful. \n If any of these rules are broken you will be banned.");
		}
		
		return false;
	}
}
