import java.util.concurrent.ThreadLocalRandom;
import Quest.*;

public class Rapier{
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
               if(e.eDexterity > 0){
                    e.eDexterity--;
                    e.eRapier++;
               }
               defense--;
               attackBonus--;
               if(e.eCHP <= 0){
                    System.out.println("Rumbling razing, "+name+"! You have killed "+e.eName+"! Radical!");
               }
               else{
                    System.out.println(e.eName+" is still alive! Keep piercing with that razor-sharp rapier of yours, "+name+"!");
               }
               break;
          }
          }
     }
     public static void reset(){
          defense++;
          attackBonus++;
          for(Enemy e : enemies){
          while(e.eRapier > 0){
               e.eDexterity++;
               e.eRapier--;
          }
          }
     }
}
