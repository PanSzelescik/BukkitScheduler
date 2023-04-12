package pl.panszelescik.scheduler;

public class FoliaSupport {

    public static final boolean IS_ACTIVE;

    static {
        boolean active = false;
        try {
            Class.forName("io.papermc.paper.threadedregions.scheduler.RegionScheduler");
            active = true;
        } catch (ClassNotFoundException ignored) {
        }
        IS_ACTIVE = active;
    }
}
