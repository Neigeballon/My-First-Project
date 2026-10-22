import static Quest.*;

public class Handaxes{
     public static void execute(){
          for(Enemy e : enemies){
          if(choice == e.eChar){
               actions--;
               roll = ThreadLocalRandom.current().nextInt(1, 7);
               System.out.println("You rolled a "+roll+"!");
               attackRoll = roll*cStrength+strBonus+attackBonus;
               System.out.println("Your total attack roll is "+attackRoll+"!");
               damageDealt = Math.max(0, attackRoll-e.eDefense);
               System.out.println("You did a total of "+damageDealt+" damage to "+e.eName+"!");     
               e.eCHP = e.eCHP-damageDealt;
               e.eHandaxes = true;
               if(e.eCHP <= 0){
                    System.out.println("Dazzling display, "+name+"! You have killed "+e.eName+"! Dastardly job!");
               }
               else{
                    System.out.println(e.eName+" is still alive! Keep stabbing with those deadly daggers of yours, "+name+"!");
               }
               break;
               System.out.println("Choose another enemy to target with your handaxes!");
          }
          }
     }
}
