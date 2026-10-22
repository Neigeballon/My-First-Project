import static Quest.*;

public class Handaxes{
     public static void execute(){
          char handaxesChoice = '\0';
          Scanner scanner = new Scanner(System.in);
          System.out.println("Choose another enemy to target with your other handaxe! If there is no other enemy in melee range, just choose the same one again *the damage will be applied twice*.");
          choiceChar = 'A';
          for(Enemy e : enemies){
          if(e.eCHP > 0 && cSquare == e.eSquare){
               System.out.println(choiceChar+". "+e.eName);
          }
          }
          for(Enemy e : enemies){
          if(choice == e.eChar){
               actions--;
               roll = ThreadLocalRandom.current().nextInt(1, 7);
               System.out.println("You rolled a "+roll+"!");
               attackRoll = roll*cStrength+strBonus+attackBonus;
               System.out.println("Your total attack roll is "+attackRoll+"!");
               damageDealt = Math.max(0, (attackRoll-e.eDefense)/2);
               System.out.println("You did a total of "+damageDealt+" damage to "+e.eName+"!");     
               e.eCHP = e.eCHP-damageDealt;
               e.eHandaxes = true;
               if(e.eCHP <= 0){
                    System.out.println("Holy handling, "+name+"! You have killed "+e.eName+"! Holy cow!");
               }
               else{
                    System.out.println(e.eName+" is still alive! Keep chopping with those holy handaxes of yours, "+name+"!");
               }
               System.out.println("Choose another enemy to target with your handaxes!");
               for(Enemy e : enemies){
               e.eChar = '\0';
               if(cSquare == e.eSquare && e.eHandaxes == false){
                    System.out.println(choiceChar+". "+e.eName);
                    e.eChar = choiceChar;
                    choiceChar++;
               }
               }
               if(choiceChar == 'A'){
                    System.out.println("Sorry, "+name+" . There is no other enemy in your square for you to attack. However, the damage you dealt to that enemy will be doubled to compensate.");
                    for(Enemy e : enemies){
                    if(e.eHandaxes){
                         e.eCHP = e.eCHP-damageDealt;
                         if(e.eCHP <= 0){
                              System.out.println("Holy handling, "+name+"! You have killed "+e.eName+"! Holy cow!");
                         }
                         else{
                              System.out.println(e.eName+" is still alive! Keep chopping with those holy handaxes of yours, "+name+"!");
                         }
                    }
                    break;
                    }
                    
               }
               else{
                    while(true){
                    choice = scanner.next().toUpperCase().charAt(0);
                    if(choice >= 'A' && choice < choiceChar){
                         for(Enemy e : enemies){
                         if(choice == e.eChar){
                              e.eCHP = e.eCHP-damageDealt;
                              if(e.eCHP <= 0){
                                   System.out.println("Holy handling, "+name+"! You have killed "+e.eName+"! Holy cow!");
                              }
                              else{
                                   System.out.println(e.eName+" is still alive! Keep chopping with those holy handaxes of yours, "+name+"!");
                              }
                         }
                         break;
                         }
                         break;
                    }
                    else{
                         System.out.println("That is not a valid enemy choice, "+name+". Try again.");
                    }
                    }
               }
          }
          break;
          }
     }
}
