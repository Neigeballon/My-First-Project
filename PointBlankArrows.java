package quest;

import static quest.Quest.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class AcidArrows {
  public static void execute() {
    for(Enemy e : enemies){
      if(e.eCHP >= 0 && choice == e.eChar){
        roll = ThreadLocalRandom.current().nextInt(1, 7);
        System.out.println("You rolled a "+roll+"!");
        attackRoll = roll*cDexterity+dexBonus+attackBonus+meleeModifier;
        System.out.println("Your total attack roll is "+attackRoll+"!");
        damageDealt = Math.max(0, attackRoll-e.eDefense);
        System.out.println("You did a total of "+damageDealt+" damage!");     
        e.eCHP = e.eCHP-damageDealt;
        if(e.eCHP <= 0){
          System.out.println("Point-Blank Wipe, "+name+"! You have killed "+e.eName+"! Precise!");
        }
        else{
          System.out.println(e.eName+" is still alive! Keep pricking with those Point-Blank Arrows of yours, "+name+"!");
        }
        break;
      }
    }
  }
}
