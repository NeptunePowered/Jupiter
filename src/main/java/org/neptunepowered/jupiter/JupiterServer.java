/*
 * This file is part of Jupiter, licensed under the MIT License (MIT).
 *
 * Copyright (c) Jamie Mansfield <https://github.com/jamierocks>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.neptunepowered.jupiter;

import com.google.common.base.Optional;
import net.canarymod.config.Configuration;
import org.spongepowered.api.Server;
import org.spongepowered.api.entity.player.Player;
import org.spongepowered.api.net.ChannelListener;
import org.spongepowered.api.net.ChannelRegistrationException;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.Texts;
import org.spongepowered.api.util.command.source.ConsoleSource;
import org.spongepowered.api.world.World;
import org.spongepowered.api.world.WorldCreationSettings;
import org.spongepowered.api.world.storage.ChunkLayout;
import org.spongepowered.api.world.storage.WorldProperties;

import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class JupiterServer implements Server {

    private final net.canarymod.api.Server server;

    public JupiterServer(net.canarymod.api.Server server) {
        this.server = server;
    }

    @Override
    public Collection<Player> getOnlinePlayers() {
        return null;
    }

    @Override
    public int getMaxPlayers() {
        return Configuration.getServerConfig().getMaxPlayers();
    }

    @Override
    public Optional<Player> getPlayer(UUID uniqueId) {
        return null;
    }

    @Override
    public Optional<Player> getPlayer(String name) {
        return null;
    }

    @Override
    public Collection<World> getWorlds() {
        return null;
    }

    @Override
    public Collection<WorldProperties> getUnloadedWorlds() {
        return null;
    }

    @Override
    public Collection<WorldProperties> getAllWorldProperties() {
        return null;
    }

    @Override
    public Optional<World> getWorld(UUID uniqueId) {
        return null;
    }

    @Override
    public Optional<World> getWorld(String worldName) {
        return null;
    }

    @Override
    public Optional<World> loadWorld(String worldName) {
        return null;
    }

    @Override
    public Optional<World> loadWorld(UUID uniqueId) {
        return null;
    }

    @Override
    public Optional<World> loadWorld(WorldProperties properties) {
        return null;
    }

    @Override
    public Optional<WorldProperties> getWorldProperties(String worldName) {
        return null;
    }

    @Override
    public Optional<WorldProperties> getWorldProperties(UUID uniqueId) {
        return null;
    }

    @Override
    public boolean unloadWorld(World world) {
        return false;
    }

    @Override
    public Optional<WorldProperties> createWorld(WorldCreationSettings settings) {
        return null;
    }

    @Override
    public boolean saveWorldProperties(WorldProperties properties) {
        return false;
    }

    @Override
    public ChunkLayout getChunkLayout() {
        return null;
    }

    @Override
    public int getRunningTimeTicks() {
        return server.getCurrentTick();
    }

    @Override
    public void broadcastMessage(Text message) {
        server.broadcastMessage(Texts.toLegacy(message));
    }

    @Override
    public Optional<InetSocketAddress> getBoundAddress() {
        return null;
    }

    @Override
    public boolean hasWhitelist() {
        return Configuration.getServerConfig().isWhitelistEnabled();
    }

    @Override
    public void setHasWhitelist(boolean enabled) {
        Configuration.getServerConfig().getFile().setBoolean("whitelist-enabled", enabled);
    }

    @Override
    public boolean getOnlineMode() {
        return Configuration.getServerConfig().isOnlineMode();
    }

    @Override
    public Text getMotd() {
        return Texts.of(Configuration.getServerConfig().getMotd());
    }

    @Override
    public void shutdown(Text kickMessage) {
        server.initiateShutdown(Texts.toLegacy(kickMessage));
    }

    @Override
    public ConsoleSource getConsole() {
        return null;
    }

    @Override
    public void registerChannel(Object plugin, ChannelListener listener, String channel)
            throws ChannelRegistrationException {

    }

    @Override
    public List<String> getRegisteredChannels() {
        return null;
    }
}
