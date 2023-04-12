package pl.panszelescik.scheduler.api;

public interface IScheduler {

    void scheduleSyncDelayedTask(final Runnable runnable);
}
