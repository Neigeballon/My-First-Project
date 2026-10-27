package quest;
import static quest.Quest.*;

public class MagesShield{
    public static void execute(){
        if(doRage){
            magicDefense = 9;
        }
        else if(do1Sacrifice){
            magicDefense = 8;
        }
        else{
            magicDefense = 6;
        }
        defense = defense+magicDefense;
        magesShield = true;
        System.out.println("Your Mage's Shield was successfully engaged, "+name+". Now you have a defense score of "+defense+"!");
    }
    public static void reset(){
        defense = defense-magicDefense;
        magesShield = false;
    }
}
