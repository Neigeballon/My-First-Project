public class Battleaxe{
     public static void execute(){
          roll = ThreadLocalRandom.current().nextInt(1, 7);
          System.out.println("You rolled a "+roll+"!");
          attackRoll = roll*cStrength+strBonus+attackBonus;
          System.out.println("Your total attack roll is "+attackRoll+"!"
     }
}
