package quest;
import static quest.Quest.*;
import java.util.concurrent.ThreadLocalRandom;

public class Scythe{
     public static void execute(){
          for(Enemy e : enemies){
          if(choice == e.eChar){
               roll = ThreadLocalRandom.current().nextInt(1, 7);
               System.out.println("You rolled a "+roll+"!");
               attackRoll = roll*cStrength+strBonus+attackBonus;
               System.out.println("Your total attack roll is "+attackRoll+"!");
               damageDealt = Math.max(0, attackRoll-e.eDefense);
               if(ThreadLocalRandom.current().nextInt(1, 4) == 1){
                    damageDealt = damageDealt*2;
                    System.out.println("Lucky stroke! You got a critical hit on "+e.eName+"! Double damage!");
               }
               else{
                    damageDealt = damageDealt-3;
                    System.out.println("Unfortunately, you did not get a critical hit with your scythe this time, so you have a -3 penalty to damage.");
               }
               System.out.println("You did a total of "+damageDealt+" damage!");     
               e.eCHP = e.eCHP-damageDealt;
               if(e.eCHP <= 0){
                    System.out.println("Scythian reaping, "+name+"! You have killed "+e.eName+"! Spectacular!");
               }
               else{
                    System.out.println(e.eName+" is still alive! Keep reaping with that special scythe of yours, "+name+"!");
               }
               break;
          }
          }
     }
}
