package humansimulator;

public class SimulationHandler {
    public static boolean started = false;

    public static void initiate() {
        started = true;
        House h = House.createHouse("First House");
        Human.newHuman(Human.Type.FEMALE).setHouse(h);
        Human.newHuman(Human.Type.MALE).setHouse(h);
    }
}
