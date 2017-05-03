
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class House extends LivingSpace {
    public static HashSet<House> houses = new HashSet<House>(1000);
    private HashSet<Human> humans = new HashSet<Human>();
    private int id;
    private String name;

    House() {
        boolean b = true;
        while (b) {
            int i = ThreadLocalRandom.current().nextInt(1, 2000 + 1);
            if (!exists(i)) {
                System.out.println("New house created with randomly generated ID: " + i);
                System.out.println("Name of house set to randomly generated ID");
                name = Integer.toString(i);
                return;
            }
            System.out.println("Retrying creation of house with random ID, conflict with ID: " + i);
        }
    }

	/**Sets a house's name.*/
    public boolean setName(String s) {
        if (!exists(s)) {
            System.out.println("House ID " + id
        } else {

        }
    }

    /**Checks if a house already has a specified ID.*/
	public static boolean exists(int i) {
		for (House house : houses) {
			if (i == house.id) {
				return true;
			}
		}
		return false;
	}

    /**Checks if a house already has a specified name.*/
	public static boolean exists(String s) {
		for (House house : houses) {
			if (s.equals(house.name)) {
				return true;
			}
		}
		return false;
	}

    /**Gets the house with the provided id.*/
	public static House get(int i) {
		for (House house : houses) {
			if (i == house.id) {
				return house;
			}
		}
		return null;
	}

    /**Gets the house with the provided name.*/
	public static House get(String s) {
		for (House house : houses) {
			if (s.equals(house.name)) {
				return house;
			}
		}
		return null;
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
