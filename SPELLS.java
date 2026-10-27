package quest;
import static quest.Quest.*;
import java.util.*;

public class SPELLS{
     public static void execute(){
           Scanner scanner = new Scanner(System.in);
           char spellChoice = '\0'
           switch(chosenSpellName){
                case "Mage's Shield" -> {
                     if(askRage){
                          System.out.println("Would you like to use your Rod of Rage's power, "+name+"? If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               doRage = true;
                               MagesShield.execute();
                               doRage = false;
                          }
                          else{
                               MagesShield.execute();
                          }
                     }
                     else if(ask1Sacrifice){
                          System.out.println("Would you like to use your Staff of Sacrifice's power by losing 3 HP, "+name+"? You currently have "+cHP+" HP. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               cHP = cHP-3;
                               do1Sacrifice = true;
                               MagesShield.execute();
                               do1Sacrifice = false;
                          }
                          else{
                               MagesShield.execute();
                          }
                     }
                }
                case "Minor Healing" -> MinorHealing.execute();
                case "Lion's Strength" -> LionsStrength.execute();
                case "Bobcat's Dexterity" -> BobcatsDexterity.execute();
                case "Dolphin's Intelligence" -> DolphinsIntelligence.execute();
                case "Snake's Charisma" -> SnakesCharisma.execute();
                case "Fireball" -> Fireball.execute();
                case "Magic Torpedo" -> MagicTorpedo.execute();
                case "Poison Cloud" -> PoisonCloud.execute();
                case "Curse of Weakness" -> CurseofWeakness.execute();
                case "Curse of Slowness" -> CurseofSlowness.execute();
                case "Curse of Stupidity" -> CurseofStupidity.execute();
                case "Curse of Babbling" -> CurseofBabbling.execute();
                default -> System.out.println("");
          }
     }
     public static void reset(){
          MagesShield.reset();
          LionsStrength.reset();
          BobcatsDexterity.reset();
          DolphinsIntelligence.reset();
          SnakesCharisma.reset();
     }
}
