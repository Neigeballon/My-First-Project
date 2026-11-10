package quest;
import static quest.Quest.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class MagicTorpedo {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        charChoice = 'A';
        choice = '\0';
        System.out.println("Choose an enemy to target with your Magic Torpedo!");
        for (Enemy e : enemies) {
            if (e.eCHP > 0) {
                System.out.println(charChoice+". "+e.eName+".");
                e.eChar = charChoice;
                charChoice++;
            }
        }
        while (true) {
            choice = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();
            if (choice >= 'A' && choice < charChoice) {
                for (Enemy e : enemies) {
                    if (e.eCHP > 0 && choice == e.eChar) {
                        roll = ThreadLocalRandom.current().nextInt(1, 7);
                        System.out.println("You rolled a "+roll+"!");
                        attackRoll = roll*cIntelligence+intBonus+attackBonus;
                        if (cSquare != e.eSquare) {
                            attackRoll += rangedModifier;
                        }
                        System.out.println("Your total attack roll is "+attackRoll+"!");
                        damageDealt = Math.max(0, e.eDefense-attackRoll);
                        System.out.println("You did a total of "+damageDealt+" damage to "+e.eName+", "+name+"!");
                        e.eCHP -= damageDealt;
                        if(e.eCHP <= 0){
                            System.out.println("Sizzling sear, "+name+"! You have killed "+e.eName+"! Great job!");
                        }
                        else{
                            System.out.println(e.eName+" is still alive! Keep torpedoing with that "+magicItemName+" of yours, "+name+"!");
                        }
                        if (cSquare != e.eSquare) {
                            attackRoll -= rangedModifier;
                        }
                    }
                }
                break;
            }
            else {
                System.out.println("That is not a valid target for your magic torpedo, "+name+". Try again.");
            }
        }
    }
}
