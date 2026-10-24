package quest;
import static quest.Quest.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class Handaxes{
     public static void execute(){
          char handaxesChoice = '\0';
          Scanner scanner = new Scanner(System.in);
          System.out.println("Choose another enemy to target with your other handaxe! If there is no other enemy in melee range, just choose the same one again *the damage will be applied twice*.");
          choiceChar = 'A';
          for(Enemy e : enemies){
          if(e.eCHP > 0 && cSquare == e.eSquare){
               System.out.println(choiceChar+". "+e.eName);
               e.eCharHandaxes = choiceChar;
               choiceChar++;
          }
          }
          while(true){
          handaxesChoice = scanner.next().toUpperCase().charAt(0);
          if(handaxesChoice >= 'A' && handaxesChoice < choiceChar){
               break;
          }
          else{
               System.out.println("That is not a valid enemy choice, "+name+". Try again.");
          }
          }
          for(Enemy e : enemies){
          if(choice == e.eChar){
               roll = ThreadLocalRandom.current().nextInt(1, 7);
               System.out.println("You rolled a "+roll+"!");
               attackRoll = roll*cStrength+strBonus+attackBonus;
               System.out.println("Your total attack roll is "+attackRoll+"!");
               damageDealt = Math.max(0, (attackRoll-e.eDefense)/2);
               System.out.println("You did a total of "+damageDealt+" damage to "+e.eName+"!");     
               e.eCHP = e.eCHP-damageDealt;
               if(e.eCHP <= 0){
                    System.out.println("Holy handling, "+name+"! You have killed "+e.eName+" with your first handaxe! Holy cow!");
               }
               else{
                    System.out.println(e.eName+" is still alive! Keep chopping with those holy handaxes of yours, "+name+"!");
               }
          }
          }
          for(Enemy e : enemies){
          if(handaxesChoice == e.eCharHandaxes){
               roll = ThreadLocalRandom.current().nextInt(1, 7);
               System.out.println("You rolled a "+roll+"!");
               attackRoll = roll*cStrength+strBonus+attackBonus;
               System.out.println("Your total attack roll is "+attackRoll+"!");
               damageDealt = Math.max(0, (attackRoll-e.eDefense)/2);
               System.out.println("With your second chop, you did a total of "+damageDealt+" damage to "+e.eName+"!");     
               e.eCHP = e.eCHP-damageDealt;
               if(e.eCHP <= 0){
                    System.out.println("Holy handling, "+name+"! You have killed "+e.eName+" with your second handaxe! Holy cow!");
               }
               else{
                    System.out.println(e.eName+" is still alive! Keep chopping with those holy handaxes of yours, "+name+"!");
               }
          }
          }
     }
}
