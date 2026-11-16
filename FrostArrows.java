package quest;

import static quest.Quest.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class FrostArrows {
  public static void execute() {
    for(Enemy e : enemies){
      if(e.eCHP >= 0 && choice == e.eChar){
        roll = ThreadLocalRandom.current().nextInt(1, 7);
        System.out.println("You rolled a "+roll+"!");
        attackRoll = roll*cDexterity+dexBonus+attackBonus+rangedModifier-2;
        System.out.println("Your total attack roll is "+attackRoll+"!");
        damageDealt = Math.max(0, attackRoll-e.eDefense);
        System.out.println("You did a total of "+damageDealt+" damage!");     
        e.eCHP = e.eCHP-damageDealt;
        e.eFrostSquares++;
        if(e.eCHP <= 0){
          System.out.println("Freezing Frost, "+name+"! You have killed "+e.eName+"! Frostbite!");
        }
        else{
          System.out.println(e.eName+" is still alive! Keep freezing with those Frost Arrows of yours, "+name+"!");
        }
        break;
      }
    }
  }
}
