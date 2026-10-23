System.out.println("There are five enemies before you. There is Jack, Rack, Pack, Vack, and Zack. If at any time, a creature's HP equals or drops below zero, then they are dead and SHOULD NOT BE ATTACKED.");
ArrayList<Enemy> enemies = new ArrayList<>();
//eName, eMaxHP, eCHP, eStrength, eDexterity, eIntelligence, eCharisma, eDefense, eMagicResistance, eSquare, eActions, eFlail, eCharHandaxes, eMace, eRapier, eScimitar, eTrident
enemies.add(new Enemy("Jack", '\0', 50, 50, 4, 3, 1, 2, 16, 2, 1, 0, 0, '\0', 0, 0, 0, 0));
enemies.add(new Enemy("Rack", '\0', 45, 45, 2, 4, 4, 5, 17, 2, 1, 0, 0, '\0', 0, 0, 0, 0));
enemies.add(new Enemy("Pack", '\0', 39, 39, 5, 5, 3, 4, 20, 2, 3, 0, 0, '\0', 0, 0, 0, 0));
enemies.add(new Enemy("Vack", '\0', 56, 56, 1, 1, 5, 1, 18, 2, 2, 0, 0, '\0', 0, 0, 0, 0));
enemies.add(new Enemy("Zack", '\0', 40, 40, 3, 2, 2, 3, 19, 2, 4, 0, 0, '\0', 0, 0, 0, 0));
actions = 0;
Enemy e = null;
//Decide the enemies' ability scores and magic resistance here
while(enemies.stream().anyMatch(e -> e.eCHP > 0)){
choice = '\0';
actions = actions+2;
System.out.println("You are in square #"+cSquare+".");
for(Enemy e : enemies){
if(e.eCHP > 0){
     e.eActions = e.eActions+2;
     System.out.println(e.eName+" is in square #"+e.eSquare+".");
}
}
while(actions > 0){
choice = '\0';
chosenWeapon = '\0';
chosenWeaponName = "";
charSpear = 'B';
System.out.println("What would you like to do? If you have the spear, you can attack an enemy not in your square. If you have a halberd, then whichever melee enemy you choose to attack with it will not matter; it will simply target all enemies in the same square as you.");
System.out.println("A. Move."); 
for(Enemy e : enemies){
if(e.eCHP > 0 && e.eSquare != cSquare && (weapon1 == 'K' || weapon2 == 'K' || weapon3 == 'K' || weapon4 == 'K')){
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
      Spear.execute();
}
else if(choice >= charSpear && choice < charChoice){
      System.out.println("What weapon would you like to use to attack them?");
      charWeapon = 'A';
      if(weapon1 != 'K'){
           System.out.println(charWeapon+". "+weapon1Name);
           charWeapon1 = charWeapon;
           charWeapon++;
      }
      if(weapon2 != 'K'){
           System.out.println(charWeapon+". "+weapon2Name);
           charWeapon2 = charWeapon;
           charWeapon++;
      }
      if(weapon3 != 'K'){
           System.out.println(charWeapon+". "+weapon3Name);
           charWeapon3 = charWeapon;
           charWeapon++;
      }
      if(weapon4 != 'K'){
           System.out.println(charWeapon+". "+weapon4Name);
           charWeapon4 = charWeapon;
           charWeapon++;
      }
      while(true){
      chosenWeapon = '\0';
      chosenWeapon = scanner.next().toUpperCase().charAt(0);
      if(chosenWeapon >= 'A' && chosenWeapon < charWeapon){
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
//Enemy actions cannot cause self harm to a point of dying - use an if then to take this into account
e = enemies.get(0);
while(e.eCHP > 0 && e.eActions > 0){
choice = '\0';
//Enemy 1 logic goes here-take into account flail and trident bonus!
}
e = enemies.get(1);
while(e.eCHP > 0 && e.eActions > 0){
choice = '\0';
//Enemy 2 logic goes here-take into account flail and trident bonus!
}
e = enemies.get(2);
while(e.eCHP > 0 && e.eActions > 0){
choice = '\0';
//Enemy 3 logic goes here-take into account flail and trident bonus!
}
e = enemies.get(3);
while(e.eCHP > 0 && e.eActions > 0){
choice = '\0';
//Enemy 4 logic goes here-take into account flail and trident bonus!
}
e = enemies.get(4);
while(e.eCHP > 0 && e.eActions > 0){
choice = '\0';
//Enemy 5 logic goes here-take into account flail and trident bonus!
}
WEAPONS.reset();
}
choice = '\0';
chosenWeapon = '\0';
chosenWeaponName = "";
