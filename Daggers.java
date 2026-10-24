import java.util.concurrent.ThreadLocalRandom;
import static Quest.*;

public class Daggers{
     public static void execute(){
         for(Enemy e : enemies){
          if(choice == e.eChar){
               roll = ThreadLocalRandom.current().nextInt(1, 7);
               System.out.println("You rolled a "+roll+"!");
               attackRoll = roll*cStrength+strBonus+attackBonus-3;
               System.out.println("Your total attack roll is "+attackRoll+"!");
               damageDealt = Math.max(0, attackRoll-e.eDefense);
               System.out.println("You did a total of "+damageDealt+" damage!");     
               e.eCHP = e.eCHP-damageDealt;
               defense = defense+2;
               daggers++;
               if(e.eCHP <= 0){
                    System.out.println("Dazzling display, "+name+"! You have killed "+e.eName+"! Dastardly job!");
               }
               else{
                    System.out.println(e.eName+" is still alive! Keep stabbing with those deadly daggers of yours, "+name+"!");
               }
               break;
          }
          }
     }
     public static void reset(){
     defense = defense-(2*daggers);
     daggers = 0;
     }
}
