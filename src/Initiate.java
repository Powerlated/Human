import java.util.Arrays;
import java.util.Collections;

public class Initiate {
	public static void main(String[] args) {
		House h = House.newHouse("First House");
		Human.newHuman(Human.Type.FEMALE).setHouse(h);
		Human.newHuman(Human.Type.MALE).setHouse(h);
	}
}
