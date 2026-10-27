package quest;
import static quest.Quest.*;

public class Heal{
    public static void execute(){
        if(doRage){
            cHP = Math.min(maxHP, cHP+9);
        }
        else{
            cHP = Math.min(maxHP, cHP+6);
        }
    }
}
