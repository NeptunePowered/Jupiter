package uk.jamierocks.neptune.jupiter;

import org.spongepowered.api.MinecraftVersion;

public interface ProtocolMinecraftVersion extends MinecraftVersion {

    /**
     * The version of the Minecraft protocol in use
     *
     * @return the protocol version
     */
    int getProtocol();
}
