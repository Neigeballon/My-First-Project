package quest;
import static quest.Quest.*;

public class SnakesCharisma {
    private static boolean didRage = false;
    private static boolean did2Sacrifice = false;
    public static void execute() {
        if (doRage) {
            didRage = true;
            cCharisma += 1.5;
        }
        else if (do2Sacrifice) {
            cCharisma += 2;
        }
        else {
            cCharisma++;
        }
        System.out.println("You have been imbued with the Charisma of a Snake, "+name+"! You now have "+cCharisma+" points toward your Charisma score. May your new Eloquence help you gain the Glory!");
    }
    public static void reset() {
        if (didRage) {
            cCharisma -= 1.5;
        }
        else if (did2Sacrifice) {
            cCharisma -= 2;
        }
        else if (snakesCharisma) {
            cCharisma--;
        }
    }
}
