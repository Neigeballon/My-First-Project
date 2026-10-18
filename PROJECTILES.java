public class PROJECTILES{
     public static void caseProjectile{
          switch(chosenProjectileName)
                case "Acid Arrows" -> Battleaxe.execute();
                case "Electric Arrows" -> Daggers.execute();
                case "Fire Arrows": -> Flail.execute();
                case "Frost Arrows" -> Halberd.execute();
                case "Iron Arrows" -> Handaxes.execute();
                case "Double Arrows" -> Longsword.execute();
                case "Point-Blank Arrows" -> Mace.execute();
                case "Explosive Arrows" -> Rapier.execute();
                case "Weakness Arrows" -> Scimitar.execute();
                case "Slowness Arrows" -> Scythe.execute();
                case "Dumbness Arrows" -> Spear.execute();
                case "Shielding Arrows" -> Trident.execute();
                case "Frailizing Arrows" -> Warhammer.execute();
                default -> null
     }
}
