import static Quest.*;

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
                case "Trident" -> Trident.execute();
                case "Warhammer" -> Warhammer.execute();
                default -> null
          }
     }
     public static void reset(){
          Battleaxe.reset();
          Daggers.reset();
          Handaxes.reset();
          Mace.reset();
          Rapier.reset();
          Scimitar.reset();
          Scythe.reset();
          Spear.reset();
          Trident.reset();
          Warhammer.reset();
     }
     public static void  resetCombat(){
          flail = 0;
     }
}
