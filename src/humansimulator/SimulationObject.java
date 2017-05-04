package humansimulator;

/**
 * Created by Brian on 5/4/2017.
 */
public abstract class SimulationObject implements Tickable {
    public SimulationObject() {
        Ticking.register(this);
    }
}
