package quest;
import static quest.Quest.*;

public class DolphinsIntelligence {
    private static boolean didRage = false;
    private static boolean did2Sacrifice = false;
    public static void execute() {
        if (doRage) {
            didRage = true;
            cIntelligence += 1.5;
        }
        else if (do2Sacrifice) {
            cIntelligence += 2;
        }
        else {
            cIntelligence++;
        }
        System.out.println("You have been imbued with the Intelligence of a Dolphin, "+name+"! You now have "+cIntelligence+" points toward your Intelligence score. May your new Genius help you gain the Glory!");
    }
    public static void reset() {
        if (didRage) {
            cIntelligence -= 1.5;
        }
        else if (did2Sacrifice) {
            cIntelligence -= 2;
        }
        else if (dolphinsIntelligence) {
            cIntelligence--;
        }
    }
}
