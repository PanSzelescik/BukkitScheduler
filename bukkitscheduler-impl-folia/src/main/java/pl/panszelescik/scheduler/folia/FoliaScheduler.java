package pl.panszelescik.scheduler.folia;

import org.bukkit.plugin.java.JavaPlugin;
import pl.panszelescik.scheduler.api.IScheduler;

public class FoliaScheduler implements IScheduler {

    private final JavaPlugin plugin;

    public FoliaScheduler(final JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void scheduleSyncDelayedTask(final Runnable runnable) {
        this.plugin.getServer().getGlobalRegionScheduler().execute(this.plugin, runnable);
    }
}
