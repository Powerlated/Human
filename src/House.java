
import java.util.ArrayList;
import java.util.HashSet;

public class House extends LivingSpace {
	public static ArrayList<House> houses = new ArrayList<House>();
	private HashSet<Human> humans = new HashSet<Human>();
	
	public House() {
		houses.add(this);
	}
	
	public House(Human human) {
		houses.add(this);
		humans.add(human);
	}
	
	boolean onFire;
	public HashSet<Human> getHumans() {
		return humans;
	}
	
	public void addHuman(Human human) {
		humans.add(human);
	}
}
