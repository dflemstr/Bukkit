
package org.bukkit;

import org.bukkit.plugin.PluginManager;

/**
 * Represents a server implementation
 */
public interface Server {
    /**
     * Gets the name of this server implementation
     *
     * @return name of this server implementation
     */
    public String getName();

    /**
     * Gets the version string of this server implementation.
     *
     * @return version of this server implementation
     */
    public String getVersion();

    /**
     * Gets a list of all currently logged in players
     *
     * @return An array of Players that are currently online
     */
    public Player[] getOnlinePlayers();

    /**
     * Gets the PluginManager for interfacing with plugins
     *
     * @return PluginManager for this Server instance
     */
    public PluginManager getPluginManager();

    /**
     * Gets a list of all worlds on this server
     *
     * @return An array of worlds
     */
    public World[] getWorlds();
}
