package quest;
import static quest.Quest.*;

public class MinorHealing {
    public static void execute()  {
        double healed = 0;
        if(doRage){
            healed = Math.min(9, maxHP-cHP);
            cHP = Math.min(maxHP, cHP+9);
            
        }
        else{
            healed = Math.min(6, maxHP-cHP);
            cHP = Math.min(maxHP, cHP+6);
        }
        System.out.print("You have successfully healed "+healed+" HP with your "+magicItemName+", "+name+"!");
    }
}
