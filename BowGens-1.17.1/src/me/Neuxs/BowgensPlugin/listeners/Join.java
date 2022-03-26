package me.Neuxs.BowgensPlugin.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.Neuxs.BowgensPlugin.Plugin;
import me.Neuxs.BowgensPlugin.utils.Utils;

public class Join implements Listener{

	private Plugin plugin;
	
	public Join(Plugin plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		if (!p.hasPlayedBefore()) {
			Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("join_message").replace("<player>", p.getName())));
		} else {
			Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("firstjoin_message").replace("<player>", p.getName())));
		    Location loc = new Location(Bukkit.getWorld("ul_world"), 10001, 65, 9999, 0, 0);
		    p.teleport(loc);
		}
	}
}
