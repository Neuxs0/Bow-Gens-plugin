package me.Neuxs.BowgensPlugin;

import org.bukkit.plugin.java.JavaPlugin;

import me.Neuxs.BowgensPlugin.commands.PermBanCommand;
import me.Neuxs.BowgensPlugin.commands.RulesCommand;
import me.Neuxs.BowgensPlugin.commands.SpawnCommand;
import me.Neuxs.BowgensPlugin.commands.StaffCommand;
import me.Neuxs.BowgensPlugin.commands.TempBanCommand;
import me.Neuxs.BowgensPlugin.listeners.Banned;
import me.Neuxs.BowgensPlugin.listeners.Death;
import me.Neuxs.BowgensPlugin.listeners.Join;
import me.Neuxs.BowgensPlugin.listeners.Leave;
import me.Neuxs.BowgensPlugin.listeners.UnBanned;

public class Plugin extends JavaPlugin{

	@Override
	public void onEnable() {
		new RulesCommand(this);
		new SpawnCommand(this);
		new StaffCommand(this);
		new TempBanCommand(this);
		new PermBanCommand(this);
		
		new Join(this);
		new Leave(this);
		new Death(this);
		new Banned(this);
		new UnBanned(this);
	}
}
