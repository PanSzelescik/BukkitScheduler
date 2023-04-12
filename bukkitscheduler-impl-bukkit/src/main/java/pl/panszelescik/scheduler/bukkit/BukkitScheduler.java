package pl.panszelescik.scheduler.bukkit;

import org.bukkit.plugin.java.JavaPlugin;
import pl.panszelescik.scheduler.api.IScheduler;

public class BukkitScheduler implements IScheduler {

    private final JavaPlugin plugin;

    public BukkitScheduler(final JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void scheduleSyncDelayedTask(final Runnable runnable) {
        this.getServerScheduler().scheduleSyncDelayedTask(this.plugin, runnable);
    }

    private org.bukkit.scheduler.BukkitScheduler getServerScheduler() {
        return this.plugin.getServer().getScheduler();
    }
}
