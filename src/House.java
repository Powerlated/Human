
import java.util.ArrayList;
import java.util.HashSet;

public class House extends LivingSpace {
	public static ArrayList<House> houses = new ArrayList<House>();
	HashSet<Human> humans = new HashSet<Human>();
	int id;

	House(boolean b) {
		
		if (b == true) {
			houses.add(this);
		}
	}
	
	House(boolean b, int i) throws HouseIdConflictException {
		if (b == true) {
			for (House house : houses) {
				if (house.id == i) {
					throw new HouseIdConflictException(i);
				}
			}
		}
		
	}

	public static House newHouse() {
		return new House(true);
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
