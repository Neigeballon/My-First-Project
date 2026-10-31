package quest;
import static quest.Quest.*;

public class LionsStrength {
    private static boolean didRage = false;
    private static boolean did2Sacrifice = false;
    public static void execute() {
        if (doRage) {
            didRage = true;
            cStrength += 1.5;
        }
        else if (do2Sacrifice) {
            did2Sacrifice = true;
            cStrength += 2;
        }
        else {
            cStrength++;
        }
        System.out.println("You have been empowered with the Strength of a Lion, "+name+"! You now have "+cStrength+" points toward your Strength score. May your new power help you gain the Glory!");
    }
    public static void reset() {
        if (didRage) {
            cStrength -= 1.5;
        }
        else if (did2Sacrifice) {
            cStrength -= 2;
        }
        else if (lionsStrength) {
            cStrength--;
        }
        didRage = false;
        did2Sacrifice = false;
    }
}
