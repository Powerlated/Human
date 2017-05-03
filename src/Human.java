import java.util.HashSet;
import java.util.Random;

public class Human {
    public HashSet<Human> humans = new HashSet<Human>();
    private Type type;
    private House house;

    private Human(Type type) {
        this.type = type;
    }

    private Human(Type type, House house) {
        this.type = type;

    }

    private Human(Type type, int house) {
        this.type = type;
    }

    /**
     * Makes a new human with a random type.
     *
     * @param b Random chance to be other.
     */
    public static Human newHuman(boolean b) {
        Random r = new Random();
        int other = r.nextInt(4);
        if (other == 0) {
            return new Human(Human.Type.OTHER);
        }
        int i = r.nextInt(1);
        if (i == 0) {
            return new Human(Human.Type.FEMALE);
        } else if (i == 1) {
            return new Human(Human.Type.MALE);
        }
        return null;
    }

    public static Human newHuman(Type type) {
        return new Human(type);
    }

    public Type getType() {
        return type;
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

    public enum Type {
        MALE, FEMALE, OTHER
    }
}
