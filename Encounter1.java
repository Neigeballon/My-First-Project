package quest;
import static quest.Quest.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Encounter1{
    public static void execute(){
        if (cClass == 'A') {
            cSquare = 3;
            System.out.println("A montstrous Nibbit who will use his claws to attack stands in front of you. You get to go first.");
            enemies.add(new Enemy("Nibbit", '\0', 40, 40, 5, 2, 2, 1, 16, 2, 4, 0, 0, '\0', 0, 0, 0, 0, false, false, false, false));
            actions = 0;
            //Decide the enemies' ability scores and magic resistance here
            while(enemies.stream().anyMatch(e -> e.eCHP > 0)){
                choice = '\0';
                actions = actions+2;
                System.out.println("You are in square #"+cSquare+" with "+cHP+" HP remaining.");
                for(Enemy e : enemies){
                    if(e.eCHP > 0){
                        e.eActions = e.eActions+2;
                        System.out.println(e.eName+" is in square #"+e.eSquare+".");
                    }
                }
                while(actions > 0 && enemies.stream().anyMatch(e -> e.eCHP > 0)){
                    choice = '\0';
                    chosenWeapon = '\0';
                    chosenWeaponName = "";
                    charSpear = 'B';
                    System.out.println("What would you like to do? If you have the spear, you can attack an enemy not in your square. If you have a halberd, then whichever melee enemy you choose to attack with it will not matter; it will simply target all enemies in the same square as you.");
                    System.out.println("A. Move.");
                    for(Enemy e : enemies){
                        if(e.eCHP > 0 && e.eSquare != cSquare && (weapon1Name == "Spear" || weapon2Name == "Spear" || weapon3Name == "Spear" || weapon4Name == "Spear")){
                            System.out.println(charSpear+". Attack "+e.eName+" with your spear.");
                            e.eChar = charSpear;
                            charSpear++;
                        }
                    }
                    charChoice = charSpear;
                    for(Enemy e : enemies){
                        if(e.eCHP > 0 && e.eSquare == cSquare){
                            System.out.println(charChoice+". Attack "+e.eName+" with a melee weapon.");
                            e.eChar = charChoice;
                            charChoice++;
                        }
                    }
                    choice = scanner.next().toUpperCase().charAt(0);
                    if(choice == 'A'){
                        actions--;
                        Move.execute();
                    }
                    else if(choice >= 'B' && choice < charSpear){
                        actions--;
                        Spear.execute();
                    }
                    else if(choice >= charSpear && choice < charChoice){
                        System.out.println("What weapon would you like to use to attack them?");
                        ChosenWeapon.clear();
                        charWeapon = 'A';
                        if(weapon1Name != "Spear"){
                            System.out.println(charWeapon+". "+weapon1Name);
                            charWeapon1 = charWeapon;
                            ChosenWeapon.put(charWeapon1, weapon1Name);
                            charWeapon++;
                        }
                        if(weapon2Name != "Spear"){
                            System.out.println(charWeapon+". "+weapon2Name);
                            charWeapon2 = charWeapon;
                            ChosenWeapon.put(charWeapon2, weapon2Name);
                            charWeapon++;
                        }
                        if(weapon3Name != "Spear"){
                            System.out.println(charWeapon+". "+weapon3Name);
                            charWeapon3 = charWeapon;
                            ChosenWeapon.put(charWeapon3, weapon3Name);
                            charWeapon++;
                        }
                        if(weapon4Name != "Spear"){
                            System.out.println(charWeapon+". "+weapon4Name);
                            charWeapon4 = charWeapon;
                            ChosenWeapon.put(charWeapon4, weapon4Name);
                            charWeapon++;
                        }
                        while(true){
                            chosenWeapon = '\0';
                            chosenWeapon = scanner.next().toUpperCase().charAt(0);
                            if(chosenWeapon >= 'A' && chosenWeapon < charWeapon){
                                chosenWeaponName = ChosenWeapon.get(chosenWeapon);
                                actions--;
                                WEAPONS.execute();
                                break;
                            }
                            else{
                                System.out.println("That is not one of your weapons, "+name+". Try again.");
                            }
                        }
                    }
                    else{
                        System.out.println("Sorry, "+name+". You can't do that. Try again.");
                    }
                }
                e = enemies.get(0);
                if(enemies.stream().anyMatch(e -> e.eCHP > 0)){
                    System.out.println("Your turn is over, "+name+". It is now "+e.eName+"'s turn. Press enter to continue.");
                    scanner.nextLine();
                }
                scanner.nextLine();
                while(e.eCHP > 0 && e.eActions > 0){
                    choice = '\0';
                    if(e.eSquare != cSquare){
                        e.eActions--;
                        e.eSquare = cSquare;
                        System.out.println("The Nibbit moves into your square, square #"+cSquare+".");
                    }
                    else{
                        e.eActions--;
                        System.out.println("The Nibbit attacks you with his front claws.");
                        if(e.eTrident > 0){
                            roll = Math.max(ThreadLocalRandom.current().nextInt(1, 7), ThreadLocalRandom.current().nextInt(1, 7));
                            e.eTrident--;
                        }
                        else{
                            roll = ThreadLocalRandom.current().nextInt(1, 7);
                        }
                        System.out.println("The Nibbit rolled a "+roll+".");
                        if(e.eFlail > 0){
                            attackRoll = roll*(e.eStrength+1);
                            e.eFlail--;
                        }
                        else{
                            attackRoll = roll*e.eStrength;
                        }
                        System.out.println("The Nibbit's attack roll is "+attackRoll+".");
                        damageDealt = Math.max(0, attackRoll-defense);
                        System.out.println("The Nibbit dealt a total of "+damageDealt+" damage to you!");
                        cHP = cHP-damageDealt;
                        System.out.println("You now have "+cHP+" HP remaining.");
                    }
                    System.out.println("");
                }
                WEAPONS.reset();
            }
            choice = '\0';
            chosenWeapon = '\0';
            chosenWeaponName = "";
            enemies.clear();
        }
        else if(cClass == 'B'){
            
        }
        else{
            
        }
        encounter++;
        Save();
        Encounter2.execute();
    }
}
