package me.danny.template;

import org.bukkit.plugin.java.JavaPlugin;

public final class PluginTemplate extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("Enabled");
	}

	@Override
	public void onDisable() {
		getLogger().info("Disabled");
	}

}
