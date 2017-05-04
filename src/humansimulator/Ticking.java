package humansimulator;

import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;

public class Ticking {
    private static int tickCount = 0;

    private static boolean ticking = false;
    private static boolean paused = false;
    private static HashSet<Tickable> tickingObjects = new HashSet<Tickable>();

    private static Runnable tick = () -> {
        if (!paused) {
            tickCount++;
            for (Tickable tickable : tickingObjects) {
                tickable.onTick();
            }
        }
    };

    /**
     * Registers an object for ticking.
     */
    public static void register(SimulationObject so) {
        tickingObjects.add(so);
    }

    /**
     * Starts ticking.
     */
    public static void startTicking() {
        if (!ticking) {
            Timer timer = new Timer();
            timer.schedule((TimerTask) tick, 50);
        }
    }

    /**
     * Returns how many ticks have passed since the simulation started.
     */
    public static int getTickCount() {
        return tickCount;
    }

    /**
     * Returns if ticking is active.
     */
    public static boolean isTicking() {
        return ticking;
    }

    /**
     * Set if ticking is paused.
     */
    public static void setPaused(boolean paused) {

    }

    // Internal tick pausing
    private static void pauseTicking() {
        if (paused) {
            paused = true;
            System.out.println("Ticking paused.");
        } else {
            System.out.println("Ticking is already paused!");
        }
    }

    // Internal tick unpausing
    private static void unpauseTicking() {
        if (!paused) {
            paused = false;
            System.out.println("Ticking unpaused.");
        } else {
            System.out.println("Ticking is already unpaused!");
        }
    }
}
