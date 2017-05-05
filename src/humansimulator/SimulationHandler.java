package humansimulator;

public class SimulationHandler {
    public static boolean started = false;
    public static Human prime1;
    public static Human prime2;
    public static void initiate() {
        started = true;
        House h = House.createHouse("First House");
        prime1 = Human.newHuman(Human.Type.FEMALE);
        prime2 = Human.newHuman(Human.Type.MALE);
        prime1.setHouse(h);
        prime2.setHouse(h);
    }
}
