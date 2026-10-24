import java.util.concurrent.ThreadLocalRandom;
import static Quest.*;

public class Halberd{
     public static void execute(){
          roll = ThreadLocalRandom.current().nextInt(1, 7);
          System.out.println("You rolled a "+roll+"!");
          attackRoll = roll*cStrength+strBonus+attackBonus;
          System.out.println("Your total attack roll is "+attackRoll+"!");
          for(Enemy e : enemies){
          if(e.eCHP > 0 && cSquare == e.eSquare){
               damageDealt = Math.max(0, attackRoll-e.eDefense);
               System.out.println("You did a total of "+damageDealt+" damage to "+e.eName+"!");     
               e.eCHP = e.eCHP-damageDealt;
               e.eActions++;
               if(e.eCHP <= 0){
                    System.out.println("Hail the Halberd, "+name+"! You have killed "+e.eName+"! Hooray!");
               }
               else{
                    System.out.println(e.eName+" is still alive! Keep swinging with that hearty halberd of yours, "+name+"!");
               }
          }
          }
     }
}
