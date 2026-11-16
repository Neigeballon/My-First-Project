package quest;

import static quest.Quest.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ElectricArrows {
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
        if (!electricArrows) {
          e.eActions--;
          defense -= 5;
        }
        electricArrows = true;
        if(e.eCHP <= 0){
          System.out.println("Electrifying Electricity, "+name+"! You have killed "+e.eName+"! Ecstatic!");
        }
        else{
          System.out.println(e.eName+" is still alive! Keep electrifying with those Electric Arrows of yours, "+name+"!");
        }
        break;
      }
    }
  }

  public static void reset() {
    if (electricArrows) {
      defense += 5;
    }
    electricArrows = false;
  }
}
