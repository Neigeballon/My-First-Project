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
        attackRoll = roll*cDexterity+dexBonus+attackBonus+rangedModifier;
        System.out.println("Your total attack roll is "+attackRoll+"!");
        damageDealt = Math.max(0, attackRoll-e.eDefense);
        System.out.println("You did a total of "+damageDealt+" damage!");     
        e.eCHP = e.eCHP-damageDealt;
        e.eAcidStacks++;//Make sure to include acid damage at the start of the enemy's turn!!!
        if(e.eCHP <= 0){
          System.out.println("Archaic Acid, "+name+"! You have killed "+e.eName+"! Amazing!");
        }
        else{
          System.out.println(e.eName+" is still alive! Keep acidifying with those Acid Arrows of yours, "+name+"!");
        }
        break;
      }
    }
  }
}
