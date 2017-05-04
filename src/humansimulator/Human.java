package humansimulator;

import java.util.HashSet;

public class Human extends SimulationObject implements Tickable {
    long age;

    private HashSet<Human> humans = new HashSet<Human>();
    private Type type;
    private House house;

    private Human() {
        super();
    }

    /**
     * Makes a new human with a random type.
     *
     * @param b Random chance to be other.
     */

    public static Human newHuman(Type type) {
        return new Human();
    }

    public HashSet<Human> getHumans() {
        return humans;
    }

    ]
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        if (this.house != null) {
            this.house.removeHuman(this);
        }

        house.addHuman(this);
    }

    @Override
    public void onTick() {
        age++;
    }

    public enum Type {
        MALE, FEMALE, OTHER
    }
}
