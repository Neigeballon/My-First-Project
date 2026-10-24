package quest;
import static quest.Quest.*;
import java.util.concurrent.ThreadLocalRandom;

public class Flail{
     public static void execute(){
          for(Enemy e : enemies){
          if(choice == e.eChar){
               roll = ThreadLocalRandom.current().nextInt(1, 7);
               System.out.println("You rolled a "+roll+"!");
               attackRoll = roll*(cStrength+1)+strBonus+attackBonus;
               System.out.println("Your total attack roll is "+attackRoll+"!");
               damageDealt = Math.max(0, attackRoll-e.eDefense);
               System.out.println("You did a total of "+damageDealt+" damage!");     
               e.eCHP = e.eCHP-damageDealt;
               e.eFlail++;
               if(e.eCHP <= 0){
                    System.out.println("Fantastic flailing, "+name+"! You have killed "+e.eName+"! Great job!");
               }
               else{
                    System.out.println(e.eName+" is still alive! Keep flailing with that flail of yours, "+name+"!");
               }
               break;
          }
          }
     }
}
