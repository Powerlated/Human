package humansimulator;

import java.util.HashSet;

public class Human extends SimulationObject implements Tickable {
    long age;
    private boolean dead = false;
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
        Human h = new Human();
        h.setType(type);
        return h;
    }

    public HashSet<Human> getHumans() {
        return humans;
    }

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
        if (!dead) {
            age++;
            if (age >= 1200) {
                dead = true;
            }
        }
    }

    public enum Type {
        MALE, FEMALE, OTHER
    }
}
