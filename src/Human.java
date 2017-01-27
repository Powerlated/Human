import java.util.HashSet;
import java.util.Random;

public class Human {
	private Type type;
	public HashSet<Human> humans = new HashSet<Human>();
	public enum Type {
		MALE, FEMALE, OTHER
	}
	
	public Human (Type t) {
		
	}
	
	public static void newHuman() {
		Random r = new Random();
		int i = r.nextInt(1);
		if (i == 0) {
			new Human(Human.Type.FEMALE);
		} else if (i == 1) {
			int other = r.nextInt(4);
			if (other == 0){
				new Human(Human.Type.OTHER);
				return;
			}
			new Human(Human.Type.MALE);		
		}
	}
}
