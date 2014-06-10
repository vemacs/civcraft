package com.avrgaming.civcraft.util;

import org.bukkit.entity.Player;
import org.kitteh.vanish.staticaccess.VanishNoPacket;
import org.kitteh.vanish.staticaccess.VanishNotLoadedException;

/**
 * Represents {@link VanishNoPacket}-related utility methods.
 */
public class VanishNoPacketUtil {

    /**
     * Checks if a {@link Player} is vanished.
     *
     * @param player player
     * @return whether the {@code player} is vanished
     */
    @SuppressWarnings("deprecation")
    public static boolean isVanished(Player player) {
        try {
            return VanishNoPacket.isVanished(player.getName());
        } catch (VanishNotLoadedException | NoClassDefFoundError e) {
            return false;
        }
    }
}
