import java.util.concurrent.ThreadLocalRandom;
import static Quest.*;

public class Warhammer{
     public static void execute(){
          for(Enemy e : enemies){
          if(choice == e.eChar){
               roll = ThreadLocalRandom.current().nextInt(1, 7);
               System.out.println("You rolled a "+roll+"!");
               attackRoll = roll*cStrength+strBonus+attackBonus;
               System.out.println("Your total attack roll is "+attackRoll+"!");
               damageDealt = Math.max(0, attackRoll-e.eDefense);
               System.out.println("You did a total of "+damageDealt+" damage!");     
               e.eCHP = e.eCHP-damageDealt;
               if(e.eCHP <= 0){
                    System.out.println("Wonderful, "+name+"! You have killed "+e.eName+"! Wonderlust!");
               }
               else{
                    System.out.println(e.eName+" is still alive! Keep slamming with that wartime warhammer of yours, "+name+"!");
               }
               break;
          }
          }
          for(Enemy e : enemies){
          if(e.eCHP > 0 && cSquare == e.eSquare && choice != e.eChar){
               System.out.println("You have dealt a total of "+(damageDealt/2)+" splash damage to "+e.eName+"!");
               e.eCHP = e.eCHP-damageDealt/2
               if(e.eCHP <= 0){
                    System.out.println("Wonderful, "+name+"! You have killed "+e.eName+" because of splash damage! Wonderlust!");
               }
               else{
                    System.out.println(e.eName+" is still alive after being hit by the splash damage! Keep slamming with that wartime warhammer of yours, "+name+"!");
               }
          }
          }
          System.out.println("You have taken "+(damageDealt/4)+" damage due to the splash damage from your warhammer!");
          cHP = cHP-damageDealt/4
     }
}
