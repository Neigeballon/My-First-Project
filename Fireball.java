package quest;
import static quest.Quest.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Fireball {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        charChoice = 'A';
        System.out.println("Choose which square to target with your fireball. You can only target a square with at least one enemy in it.");
        for (int i = 1; i < 5; i++) {
            final int square = i;
            if (enemies.stream().anyMatch(e -> e.eCHP > 0 && e.eSquare == square)) {
                for (Enemy e : enemies){
                    if (e.eCHP > 0 && e.eSquare == square) {
                        e.eChar = charChoice;
                    }
                }
                System.out.println(charChoice+". Target square #"+square+" with your fireball.");
                charChoice++;
            }
        }
        while (true) {
            choice = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();
            if (choice >= 'A' && choice < charChoice) {
                roll = ThreadLocalRandom.current().nextInt(1, 7);
                System.out.println("You rolled a "+roll+"!");
                attackRoll = roll*cIntelligence+intBonus+attackBonus;
                System.out.println("Your total attack roll is "+attackRoll+"!");
                for (Enemy e : enemies) {
                    if (choice == e.eChar) {
                        damageDealt = Math.max(0, attackRoll-e.eDefense);
                        System.out.println("You did a total of "+damageDealt+" damage to "+e.eName+"!");
                        e.eCHP = e.eCHP-damageDealt;
                        if(e.eCHP <= 0){
                            System.out.println("Fireblazing inferno, "+name+"! You have killed "+e.eName+"! Great job!");
                        }
                        else{
                            System.out.println(e.eName+" is still alive! Keep fireballing with that "+magicItemName+" of yours, "+name+"!");
                        }
                    }
                }
            }
            else {
                System.out.println("That is not a valid target, "+name+". Try again.");
            }
        }
    }
}
