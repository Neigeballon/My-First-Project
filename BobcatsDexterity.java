package quest;
import static quest.Quest.*;

public class BobcatsDexterity {
    private static boolean didRage = false;
    private static boolean did2Sacrifice = false;
    public static void execute() {
        if (doRage) {
            didRage = true;
            cDexterity += 1.5;
        }
        else if (do2Sacrifice) {
            cDexterity += 2;
        }
        else {
            cDexterity++;
        }
        System.out.println("You have been imbued with the Dexterity of a Bobcat, "+name+"! You now have "+cDexterity+" points toward your Dexterity score. May your new Agility help you gain the Glory!");
    }
    public static void reset() {
        if (didRage) {
            cDexterity -= 1.5;
        }
        else if (did2Sacrifice) {
            cDexterity -= 2;
        }
        else if (bobcatsDexterity) {
            cDexterity--;
        }
    }
}
