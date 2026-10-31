package quest;
import static quest.Quest.*;

public class LionsStrength {
    private static boolean didRage = false;
    public static void execute() {
        if (doRage) {
            didRage = true;
            cStrength += 1.5;
        }
        else {
            cStrength++;
        }
        System.out.println("You have been empowered with the Strength of a Lion, "+name+"! May your new power help you gain the Glory!");
    }
    public static void reset() {
        if (lionsStrength && didRage) {
            cStrength -= 1.5;
        }
        else if (lionsStrength) {
            cStrength--;
        }
    }
}
