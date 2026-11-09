package quest;

import static quest.Quest.*;
import java.util.*;

public class Travel {
    public static void execute() {
        t = terrains[row][column];
        Scanner scanner = new Scanner(System.in);
        choice = '\0';
        System.out.println(name+", you have finished exploring the "+t.encounterName+" biome! Press W, A, S, or D to move to a different adjacent square.");
        while (true) {
            choice = scanner.next().toUpperCase().charAt(0);
            if (choice == 'W' && row != 0) {
                row -= 1;
                t = terrains[row][column];
                break;
            }
            else if (choice == 'W') {
                System.out.println("You cannot move off of the map, "+name+". Try again.");
            }
            else if (choice == 'A' && column != 0) {
                column -= 1;
                t = terrains[row][column];
                break;
            }
            else if (choice == 'A') {
                System.out.println("You cannot move off of the map, "+name+". Try again.");
            }
            else if (choice == 'S' && row != 7 && !(column  == 7 && row == 6)) {
                row += 1;
                t = terrains[row][column];
                break;
            }
            else if (choice == 'S') {
                System.out.println("Sorry, "+name+". You can't move off of the map or into the GLORY until you enter the ASCENSION.");
            }
            else if (choice == 'D' && column != 7 && !(row == 7 && column == 6)) {
                column += 1;
                t = terrains[row][column];
                break;
            }
            else if (choice == 'D') {
                System.out.println("Sorry, "+name+". You can't move off of the map or into the GLORY until you enter the ASCENSION.");
            }
            else {
                System.out.println("That key you pressed leads you nowhere, "+name+". Try again.");
            }
        }
    }
}
