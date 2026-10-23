public class Scythe{
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
                    System.out.println("Scythian reaping, "+name+"! You have killed "+e.eName+"! Spectacular!");
               }
               else{
                    System.out.println(e.eName+" is still alive! Keep reaping with that special scythe of yours, "+name+"!");
               }
               break;
          }
          }
     }
     public static void reset(){
          defense++;
          attackBonus++;
          for(Enemy e : enemies){
          if(e.eMace){
               e.eStrength++;
               e.eMace = false;
          }
          }
     }
}
