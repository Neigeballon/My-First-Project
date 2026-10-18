public class PROJECTILES{
     public static void caseProjectile{
          switch(chosenProjectileName){
                case "Acid Arrows" -> AcidArrows.execute();
                case "Electric Arrows" -> ElectricArrows.execute();
                case "Fire Arrows": -> FireArrows.execute();
                case "Frost Arrows" -> FrostArrows.execute();
                case "Iron Arrows" -> IronArrows.execute();
                case "Double Arrows" -> DoubleArrows.execute();
                case "Point-Blank Arrows" -> PointBlankArrows.execute();
                case "Explosive Arrows" -> ExplosiveArrows.execute();
                case "Weakness Arrows" -> WeaknessArrows.execute();
                case "Slowness Arrows" -> SlownessArrows.execute();
                case "Dumbness Arrows" -> DumbnessArrows.execute();
                case "Shielding Arrows" -> ShieldingArrows.execute();
                case "Frailizing Arrows" -> FrailizingArrows.execute();
                default -> null
           }
     }
}
