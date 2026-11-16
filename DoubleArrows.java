package quest;

import static quest.Quest.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class DoubleArrows {
  public static void execute() {
    for(Enemy e : enemies){
      if(e.eCHP >= 0 && choice == e.eChar){
        roll = Math.max(ThreadLocalRandom.current().nextInt(1, 7), ThreadLocalRandom.current().nextInt(1, 7));
        System.out.println("You rolled a "+roll+"!");
        attackRoll = roll*cDexterity+dexBonus+attackBonus+rangedModifier;
        System.out.println("Your total attack roll is "+attackRoll+"!");
        damageDealt = Math.max(0, attackRoll-e.eDefense);
        System.out.println("You did a total of "+damageDealt+" damage!");     
        e.eCHP = e.eCHP-damageDealt;
        if(e.eCHP <= 0){
          System.out.println("Duplo Doubles, "+name+"! You have killed "+e.eName+"! Dang!");
        }
        else{
          System.out.println(e.eName+" is still alive! Keep doubling up with those Double Arrows of yours, "+name+"!");
        }
        break;
      }
    }
  }
}
