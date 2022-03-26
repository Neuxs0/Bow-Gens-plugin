package me.Neuxs.BowgensPlugin.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandSendEvent;

import me.Neuxs.BowgensPlugin.Plugin;
import me.Neuxs.BowgensPlugin.utils.Utils;

public class UnBanned implements Listener{

	private Plugin plugin;
	
	public UnBanned(Plugin plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onPardon(PlayerCommandSendEvent e) {
		Player p = e.getPlayer();
		
		if (p.isBanned()) {
			
		} else{
			Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("unban_message").replace("<player>", p.getName())));
		}
	}
}
