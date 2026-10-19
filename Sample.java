System.out.println("There are five enemies before you. There is Jack, Rack, Pack, Vack, and Zack. If at any time, a creature's HP equals or drops below zero, then they are dead and SHOULD NOT BE ATTACKED.");
e1Name = "Jack";
e2Name = "Rack";
e3Name = "Pack";
e4Name = "Vack";
e5Name = "Zack";
e1Square = 1;
e2Square = 1;
e3Square = 3;
e4Square = 2;
e5Square = 4;
e1Defense = 17;
e2Defense = 17;
e3Defense = 17;
e4Defense = 17;
e5Defense = 17;
e1MaxHP = 50;
e2MaxHP = 50;
e3MaxHP = 50;
e4MaxHP = 50;
e5MaxHP = 50;
e1CHP = 50;
e2CHP = 50;
e3CHP = 50;
e4CHP = 50;
e5CHP = 50;
//Decide the enemies' ability scores and magic resistance here
while(e1CHP > 0 || e2CHP > 0 || e3CHP > 0 || e4CHP > 0 || e5CHP > 0){
choice = null;
while(actions > 0){
choice = null;
chosenWeapon = null;
chosenWeaponName = null;
chosenEnemyName = null;
System.out.println("What would you like to do? If the target for your attack is not valid, you will be asked to try again. If you have the spear, you can attack an enemy not in your square.");
System.out.println("A. Move."); 
System.out.println("B. Attempt to attack "+e1Name+", who has "+e1CHP+" HP and is in square #"+e1Square+".");
System.out.println("C. Attempt to attack "+e2Name+", who has "+e2CHP+" HP and is in square #"+e2Square+".");
System.out.println("D. Attempt to attack "+e3Name+", who has "+e3CHP+" HP and is in square #"+e3Square+".");
System.out.println("E. Attempt to attack "+e4Name+", who has "+e4CHP+" HP and is in square #"+e4Square+".");
System.out.println("F. Attempt to attack "+e5Name+", who has "+e5CHP+" HP and is in square #"+e5Square+".");
choice = scanner.next().toUpperCase().charAt(0);
if(choice == 'A'){
     actions--;
     Move.execute();
}
else if("BCDEF".indexOf(choice) >= 0){
      chosenEnemyName = ChosenEnemyName.get(choice);
      System.out.println("What weapon would you like to use to attack them?");
      System.out.println("A. "+weapon1Name);
      System.out.println("B. "+weapon2Name);
      System.out.println("C. "+weapon3Name);
      System.out.println("D. "+weapon4Name);
      while(true){
      chosenWeapon = scanner.next().toUpperCase().charAt(0);
      if("ABCD".indexOf(chosenWeapon) >= 0){
            chosenWeaponName = ChosenWeapon.get(chosenWeapon);
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
while(e1Actions > 0 && e1CHP > 0){
choice = null;
//If then logic for enemy 1 attack pattern goes here
//Add option for reactions here
}
while(e2Actions > 0 && e2CHP > 0){
choice = null;
//If then logic for enemy 2 attack pattern goes here
//Add option for reactions here
}
while(e3Actions > 0 && e3CHP > 0){
choice = null;
//If then logic for enemy 3 attack pattern goes here
//Add option for reactions here
}
while(e4Actions > 0 && e4CHP > 0){
choice = null;
//If then logic for enemy 4 attack pattern goes here
//Add option for reactions here
}
while(e5Actions > 0 && e5CHP > 0){
choice = null;
//If then logic for enemy 5 attack pattern goes here
//Add option for reactions here
}
}
