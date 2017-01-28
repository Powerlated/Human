import java.util.HashSet;

public class Ticking {
	public HashSet<Tickable> ticking = new HashSet<Tickable>();
	public static void tick() {
		for (Tickable tickable : ticking) {
			tickable.onTick();
		}
	}
}
