import static quest.Quest.*;

public class MagesShield{
    public static void execute(){
        defense = defense+6;
        magesShield = true;
        System.out.println("Your Mage's Shield was successfully engaged, "+name+". Now you have a defense score of "+defense+"!");
    }
    public static void reset(){
        defense = defense-6;
        magesShield = false;
    }
}
