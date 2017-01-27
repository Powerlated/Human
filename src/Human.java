import java.util.HashSet;

public class Human {
	private Type type;
	public HashSet<Human> humans = new HashSet<Human>();
	public enum Type {
		MALE, FEMALE, OTHER
	}
	
	public Human (Type t) {
		
	}
	
	public static void newHuman() {
		
	}
}
