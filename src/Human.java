import java.util.HashSet;
import java.util.Random;

public class Human {
	private Type type;
	private House house;
	public HashSet<Human> humans = new HashSet<Human>();

	public enum Type {
		MALE, FEMALE, OTHER
	}

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
	 * @param b
	 * Random chance to be other.
	 *
	 */
	public static void newHuman(boolean b) {
		Random r = new Random();
		int other = r.nextInt(4);
		if (other == 0) {
			new Human(Human.Type.OTHER);
			return;
		}
		int i = r.nextInt(1);
		if (i == 0) {
			new Human(Human.Type.FEMALE);
		} else if (i == 1) {

			new Human(Human.Type.MALE);
		}
	}

	public static void newHuman(Type type) {
		new Human(type);
	}

	public Type getType() {
		return type;
	}
	
	public House getHouse() {
		return house;
	}
}
