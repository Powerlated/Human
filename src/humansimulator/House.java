package humansimulator;

import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;

public class House extends LivingSpace {
    public static HashSet<House> houses = new HashSet<House>(1000);
    private HashSet<Human> humans = new HashSet<Human>();
    private int id;
    private String name;

    private House() {
        boolean b = true;
        while (b) {
            int i = ThreadLocalRandom.current().nextInt(1, 1000 + 1);
            if (!exists(i)) {
                System.out.println("New house created with randomly generated ID: " + i);
                System.out.println("Name of house set to randomly generated ID");
                name = Integer.toString(i);
                return;
            }
            System.out.println("Retrying creation of house with random ID, conflict with ID: " + i);
        }
    }

    /**
     * Creates a new house and sets its name.
     */
    public static House createHouse(String name) {
        if (houses.size() >= 1000) {
            System.out.println("Error: Houses up to capacity!");
            return null;
        }
        House house = new House();
        house.setName(name);
        return house;
    }

    /**
     * Checks if a house already has a specified ID.
     */
    public static boolean exists(int id) {
        for (House house : houses) {
            if (id == house.id) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a house already has a specified name.
     */
    public static boolean exists(String s) {
        for (House house : houses) {
            if (s.equals(house.name)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets the house with the provided id.
     */
    public static House get(int i) {
        for (House house : houses) {
            if (i == house.id) {
                return house;
            }
        }
        return null;
    }

    /**
     * Gets the house with the provided name.
     */
    public static House get(String s) {
        for (House house : houses) {
            if (s.equals(house.name)) {
                return house;
            }
        }
        return null;
    }

    /**
     * Creates a new house with the name being the ID
     */
    public House createHouse() {
        if (houses.size() >= 1000) {
            System.out.println("Error: Houses up to capacity!");
            return null;
        }
        return new House();
    }

    /**
     * Sets a house's name.
     */
    public boolean setName(String name) {
        if (!exists(name)) {
            System.out.println("House ID " + id + "'s name has been set to: " + name);
            return true;
        } else {
            System.out.println("The name, " + name + " conflicts with ID " + get(name));
            return false;
        }
    }

    public HashSet<Human> getHumans() {
        return humans;
    }

    public void addHuman(Human human) {
        humans.add(human);
    }

    public void removeHuman(Human human) {
        humans.remove(human);
    }
}
