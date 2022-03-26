package me.Neuxs.BowgensPlugin.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import me.Neuxs.BowgensPlugin.Plugin;

public class Death implements Listener{

	@SuppressWarnings("unused")
	private Plugin plugin;
	
	public Death(Plugin plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onJoin(PlayerDeathEvent e) {
		Bukkit.broadcastMessage("");
	}
}
