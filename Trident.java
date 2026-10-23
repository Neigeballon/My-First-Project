import static Quest.*;

public class Trident{
     public static void execute(){
          for(Enemy e : enemies){
          if(choice == e.eChar){
               actions--;
               roll = Math.max(
               Math.max(ThreadLocalRandom.current().nextInt(1, 7), ThreadLocalRandom.current().nextInt(1, 7)), 
               ThreadLocalRandom.current().nextInt(1, 7)
               );
               System.out.println("You rolled a "+roll+"!");
               attackRoll = roll*cStrength+strBonus+attackBonus;
               System.out.println("Your total attack roll is "+attackRoll+"!");
               damageDealt = Math.max(0, attackRoll-e.eDefense);
               System.out.println("You did a total of "+damageDealt+" damage!");     
               e.eCHP = e.eCHP-damageDealt;
               if(e.eCHP <= 0){
                    System.out.println("Triple trifecta, "+name+"! You have killed "+e.eName+"! Thine perfection!");
               }
               else{
                    System.out.println(e.eName+" is still alive! Keep impaling with that triple trident of yours, "+name+"!");
               }
               break;
          }
          }
     }
}
