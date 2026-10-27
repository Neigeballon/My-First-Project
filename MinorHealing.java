package quest;
import static quest.Quest.*;

public class MinorHealing{
    public static void execute(){
        if(doRage){
            cHP = Math.min(maxHP, cHP+9);
        }
        else{
            cHP = Math.min(maxHP, cHP+6);
        }
    }
}
