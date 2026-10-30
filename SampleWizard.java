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
charSpell = 'B';
System.out.println("It is time for you to take an action, "+name+"! What would you like to do? You can choose to move or cast a spell.");
System.out.println("A. Move.");
if((spell1Name == "Mage's Shield" && !magesShield) || (spell1Name == "Lion's Strength" && !lionsStrength) || (spell1Name == "Bobcat's Dexterity" && !bobcatsDexterity)
System.out.println(charSpell+". "
}
