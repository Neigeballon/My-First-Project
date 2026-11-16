package quest;

import static quest.Quest.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class FireArrows {
  public static void execute() {
    int fireDamage = 0;
    for(Enemy e : enemies){
      if(e.eCHP >= 0 && choice == e.eChar){
        roll = ThreadLocalRandom.current().nextInt(1, 7);
        System.out.println("You rolled a "+roll+"!");
        attackRoll = roll*cDexterity+dexBonus+attackBonus+rangedModifier;
        System.out.println("Your total attack roll is "+attackRoll+"!");
        damageDealt = Math.max(0, attackRoll-e.eDefense);
        System.out.println("You did a total of "+damageDealt+" damage!");
        fireDamage = ThreadLocalRandom.current().nextInt(1, 5);
        System.out.println("Your Fire Arrow dealt an additional "+fireDamage+" damage, "+name+".");
        damageDealt += fireDamage;
        e.eCHP = e.eCHP-damageDealt;
        if(e.eCHP <= 0){
          System.out.println("Flaming Fire, "+name+"! You have killed "+e.eName+"! Fantastic!");
        }
        else{
          System.out.println(e.eName+" is still alive! Keep flamethrowing with those Fire Arrows of yours, "+name+"!");
        }
        break;
      }
    }
  }
}
