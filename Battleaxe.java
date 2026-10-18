public class Battleaxe{
     public static void execute(){
          roll = ThreadLocalRandom.current().nextInt(1, 7);
          attackRoll = roll*cStrength+strengthBonus;
     }
}
