System.out.println("There are five enemies before you. There is Jack, Rack, Pack, Vack, and Zack.");
//eName, eMaxHP, eCHP, eStrength, eDexterity, eIntelligence, eCharisma, eDefense, eMagicResistance, eSquare, eActions, eFlail, eCharHandaxes, eMace, eRapier, eScimitar, eTrident, eCurseOfWeakness, eCurseOfSlowness, eCurseOfDumbness, eCurseOfBabbling
enemies.add(new Enemy("Jack", '\0', 50, 50, 4, 3, 1, 2, 16, 2, 1, 0, 0, '\0', 0, 0, 0, 0, false, false, false, false));
enemies.add(new Enemy("Rack", '\0', 45, 45, 2, 4, 4, 5, 17, 2, 1, 0, 0, '\0', 0, 0, 0, 0, false, false, false, false));
enemies.add(new Enemy("Pack", '\0', 39, 39, 5, 5, 3, 4, 20, 2, 3, 0, 0, '\0', 0, 0, 0, 0, false, false, false, false));
enemies.add(new Enemy("Vack", '\0', 56, 56, 1, 1, 5, 1, 18, 2, 2, 0, 0, '\0', 0, 0, 0, 0, false, false, false, false));
enemies.add(new Enemy("Zack", '\0', 40, 40, 3, 2, 2, 3, 19, 2, 4, 0, 0, '\0', 0, 0, 0, 0, false, false, false, false));
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
chosenSpell = '\0';
chosenSpellName = "";
charSpell = 'B';
System.out.println("It is time for you to take an action, "+name+"! What would you like to do? You can choose to move or cast a spell.");
System.out.println("A. Move.");
if((spell1Name == "Mage's Shield" && !magesShield) || (spell1Name == "Minor Healing" && cHP == maxHP) || (spell1Name == "Lion's Strength" && !lionsStrength) || (spell1Name == "Bobcat's Dexterity" && !bobcatsDexterity) || (spell1Name == "Dolphin's Intelligence" && !dolphinsIntelligence) || (spell1Name == "Snake's Charisma" && !snakesCharisma) || (spell1Name == "Curse of Weakness" && enemies.stream().anyMatch(e -> e.eCurseOfWeakness)) || (spell1Name == "Curse of Slowness" && enemies.stream().anyMatch(e -> e.eCurseOfSlowness)) || (spell1Name == "Curse of Dumbness" && enemies.stream().anyMatch(e -> e.eCurseOfDumbness)) || (spell1Name == "Curse of Babbling" && enemies.stream().anyMatch(e -> e.eCurseOfBabbling))){
    System.out.println(charSpell+". Cast "+spell1Name+".");
    ChosenSpell.put(charSpell, spell1Name);
    charSpell++;
}
if((spell2Name == "Mage's Shield" && !magesShield) || (spell2Name == "Minor Healing" && cHP == maxHP) || (spell2Name == "Lion's Strength" && !lionsStrength) || (spell2Name == "Bobcat's Dexterity" && !bobcatsDexterity) || (spell2Name == "Dolphin's Intelligence" && !dolphinsIntelligence) || (spell2Name == "Snake's Charisma" && !snakesCharisma) || (spell2Name == "Curse of Weakness" && enemies.stream().anyMatch(e -> e.eCurseOfWeakness)) || (spell2Name == "Curse of Slowness" && enemies.stream().anyMatch(e -> e.eCurseOfSlowness)) || (spell2Name == "Curse of Dumbness" && enemies.stream().anyMatch(e -> e.eCurseOfDumbness)) || (spell2Name == "Curse of Babbling" && enemies.stream().anyMatch(e -> e.eCurseOfBabbling))){
    System.out.println(charSpell+". Cast "+spell2Name+".");
    ChosenSpell.put(charSpell, spell1Name);
    charSpell++;
}
if((spell3Name == "Mage's Shield" && !magesShield) || (spell3Name == "Minor Healing" && cHP == maxHP) || (spell3Name == "Lion's Strength" && !lionsStrength) || (spell3Name == "Bobcat's Dexterity" && !bobcatsDexterity) || (spell3Name == "Dolphin's Intelligence" && !dolphinsIntelligence) || (spell3Name == "Snake's Charisma" && !snakesCharisma) || (spell3Name == "Curse of Weakness" && enemies.stream().anyMatch(e -> e.eCurseOfWeakness)) || (spell3Name == "Curse of Slowness" && enemies.stream().anyMatch(e -> e.eCurseOfSlowness)) || (spell3Name == "Curse of Dumbness" && enemies.stream().anyMatch(e -> e.eCurseOfDumbness)) || (spell3Name == "Curse of Babbling" && enemies.stream().anyMatch(e -> e.eCurseOfBabbling))){
    System.out.println(charSpell+". Cast "+spell3Name+".");
    ChosenSpell.put(charSpell, spell1Name);
    charSpell++;
}
if((spell4Name == "Mage's Shield" && !magesShield) || (spell4Name == "Minor Healing" && cHP == maxHP) || (spell4Name == "Lion's Strength" && !lionsStrength) || (spell4Name == "Bobcat's Dexterity" && !bobcatsDexterity) || (spell4Name == "Dolphin's Intelligence" && !dolphinsIntelligence) || (spell4Name == "Snake's Charisma" && !snakesCharisma) || (spell4Name == "Curse of Weakness" && enemies.stream().anyMatch(e -> e.eCurseOfWeakness)) || (spell4Name == "Curse of Slowness" && enemies.stream().anyMatch(e -> e.eCurseOfSlowness)) || (spell4Name == "Curse of Dumbness" && enemies.stream().anyMatch(e -> e.eCurseOfDumbness)) || (spell4Name == "Curse of Babbling" && enemies.stream().anyMatch(e -> e.eCurseOfBabbling))){
    System.out.println(charSpell+". Cast "+spell1Name+".");
    ChosenSpell.put(charSpell, spell1Name);
    charSpell++;
}
while(true){
chosenSpell = '\0';
chosenSpell = scanner.next().toUpperCase().charAt(0);
if(chosenSpell == 'A'){
    actions--;
    Move.execute();
}
else if(chosenSpell >= 'A' && chosenSpell < charSpell){
    chosenSpellName = ChosenSpell.get(chosenSpell);
    actions--;
    SPELLS.execute();
    break;
}
else{
    System.out.println("Sorry, "+name+". You can't cast that spell. Try again.");
}
}
}
//Enemy actions cannot cause self harm to a point of dying - use an if then to take this into account
e = enemies.get(0);
if(enemies.stream().anyMatch(e -> e.eCHP > 0)){
    System.out.println("Your turn is over, "+name+". It is now "+e.eName+"'s turn. Press enter to continue.");
    scanner.nextLine();
}
scanner.nextLine();
while(e.eCHP > 0 && e.eActions > 0){
choice = '\0';
//Enemy 1 logic goes here
e.eActions--;
System.out.println("");
}
e = enemies.get(1);
System.out.println("Their turn is over. Now it is "+e.eName+"'s turn. Press enter to continue.");
scanner.nextLine();
while(e.eCHP > 0 && e.eActions > 0){
choice = '\0';
//Enemy 2 logic goes here
e.eActions--;
System.out.println("");
}
e = enemies.get(2);
System.out.println("Their turn is over. Now it is "+e.eName+"'s turn. Press enter to continue.");
scanner.nextLine();
while(e.eCHP > 0 && e.eActions > 0){
choice = '\0';
//Enemy 3 logic goes here
e.eActions--;
System.out.println("");
}
e = enemies.get(3);
System.out.println("Their turn is over. Now it is "+e.eName+"'s turn. Press enter to continue.");
scanner.nextLine();
while(e.eCHP > 0 && e.eActions > 0){
choice = '\0';
//Enemy 4 logic goes here
e.eActions--;
System.out.println("");
}
e = enemies.get(4);
System.out.println("Their turn is over. Now it is "+e.eName+"'s turn. Press enter to continue.");
scanner.nextLine();
while(e.eCHP > 0 && e.eActions > 0){
choice = '\0';
//Enemy 5 logic goes here
e.eActions--;
System.out.println("");
}
}
SPELLS.reset();
choice = '\0';
chosenSpell = '\0';
chosenSpellName = "";
enemies.clear();
