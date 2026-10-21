import static Quest.*;

public class Daggers{
     public static void execute(){
         for(Enemy e : enemies){
          if(choice == e.eChar){
               actions--;
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
                    System.out.println("Congradulations, "+name+"! You have killed "+e.eName+"! Great job!");
               }
               else{
                    System.out.println(e.eName+" is still alive! Keep battling with that battleaxe of yours, "+name+"!");
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
