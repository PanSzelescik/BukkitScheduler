package pl.panszelescik.scheduler;

import org.bukkit.plugin.java.JavaPlugin;
import pl.panszelescik.scheduler.api.IScheduler;
import pl.panszelescik.scheduler.bukkit.BukkitScheduler;
import pl.panszelescik.scheduler.folia.FoliaScheduler;

public class Scheduler {

    public static IScheduler createScheduler(final JavaPlugin plugin) {
        if (FoliaSupport.IS_ACTIVE) {
            return new FoliaScheduler(plugin);
        } else {
            return new BukkitScheduler(plugin);
        }
    }
}
