package it.einjojo.nucleoflex.api.player;


import java.util.UUID;

public interface PlayerEconomy {
    UUID playerUuid();
    /**
     * @return the balance of the player.
     */
    long balance();

    /**
     * @param amount the amount to set the balance to.
     * @throws IllegalArgumentException if the amount is negative.
     */
    void setBalance(long amount);

    /**
     * @param amount the amount to add to the balance.
     * @throws IllegalArgumentException if the amount is negative.
     */
    void addBalance(long amount);

    /**
     * @param player the player to remove the balance from.
     * @param amount the amount to remove from the balance.
     * @throws IllegalArgumentException if the amount is negative.
     */
    void removeBalance(String player, long amount);
}
