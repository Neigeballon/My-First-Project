public class Battleaxe{
     public static void execute(){
          if(choice == 'B' && cSquare == e1Square){
          System.out.println("You attack "+chosenEnemyName+" with your battleaxe!");    
          roll = ThreadLocalRandom.current().nextInt(1, 7);
          System.out.println("You rolled a "+roll+"!");
          attackRoll = roll*cStrength+strBonus+attackBonus;
          System.out.println("Your total attack roll is "+attackRoll+"!");
          }
     }
}
