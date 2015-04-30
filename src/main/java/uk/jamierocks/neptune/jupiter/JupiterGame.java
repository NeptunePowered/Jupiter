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
package uk.jamierocks.neptune.jupiter;

import org.spongepowered.api.Game;
import org.spongepowered.api.GameRegistry;
import org.spongepowered.api.MinecraftVersion;
import org.spongepowered.api.Platform;
import org.spongepowered.api.Server;
import org.spongepowered.api.plugin.PluginManager;
import org.spongepowered.api.service.ServiceManager;
import org.spongepowered.api.service.command.CommandService;
import org.spongepowered.api.service.event.EventManager;
import org.spongepowered.api.service.scheduler.AsynchronousScheduler;
import org.spongepowered.api.service.scheduler.SynchronousScheduler;
import org.spongepowered.api.world.TeleportHelper;

public class JupiterGame implements Game {

    private final MinecraftVersion minecraftVersion;
    private final Server sever;

    public JupiterGame(net.canarymod.api.Server server) {
        this.sever = new JupiterServer(server);
        this.minecraftVersion = new JupiterMinecraftVersion(server.getServerVersion());
    }

    @Override
    public Platform getPlatform() {
        return Platform.SERVER;
    }

    @Override
    public Server getServer() {
        return sever;
    }

    @Override
    public PluginManager getPluginManager() {
        return null;
    }

    @Override
    public EventManager getEventManager() {
        return null;
    }

    @Override
    public GameRegistry getRegistry() {
        return null;
    }

    @Override
    public ServiceManager getServiceManager() {
        return null;
    }

    @Override
    public SynchronousScheduler getSyncScheduler() {
        return null;
    }

    @Override
    public AsynchronousScheduler getAsyncScheduler() {
        return null;
    }

    @Override
    public CommandService getCommandDispatcher() {
        return null;
    }

    @Override
    public String getApiVersion() {
        return null;
    }

    @Override
    public String getImplementationVersion() {
        return null;
    }

    @Override
    public MinecraftVersion getMinecraftVersion() {
        return minecraftVersion;
    }

    @Override
    public TeleportHelper getTeleportHelper() {
        return null;
    }
}
