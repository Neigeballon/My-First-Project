public class Battleaxe{
     public static void execute(){
          if(choice == 'B' && cSquare == e1Square){
                System.out.println("You attack "+chosenEnemyName+" with your battleaxe!");    
                roll = ThreadLocalRandom.current().nextInt(1, 7);
                System.out.println("You rolled a "+roll+"!");
                attackRoll = roll*cStrength+strBonus+attackBonus;
                System.out.println("Your total attack roll is "+attackRoll+"!");
                damageDealt = attackRoll-e1Defense;
                System.out.println("With your deadly battleaxe, you dealt "+damageDealt+" to "+chosenEnemyName+"!");
                e1CHP = e1CHP-damageDealt;
                if(e1CHP =< 0){
                      System.out.println(chosenEnemyName+" is dead! Great job killing it. It is still in square #"+e1Square+".");
                }
                else{
                      System.out.println(chosenEnemyName+" is still alive with "+e1CHP+" left. It is still in square #"+e1Square+". Keep going!");
                }
          }
          else if(choice == 'C' && cSquare == e2Square){
                System.out.println("You attack "+chosenEnemyName+" with your battleaxe!");    
                roll = ThreadLocalRandom.current().nextInt(1, 7);
                System.out.println("You rolled a "+roll+"!");
                attackRoll = roll*cStrength+strBonus+attackBonus;
                System.out.println("Your total attack roll is "+attackRoll+"!");
                damageDealt = attackRoll-e2Defense;
                System.out.println("With your deadly battleaxe, you dealt "+damageDealt+" to "+chosenEnemyName+"!");
                e2CHP = e2CHP-damageDealt;
                if(e1CHP =< 0){
                      System.out.println(chosenEnemyName+" is dead! Great job killing it. It is still in square #"+e2Square+".");
                }
                else{
                      System.out.println(chosenEnemyName+" is still alive with "+e2CHP+" left. It is still in square #"+e2Square+". Keep going!");
                } 
          }
          else if(choice == 'D' && cSquare == e3Square){
                System.out.println("You attack "+chosenEnemyName+" with your battleaxe!");    
                roll = ThreadLocalRandom.current().nextInt(1, 7);
                System.out.println("You rolled a "+roll+"!");
                attackRoll = roll*cStrength+strBonus+attackBonus;
                System.out.println("Your total attack roll is "+attackRoll+"!");
                damageDealt = attackRoll-e3Defense;
                System.out.println("With your deadly battleaxe, you dealt "+damageDealt+" to "+chosenEnemyName+"!");
                e3CHP = e3CHP-damageDealt;
                if(e1CHP =< 0){
                      System.out.println(chosenEnemyName+" is dead! Great job killing it. It is still in square #"+e3Square+".");
                }
                else{
                      System.out.println(chosenEnemyName+" is still alive with "+e3CHP+" left. It is still in square #"+e3Square+". Keep going!");
                }
          }
          else if(choice == 'E' && cSquare == e4Square){
                System.out.println("You attack "+chosenEnemyName+" with your battleaxe!");    
                roll = ThreadLocalRandom.current().nextInt(1, 7);
                System.out.println("You rolled a "+roll+"!");
                attackRoll = roll*cStrength+strBonus+attackBonus;
                System.out.println("Your total attack roll is "+attackRoll+"!");
                damageDealt = attackRoll-e4Defense;
                System.out.println("With your deadly battleaxe, you dealt "+damageDealt+" to "+chosenEnemyName+"!");
                e4CHP = e4CHP-damageDealt;
                if(e1CHP =< 0){
                      System.out.println(chosenEnemyName+" is dead! Great job killing it. It is still in square #"+e4Square+".");
                }
                else{
                      System.out.println(chosenEnemyName+" is still alive with "+e4CHP+" left. It is still in square #"+e4Square+". Keep going!");
                }
          }
          else if(choice == 'F' && cSquare == e5Square){
                System.out.println("You attack "+chosenEnemyName+" with your battleaxe!");    
                roll = ThreadLocalRandom.current().nextInt(1, 7);
                System.out.println("You rolled a "+roll+"!");
                attackRoll = roll*cStrength+strBonus+attackBonus;
                System.out.println("Your total attack roll is "+attackRoll+"!");
                damageDealt = attackRoll-e5Defense;
                System.out.println("With your deadly battleaxe, you dealt "+damageDealt+" to "+chosenEnemyName+"!");
                e5CHP = e5HP-damageDealt;
                if(e1CHP =< 0){
                      System.out.println(chosenEnemyName+" is dead! Great job killing it. It is still in square #"+e5Square+".");
                }
                else{
                      System.out.println(chosenEnemyName+" is still alive with "+e5CHP+" left. It is still in square #"+e5Square+". Keep going!");
                }
          }
          else{
                
          }
     }
}
