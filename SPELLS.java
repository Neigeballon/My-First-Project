public class SPELLS{
     public static void caseSpell{
           switch(chosenSpellName){
                case "Mage's Shield" -> MagesShield.execute();
                case "Minor Healing" -> MinorHealing.execute();
                case "Lion's Strength": -> LionsStrength.execute();
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
                default -> null
          }
     }
}
