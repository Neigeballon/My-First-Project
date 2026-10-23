import static Quest.*;

public class Spear{
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
               defense = defense-2;
               spear++;
               if(e.eCHP <= 0){
                    System.out.println("Delightful, "+name+"! You have killed "+e.eName+"! Piercing beauty!");
               }
               else{
                    System.out.println(e.eName+" is still alive! Keep piercing with that spear of yours, "+name+"!");
               }
               break;
          }
          }
     }
     public static void reset(){
     defense = defense+(2*spear);
     spear = 0;
     }
}
