import java.util.concurrent.ThreadLocalRandom;
import static Quest.*;

public class Longsword{
     public static void execute(){
          for(Enemy e : enemies){
          if(choice == e.eChar){
               actions--;
               roll = ThreadLocalRandom.current().nextInt(1, 7);
               System.out.println("You rolled a "+roll+"!");
               attackRoll = roll*cStrength+strBonus+attackBonus;
               System.out.println("Your total attack roll is "+attackRoll+"!");
               damageDealt = Math.max(0, attackRoll-e.eDefense);
               System.out.println("You did a total of "+damageDealt+" damage!");     
               e.eCHP = e.eCHP-damageDealt;
               if(e.eCHP <= 0){
                    System.out.println("Slashing lashing , "+name+"! You have killed "+e.eName+"! Lickety-split!");
               }
               else{
                    System.out.println(e.eName+" is still alive! Keep slashing with that long longsword of yours, "+name+"!");
               }
               break;
          }
          }
     }
}
