package it.einjojo.nucleoflex.api.server;

import it.einjojo.nucleoflex.api.player.PlayerContainer;

import java.util.UUID;

/**
 * Server interface
 * Represents a server in the network
 */
public interface Server extends PlayerContainer {
    /**
     * @return the name of the server
     */
    String serverName();

    /**
     * @return the maximum amount of players that can be connected to the server
     */
    int maxPlayers();

    /**
     * Connects a player to the server
     * @param playerUniqueId the UUID of the player to connect
     */
    void connect(UUID playerUniqueId);

}
