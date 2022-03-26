package me.Neuxs.BowgensPlugin.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import me.Neuxs.BowgensPlugin.Plugin;
import me.Neuxs.BowgensPlugin.utils.Utils;

public class Leave implements Listener{

	private Plugin plugin;
	
	public Leave(Plugin plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onJoin(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		
		if (!p.hasPlayedBefore()) {
			Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("leave_message").replace("<player>", p.getName())));
		}
	}
}
