package humansimulator;

public class SimulationHandler {
    public static void initiate() {
        House h = House.createHouse("First House");
        Human.newHuman(Human.Type.FEMALE).setHouse(h);
        Human.newHuman(Human.Type.MALE).setHouse(h);
    }
}
