public class WEAPONS{
     public static void execute(){
          switch(chosenWeaponName){
                case "Battleaxe" -> Battleaxe.execute();
                case "2 Daggers" -> Daggers.execute();
                case "Flail": -> Flail.execute();
                case "Halberd" -> Halberd.execute();
                case "2 Handaxes" -> Handaxes.execute();
                case "Longsword" -> Longsword.execute();
                case "Mace" -> Mace.execute();
                case "Rapier" -> Rapier.execute();
                case "Scimitar" -> Scimitar.execute();
                case "Scythe" -> Scythe.execute();
                case "Spear" -> Spear.execute();
                case "Trident" -> Trident.execute();
                case "Warhammer" -> Warhammer.execute();
                default -> null
          }
     }
}
