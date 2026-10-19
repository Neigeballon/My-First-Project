import java.util.*;




public class Quest {
    public static void quest(String[] args) {

     //Fighter Armor Map
     Map<Character, String> Armors = Map.ofEntries(
     Map.entry('A', "Crocodile Leather Armor"),
     Map.entry('B', "Crocodile Scale Mail"),
     Map.entry('C', "Crocodile Teeth Bone Plate")
     );
        
     //Fighter Weapon Map
     Map<Character, String> Weapons = Map.ofEntries(
     Map.entry('A', "Battleaxe"),
     Map.entry('B', "2 Daggers"),
     Map.entry('C', "Flail"),
     Map.entry('D', "Halberd"),
     Map.entry('E', "2 Handaxes"),
     Map.entry('F', "Longsword"),
     Map.entry('G', "Mace"),
     Map.entry('H', "Rapier"),
     Map.entry('I', "Scimitar"),
     Map.entry('J', "Scythe"),
     Map.entry('K', "Spear"),
     Map.entry('L', "Trident"),
     Map.entry('M', "Warhammer")
     );

     //Fighter Chosen Weapon Map
     Map<Character, String> ChosenWeapon = MapofEntries(
     Map.entry('A', weapon1Name),
     Map.entry('B', weapon2Name),
     Map.entry('C', weapon3Name),
     Map.entry('D', weapon4Name)
     );

     //Wizard Spell Map 
     Map<Character, String> Spellbook = Map.ofEntries(
     Map.entry('A', "Mage's Shield"),
     Map.entry('B', "Minor Healing"),
     Map.entry('C', "Lion's Strength"),
     Map.entry('D', "Bobcat's Dexterity"),
     Map.entry('E', "Dolphin's Intelligence"),
     Map.entry('F', "Snake's Charisma"),
     Map.entry('G', "Fireball"),
     Map.entry('H', "Magic Torpedo"),
     Map.entry('I', "Poison Cloud"),
     Map.entry('J', "Curse of Weakness"),
     Map.entry('K', "Curse of Slowness"),
     Map.entry('L', "Curse of Stupidity"),
     Map.entry('M', "Curse of Babbling")
     );

     //Wizard Magic Item Map
     Map<Character, String> Magics = MapofEntries(
     Map.entry('A', "Rod of Rage"),
     Map.entry('B', "Staff of Sacrifice"),
     Map.entry('C', "Wand of Wonder")
     );

     //Wizard Chosen Spell Map
     Map<Character, String> ChosenSpell = MapofEntries(
     Map.entry('A', spell1Name),
     Map.entry('B', spell2Name),
     Map.entry('C', spell3Name),
     Map.entry('D', spell4Name)
     );

     //Ranger Ranged Weapon Map
     Map<Character, String> Bows = MapofEntries(
     Map.entry('A', "Crossbow"),
     Map.entry('B', "Longbow"),
     Map.entry('C', "Shortbow")
     );
     
     //Ranger Projectile Map
     Map<Character, String> Projectiles = Map.ofEntries(
     Map.entry('A', "Acid Arrows"),
     Map.entry('B', "Electric Arrows"),
     Map.entry('C', "Fire Arrows"),
     Map.entry('D', "Frost Arrows"),
     Map.entry('E', "Iron Arrows"),
     Map.entry('F', "Double Arrows"),
     Map.entry('G', "Point-Blank Arrows"),
     Map.entry('H', "Explosive Arrows"),
     Map.entry('I', "Weakness Arrows"),
     Map.entry('J', "Slowness Arrows"),
     Map.entry('K', "Dumbness Arrows"),
     Map.entry('L', "Shielding Arrows"),
     Map.entry('M', "Frailizing Arrows")
     );

     //Ranger Chosen Projectile Map
     Map<Character, String> ChosenProjectile = MapofEntries(
     Map.entry('A', projectile1Name),
     Map.entry('B', projectile2Name),
     Map.entry('C', projectile3Name),
     Map.entry('D', projectile4Name)
     );
      
     //Character Creation Variables
     boolean cLoop = true;//Choosing a Class
     boolean aLoop = true;//Choosing an Armor
     boolean w1Loop = true;//Choosing Weapon 1
     boolean w2Loop = true;//Choosing Weapon 2
     boolean w3Loop = true;//Choosing Weapon 3
     boolean w4Loop = true;//Choosing Weapon 4
     boolean s1Loop = true;//Choosing Spell 1
     boolean s2Loop = true;//Choosing Spell 2
     boolean s3Loop = true;//Choosing Spell 3
     boolean s4Loop = true;//Choosing Spell 4
     boolean mLoop = true;//Choosing a Magic Item
     boolean rLoop = true;//Choosing a Ranged Weapon
     boolean p1Loop = true;//Choosing Projectile 1
     boolean p2Loop = true;//Choosing Projectile 2
     boolean p3Loop = true;//Choosing Projectile 3
     boolean p4Loop = true;//Choosing Projectile 4
     boolean abilityLoop = true;//Allocating Ability points
     boolean strengthLoop = true;//Allocating Strength points
     boolean dexterityLoop = true;//Allocating Dexterity points
     boolean intelligenceLoop = true;//Allocating Intelligence points
     boolean charismaLoop = true;//Allocating Charisma points

     //Questing Loop Variables
     boolean f1aLoop = true;
        
     //RNG Variables
     int roll = 0;//Variable for dice rolls
     double attackRoll = 0;//Roll times ability score plus attack bonus
     
     //All Classes Variables
     char cClass = '\0';
     double maxHP;
     double cHP; //Current HP variable
     double cStrength = 0.0;
     int strBonus;
     double cDexterity = 0.0;
     int dexBonus;
     double cIntelligence = 0.0;
     int intBonus;
     double cCharisma = 0.0;
     int chaBonus;
     double defense = 13;
     int magicResistance;
     int attackBonus;
     int cSquare;//Determines which square you are in
     int actions;//Shows how many actions you have
     char choice;//Used during the quest as a variable based on user input to decide which route to take

     //Fighter only variables
     int armorBonus;
     int armorEnchant;
     char armor = '';
     String armorName = "";
     char weapon1;
     char weapon2;
     char weapon3;
     char weapon4;
     String weapon1Name = "";
     String weapon2Name = "";
     String weapon3Name = "";
     String weapon4Name = "";
     char chosenWeapon = '';
     String chosenWeaponName = "";

     //Wizard only variables
     int magicDefense;
     char spell1;
     char spell2;
     char spell3;
     char spell4;
     String spell1Name = "";
     String spell2Name = "";
     String spell3Name = "";
     String spell4Name = "";
     char magicItem;
     String magicItemName = "";
     boolean askRage = false;//Used for Rod of Rage; before every spell cast, this boolean determines if it asks the user whether they want to rage or not.
     boolean doRage = false;//Based on the user's answer, this boolean determines whether the spell bonus occurs.
     boolean ask1Sacrifice = false;//Used for Staff of Sacrifice; before every spell is cast, this boolean determines if it asks the user whether they want to sacrifice or not.
     boolean do1Sacrifice = false;//Based on the user's answer, this boolean determines whether the spell bonus occurs.
     boolean ask2Sacrifice = false;//Used for Staff of Sacrifice; before every spell is cast, this boolean determines if it asks the user whether they want to sacrifice again or not.
     boolean do2Sacrifice = false;//Based on the user's answer, this boolean determines whether the spell bonus occurs.
     boolean wonderWand = false;//Used for Wand of Wonder, this boolean determines whether the doWonder int for attack spells is set to one at the start of combat or not.
     int doWonder = 0;
     char chosenSpell = '';
     String chosenSpellName = "";
     
     //Ranger only variables
     int rangedEnchant;
     char rangedWeapon = '\0';
     String rangedWeaponName = "";
     char projectile1;
     char projectile2;
     char projectile3;
     char projectile4;
     String projectile1Name = "";
     String projectile2Name = "";
     String projectile3Name = "";
     String projectile4Name = "";
     char chosenProjectile = '';
     String chosenProjectileName = "";

     //Monster only variables
     double e1MaxHP;
     double e1CHP;
     int e1Strength;
     int e1Dexterity;
     int e1Intelligence;
     int e1Charisma;
     int e1Defense;
     int e1MagicResistance;
     int e1Actions;
     int e1Square;
     String e1Name;

     double e2MaxHP;
     double e2CHP;
     int e2Strength;
     int e2Dexterity;
     int e2Intelligence;
     int e2Charisma;
     int e2Defense;
     int e2MagicResistance;
     int e2Actions;
     int e2Square;
     String e2Name;

     double e3MaxHP;
     double e3CHP;
     int e3Strength;
     int e3Dexterity;
     int e3Intelligence;
     int e3Charisma;
     int e3Defense;
     int e3MagicResistance;
     int e3Actions;
     int e3Square;
     String e3Name;

     double e4MaxHP;
     double e4CHP;
     int e4Strength;
     int e4Dexterity;
     int e4Intelligence;
     int e4Charisma;
     int e4Defense;
     int e4MagicResistance;
     int e4Actions;
     int e4Square;
     String e4Name;

     double e5MaxHP;
     double e5CHP;
     int e5Strength;
     int e5Dexterity;
     int e5Intelligence;
     int e5Charisma;
     int e5Defense;
     int e5MagicResistance;
     int e5Actions;
     int e5Square;
     String e5Name;
     
     Scanner scanner = new Scanner(System.in);
     System.out.println("Hello fellow adventurer! Welcome to the quest of Finding Glory! Enter your character's name.");
     String name = scanner.next();
     scanner.nextLine();
     System.out.println("Good luck, "+name+"! May you find all the Glory! But beware, you must make the right decisions or you will fail.");
     System.out.println(name+", you must know the rules of this adventure. First of all, if I, the narrator, ask you to enter a number, do not enter any other characters. If you are given a list of choices that correspond to a letter, then just type the letter! Press Enter to continue.");
     scanner.nextLine();
     System.out.println("In this game, there is Defense. When you are attacked, your Defense score, which starts at 13, is subtracted from the enemy's success score, and the difference is how much HP you lose. This works the same way for the enemy when you attack an enemy. Press Enter to continue.");
     scanner.nextLine();
     System.out.println("Also, there is Magic Resistance. When an attack spell is casted, the caster must make an intelligence check and then either divide it by or subtract their opponent's Magic resistance from it to determine the damage done. The operation varies based on what spell is casted. Your starting Magic Resistance is 3. Press Enter to continue.");
     scanner.nextLine();
     System.out.println("When faced with a dilemma, there may be options to attack or to try to talk your way out of it or something else. If you choose to attack, you will go first in the round. If you fail to talk your way out of something, your new enemy goes first in the round. Press Enter to continue.");
     scanner.nextLine();
     System.out.println("In combat, there are 4 squares that are locations where you and each enemy are. The squares are named 1, 2, 3, and 4. Top right = #1, bottom right = #2, bottom left = #3, top left + #4. Press enter to continue.");
     scanner.nextLine();
     System.out.println("In each combat round, you and each enemy has a turn. In that turn, they can take 2 actions. In an action, they or you can attack, cast a spell, use a magic item, or move to a different square. Some special things take no action. Press Enter to continue.");
     scanner.nextLine();
     System.out.println("When attacking, a melee attack can only be made if you are in the same square as the enemy. A ranged attack can only be made from a different square than the enemy. Spell attacks' ranges can vary; for example, a fireball spell can only be made from a distance, otherwise the caster would be incinerated, and thankfully, this game doesn't let that happen - for you or the enemies. Press Enter to continue.");
     scanner.nextLine();

     while(cLoop){
     System.out.println("To start, you must choose your class.");
     System.out.println("A. Fighter");
     System.out.println("B. Wizard");
     System.out.println("C. Ranger");
     cClass = scanner.next().toUpperCase().charAt(0);
     scanner.nextLine();
     
      if(cClass == 'A'){
         cLoop = false;
         maxHP = 53;
         cHP = 53;
         strBonus = 1;
         dexBonus = 0;
         intBonus = 0;
         chaBonus = 0;
         magicResistance = 3;
         System.out.println("You chose the Fighter class. This is all about melee combat and physical strength. You must use brute force to obtain the Glory!");
         System.out.println("As a fighter, your HP is 53, higher than the other classes. You have a variety of melee weapons and armors to choose from. Fighters gain a +1 bonus on all Strength skill checks. Press Enter to continue.");
         scanner.nextLine();
         System.out.println("Time to choose your armor.");
         System.out.println("A. Crocodile Leather Armor: This light armor only provides a +3 Defense bonus, but has a level 5 enchantability, meaning it will likely have better enchantments when it is enchanted. This armor does not inhibit motion at all.");
         System.out.println("B. Crocodile Scale Mail: This medium armor provides a +5 Defense bonus, and has a level 3 enchantability. However, this armor inhibits movement. You will get a static -1 penalty to all Dexterity skill checks.");
         System.out.println("C. Crocodile Teeth Bone Plate: This heavy armor provides a high +7 Defense bonus, but only has a level 1 enchantability. Additionally, this armor impedes movement. You will get a static -2 penalty to all Dexterity skill checks.");
         while(aLoop){
         armor = scanner.next().toUpperCase().charAt(0);
         scanner.nextLine();
         if(armor == 'A'){
             aLoop = false;
             armorBonus = 3;
             armorEnchant = 5;
             defense = defense+armorBonus;
         }
         else if(armor == 'B'){
             aLoop = false;
             armorBonus = 5;
             armorEnchant = 3;
             defense = defense+armorBonus;
             dexBonus = -1;
         }
         else if(armor == 'C'){
             aLoop = false;
             armorBonus = 7;
             armorEnchant = 1;
             defense = defense+armorBonus;
             dexBonus = -2;
         }
         else{
             System.out.println("That is not a valid armor, "+name+". Try again.");
         }
         }
         armorName = Armors.get(armor);
         System.out.println("That "+armorName+" is going to protect you really well, "+name+"!");  
         System.out.println("Now that you've chosen your armor, the last thing to choose during this charaacter creation phase before ability points is to choose 4 weapons to wield. For now, just choose one."); 
         System.out.println("A. Battleaxe: Add your strength score to the end result of an attack, but take a -2 penalty on defense for this turn.");
         System.out.println("B. 2 Daggers: Gain a +2 bonus on defense for this turn, but deal -3 damage.");
         System.out.println("C. Flail: Increase your strength score by one for this attack, but the enemy becomes angry and gains a +1 to whatever ability they use to attack for their next attack.");
         System.out.println("D. Halberd: Target all enemies in melee range with your attack, but all enemies hit gain an extra attack against you.");
         System.out.println("E. 2 Handaxes: Target 2 enemies in melee range with your attack, but the damage done to each of them is cut in half.");
         System.out.println("F. Longsword: Just a longsword; no bonus, no penalty.");
         System.out.println("G. Mace: The target enemy takes a -1 penalty to their Strength score for one turn, but you take a -1 penalty on damage and defense for this turn.");
         System.out.println("H. Rapier: The target enemy takes a -1 penalty to their Dexterity score for one turn, but you take a -1 penalty on damage and defense for this turn.");
         System.out.println("I. Scimitar: The target enemy takes a -1 penalty to their Intelligence score for one turn, but you take a -1 penalty on damage and defense for this turn.");
         System.out.println("J. Scythe: With this weapon, you have a 1 in 5 chance of dealing double damage, but if it does not, then you gain a -3 penalty on damage.");
         System.out.println("K. Spear: You can make an attack against an enemy that is not in your square with this weapon, except you gain a -2 penalty on defense for one turn *this effect stacks*.");
         System.out.println("L. Trident: Your attack with this weapon is made 3 times, and the best result is taken. For the next attack made against you during this combat, the attacking enemy rolls their attack twice and takes the best result.");
         System.out.println("M. Warhammer: Deal splash damage equal to one half of the damage dealt to the target enemy to all other enemies in melee range. Deal one half of the splash damage dealt to yourself.");
         while(w1Loop){
         weapon1 = scanner.next().toUpperCase().charAt(0);
         if("ABCDEFGHIJKLM".indexOf(weapon1) >= 0){
             w1Loop = false;
             weapon1Name = Weapons.get(weapon1);
         }
         else{
             System.out.println("Sorry, "+name+". You can't have that weapon.");
         }
         }
         System.out.println("Good job, "+name+"! You now have "+weapon1Name+" in your arsenal!");
         System.out.println("Now it is time to choose your second weapon. It would be foolish to choose the same weapon twice unless you were looking for a challenge! Remember, you'll have four weapons, but you can only use one per attack.");
         while(w2Loop){
         weapon2 = scanner.next().toUpperCase().charAt(0);
         if("ABCDEFGHIJKLM".indexOf(weapon2) >= 0){
             w2Loop = false;
             weapon2Name = Weapons.get(weapon2);
         }
         else{
             System.out.println("Sorry, "+name+". You can't have that weapon.");
         }
         }
         System.out.println("Well done, "+name+"! You now have "+weapon2Name+" in your belt!");
         System.out.println("You know what to do now. What would you like as your third weapon?");
         while(w3Loop){
         weapon3 = scanner.next().toUpperCase().charAt(0);
         if("ABCDEFGHIJKLM".indexOf(weapon3) >= 0){
             w3Loop = false;
             weapon3Name = Weapons.get(weapon3);
         }
         else{
             System.out.println("Sorry, "+name+". You can't have that weapon.");
         }
         }
         System.out.println("Great pick, "+name+"! You now have "+weapon3Name+" in your control!");
         System.out.println("Fourth?");
         while(w4Loop){
         weapon4 = scanner.next().toUpperCase().charAt(0);
         if("ABCDEFGHIJKLM".indexOf(weapon4) >= 0){
             w4Loop = false;
             weapon4Name = Weapons.get(weapon4);
         }
         else{
             System.out.println("Sorry, "+name+". You can't have that weapon.");
         }   
         }
         System.out.println("At last, "+name+"! You now have "+weapon4Name+" in your possesion!");
     }
     else if(cClass == 'B'){
         cLoop = false;
         maxHP = 45;
         cHP = 45;
         strBonus = 0;
         dexBonus = 0;
         intBonus = 1;
         chaBonus = 0;
         magicResistance = 4;
         System.out.println("You chose the Wizard class. This is all about the wondrous world of magic and spells. You must use intelligence to gain the Glory!");
         System.out.println("As a wizard, your HP is 45. You also have a special talent for magical defense; you have a static +1 bonus to Magic Resistance; no other classes have this. You have a variety of spells and magic items to choose from. Wizards also gain a +1 bonus on all Intelligence skill checks. Press Enter to continue.");
         scanner.nextLine();
         System.out.println("As a wizard, you have no armor; instead, Defense bonus is gained through spells and magic items. Below is a list of spells; you will be able to pick 4. For the moment, choose one.");
         System.out.println("A. Mage's Shield: A floating shield that grants a temporary +4 Defense bonus *does not stack with itself*.");
         System.out.println("B. Minor Healing: Heal 5 HP. You cannot go beyond your maximum HP.");
         System.out.println("C. Lions's Strength: Gain a temporary +1 bonus to your Strength score *does not stack with itself*.");
         System.out.println("D. Bobcat's Dexterity: Gain a temporary +1 bonus to your Dexterity score *does not stack with itself*.");
         System.out.println("E. Dolphin's Intelligence: Gain a temporary +1 bonus to your Intelligence score *does not stack with itself*.");
         System.out.println("F. Snake's Charisma: Gain a temporary +1 bonus to your Charisma score *does not stack with itself*.");
         System.out.println("G. Fireball: Make an intelligence check and deal damage to all enemies you are fighting equal to the intelligence check divided by the enemy's Magic Resistance score.");
         System.out.println("H. Magic Torpedo: Make an intelligence check and deal damage to one enemy you are fighting equal to the intelligence check minus their Magic Resistance score.");
         System.out.println("I. Poison Cloud: Make an intelligence check and deal damage equal to all enemies you are fighting every turn for 4 turns equal to the intelligence check divided by twice the enemy's Magic Resistance score.");
         System.out.println("J. Curse of Weakness: One enemy you are fighting gains a permanent -1 penalty to their Strength score. A single enemy can only have one Curse of Weakness at a time.");
         System.out.println("K. Curse of Slowness: One enemy you are fighting gains a permanent -1 penalty to their Dexterity score. A single enemy can only have one Curse of Slowness at a time.");
         System.out.println("L. Curse of Stupidity: One enemy you are fighting gains a permanent -1 penalty to their Intelligence score. A single enemy can only have one Curse of Stupidity at a time.");
         System.out.println("M. Curse of Babbling: One enemy you are fighting gains a permanent -1 penalty to their Charisma score. A single enemy can only have one Curse of Babbling at a time.");
         while(s1Loop){
         spell1 = scanner.next().toUpperCase().charAt(0);
         if("ABCDEFGHIJKLM".indexOf(spell1) >= 0){
             s1Loop = false;
             spell1Name = Spellbook.get(spell1);
         }
         else{
             System.out.println("That is not a valid spell choice, "+name+". Try again.");
         }
         }
         System.out.println("Nice, "+name+"! Your first choice, "+spell1Name+", was recorded in your spellbook!");
         System.out.println("Alright, now it is time to choose your second spell. It would not be wise to choose the same spell unless you are looking for a challenge in which you want fewer spells.");
         while(s2Loop){
         spell2 = scanner.next().toUpperCase().charAt(0);
         if("ABCDEFGHIJKLM".indexOf(spell2) >= 0){
             s2Loop = false;
             spell2Name = Spellbook.get(spell2);
         }
         else{
             System.out.println("That is not a valid spell choice, "+name+". Try again.");
         }
         }
         System.out.println("Congrats, "+name+"! Your first choice, "+spell2Name+", was logged in your spellbook!");
         System.out.println("You know the drill. What's your third pick?");
         while(s3Loop){
         spell3 = scanner.next().toUpperCase().charAt(0);
         if("ABCDEFGHIJKLM".indexOf(spell3) >= 0){
             s3Loop = false;
             spell3Name = Spellbook.get(spell3);
         }
         else{
             System.out.println("That is not a valid spell choice, "+name+". Try again.");
         }
         }
         System.out.println("Amazing, "+name+"! Your first choice, "+spell3Name+", was written in your spellbook!");
         System.out.println("Last Spell?");
         while(s4Loop){
         spell4 = scanner.next().toUpperCase().charAt(0);
         if("ABCDEFGHIJKLM".indexOf(spell4) >= 0){
             s4Loop = false;
             spell4Name = Spellbook.get(spell4);
         }
         else{
             System.out.println("That is not a valid spell choice, "+name+". Try again.");
         }
         }
         System.out.println("Wonderful, "+name+"! Your first choice, "+spell4Name+", was engraved in your spellbook!");
         System.out.println("Now it is time to choose one of 3 magic items that will imbue your spells with even more power!");
         System.out.println("A. Rod of Rage: When you cast a spell, you can choose to go into a rage. If you do, the spell's effect is multiplied by 1.5, but the enemy's next attack deals 1.5x damage.");
         System.out.println("B. Staff of Sacrifice: When you cast a spell, you can choose to lose 3 HP to increase the effect of certain spells: +2 for defense spells, +4 on damage spells, 0 increase on heal spells. If you choose to lose 2 extra HP, then your buff spells and debuff spells gain a +1 increase.");
         System.out.println("C. Wand of Wonder: Your first attack spell of the combat deals 2.5x damage.");
         while(mLoop){
         magicItem = scanner.next().toUpperCase().charAt(0);
         if(magicItem == 'A'){
         mLoop = false;
         askRage = true;
         }
         else if(magicItem == 'B'){
         mLoop = false;
         ask1Sacrifice = true;
         ask2Sacrifice = true;
         }
         else if(magicItem == 'C'){
         mLoop = false;
         wonderWand = true;
         }
         else{
         System.out.println("Sorry, "+name+". You can't have that magic item. Try again.");
         }
         }
     }
     else if(cClass == 'C'){
         cLoop = false;
         maxHP = 45;
         cHP = 45;
         strBonus = 0;
         dexBonus = 1;
         intBonus = 0;
         chaBonus = 0;
         defense ++;
         magicResistance = 3;
         attackBonus = -3;
         System.out.println("You chose the Ranger class. This is all about ranged attacks and dexterity. You must use agile force to win the Glory!");
         System.out.println("As a ranger, your HP is 45. You have a unique ability to dodge attacks; you have a static +1 to Defense, which no other class has. You have a variety of ranged weapons and projectiles to choose from. Rangers also gain a +1 bonus on all Dexterity skill checks. Press Enter to continue.");
         scanner.nextLine();
         System.out.println("As a ranger, you have no armor; your Defense bonus is equal to the starting 14 + your Dexterity score. Rangers are very powerful; their ranged weapons and projectiles can deal a lot of damage, but due to the distance they have to cover, they deal -4 damage; don't worry about it though. Choose your ranged weapon now.");
         System.out.println("A. Crossbow: You gain a +5 bonus to damage with this weapon, but its enchantability is only 1, meaning enchantments on this weapon will not have a very high effect.");
         System.out.println("B. Longbow: You gain a +3 bonus to damage with this weapon, and its enchantability is 3.");
         System.out.println("C. Shortbow: You only gain a +1 bonus to damage with this weapon, but its enchantability is 5.");
         while(rLoop){
         rangedWeapon = scanner.next().toUpperCase().charAt(0);
         if(rangedWeapon == 'A'){
              rLoop = false;
              attackBonus = attackBonus+5;
              rangedEnchant = 1;
         }
         else if(rangedWeapon == 'B'){
              rLoop = false;
              attackBonus = attackBonus+3;
              rangedEnchant = 3;
         }
         else if(rangedWeapon == 'C'){
              rLoop = false;
              attackBonus = attackBonus+1;
              rangedEnchant = 5;
         }
         else{
              System.out.println("That is not a valid ranged weapon choice, "+name+". Try again.");
         }
         }
         rangedWeaponName = Bows.get(rangedWeapon);
         System.out.println("That "+rangedWeaponName+" is sure to kill your enemies, "+name".");
         System.out.println("Now for the fun. It's time to choose some projectiles that will be shooting out of your "+rangedWeaponName+"! You will be able to choose four different projectiles; you can only choose to use one per attack, though. For now, choose your first projectile.");
         System.out.println("A. Acid Arrows: The targeted enemy takes 1 acid damage every turn *this effect DOES stack*!");
         System.out.println("B. Electric Arrows: The targeted enemy loses one action *this effect does not stack* but the shock shocks you, giving you a -3 penalty on defensee *non-stacking*.");
         System.out.println("C. Fire Arrows: Deal additional damage - this is random, it varies between 1 and 4. ");
         System.out.println("D. Frost Arrows: The targeted enemy can only make one melee attack for 2 turns *this effect does not stack* but the freezing arrow gives you a -2 penalty on defense for one turn *non-stacking*.");
         System.out.println("E. Iron Arrows: Gain a +2 bonus on damage for this attack.");
         System.out.println("F. Double Arrows: When you attack, roll the attack twice and take the better result.");
         System.out.println("G. Point-Blank Arrows: You can make an attack against an enemy that is in your square with this arrow, but you gain a -2 penalty on defense for one turn *this effect stacks*.");
         System.out.println("H. Explosive Arrows: This attack deals splash damage to all other enemies equal to half of the damage dealt to the target enemy. Take damage equal to half of the splash damage.");
         System.out.println("I. Weakness Arrows: Targeted enemy gains a -1 penalty to their Strength score for one turn *this effect does not stack*.");
         System.out.println("J. Slowness Arrows: Targeted enemy gains a -1 penalty to their Dexterity score for one turn *this effect does not stack*.");
         System.out.println("K. Dumbness Arrows: Targeted enemy gains a -1 penalty to their Intelligence score for one turn *this effect does not stack*.");
         System.out.println("L. Shielding Arrows: You gain a +2 bonus to defense for 1 turn *this effect does not stack*.");
         System.out.println("M. Frailizing Arrows: The enemy gains a -2 penalty to their defense for the next two times you attack them *this effect does not stack*.");
         while(p1Loop){
         projectile1 = scanner.next().toUpperCase().charAt(0);
         if("ABCDEFGHIJKLM".indexOf(projectile1) >= 0){
         p1Loop = false;
         projectile1Name = Projectiles.get(projectile1)
         }
         else{
         System.out.println("That is not a valid choice for a projectile, "+name+". Try again.");
         }
         }
         System.out.println("Good choice, "+name"! Those "+projectile1Name" were added to your quiver.");
         System.out.println("Now pick your the second projectile that you want. You shouldn't pick the same projectile twice in a row unless you want to give yourself a challenge!");
         while(p2Loop){
         projectile2 = scanner.next().toUpperCase().charAt(0);
         if("ABCDEFGHIJKLM".indexOf(projectile2) >= 0){
         p2Loop = false;
         projectile2Name = Projectiles.get(projectile2)
         }
         else{
         System.out.println("That is not a valid choice for a projectile, "+name+". Try again.");
         }
         }
         System.out.println("Wonderful pick, "+name"! Those "+projectile2Name" were stuffed into your belt.");
         System.out.println("You know the drill. What's your third projectile going to be?");
         while(p3Loop){
         projectile3 = scanner.next().toUpperCase().charAt(0);
         if("ABCDEFGHIJKLM".indexOf(projectile3) >= 0){
         p3Loop = false;
         projectile3Name = Projectiles.get(projectile3)
         }
         else{
         System.out.println("That is not a valid choice for a projectile, "+name+". Try again.");
         }
         }
         System.out.println("That's a great one, "+name"! Those "+projectile3Name" were just placed into your secret arrow compartment.");
         System.out.println("Fourth?");
         while(p4Loop){
         projectile4 = scanner.next().toUpperCase().charAt(0);
         if("ABCDEFGHIJKLM".indexOf(projectile4) >= 0){
         p4Loop = false;
         projectile4Name = Projectiles.get(projectile4)
         }
         else{
         System.out.println("That is not a valid choice for a projectile, "+name+". Try again.");
         }
         }
         System.out.println("Amazing arrow, "+name"! Those "+projectile4Name" were stored safely within your pockets.");
     }
     else{
         System.out.println("That is not a valid class, "+name+". Try again.");
     }
     }
     System.out.println("Now it is time to allocate points into your skills: Strength, Dexterity, Intelligence, and Charisma, which is for speaking. When you make an ability check, a six sided die will be rolled virtually, and the result will be multiplied by your skill score, and any static bonuses or penalties you have will be added at the end. The skill used depends on the situation. You have a total of 10 points to allocate *decimals allowed, no negatives allowed*.");
     while(abilityLoop){
     strengthLoop = true;
     dexterityLoop = true;
     intelligenceLoop = true;
     charismaLoop = true;

     System.out.println("How many points would you like in Strength?");
     while(strengthLoop){
     cStrength = scanner.nextDouble();
     if(cStrength <= 10){
         if(cStrength < 0){
             System.out.println("You cannot have a negative number of points in Strength, "+name+". Try again.");
         }
         else{
             strengthLoop = false;
         }
     }
     else{
         System.out.println("You cannot have that many points in Strength, "+name+". Your total amount of ability points cannot exceed 10. Try again.");
     }
     }
     System.out.println("How many points would you like in Dexterity? If you are a ranger, your dexterity score determines your defense bonus.");
     while(dexterityLoop){
     cDexterity = scanner.nextDouble();
     if(cDexterity <= 10-cStrength){
         if(cDexterity < 0){
             System.out.println("You cannot have a negative number of points in Dexterity, "+name+". Try again.");
         }
         else{
             dexterityLoop = false;
         }
     }
     else{
         System.out.println("You cannot have that many points in Dexterity, "+name+". Your total amount of ability points cannot exceed 10. Try again.");
     }
     }
     System.out.println("How many points would you like in Intelligence?");
     while(intelligenceLoop){
     cIntelligence = scanner.nextDouble();
     if(cIntelligence <= 10-cStrength-cDexterity){
         if(cIntelligence < 0){
             System.out.println("You cannot have a negative number of points in Intelligence, "+name+". Try again.");
         }
         else{
             intelligenceLoop = false;
         }
     }
     else{
         System.out.println("You cannot have that many points in Intelligence, "+name+". Your total amount of ability points cannot exceed 10. Try again.");
     }
     }
     System.out.println("How many points would you like in Charisma?");
     while(charismaLoop){
     cCharisma = scanner.nextDouble();
     if(cCharisma <= 10-cStrength-cDexterity-cIntelligence){
         if(cCharisma < 0){
             System.out.println("You cannot have a negative number of points in Charisma, "+name+". Try again.");
         }
         else{
         charismaLoop = false;
         }
     }
     else{
         System.out.println("You cannot have that many points in Charisma, "+name+". Your total amount of ability points cannot exceed 10. Try again.");
     }
     }
     scanner.nextLine();
     if(cStrength+cDexterity+cIntelligence+cCharisma < 10){
         System.out.println("You didn't allocate "+(10-cStrength-cDexterity-cIntelligence-cCharisma)+" points! Oh well, maybe you were looking for a challenge, or maybe you were bad at math. If you want to reallocate your points, type in any character and then Enter. If you do not, simply press Enter.");
         if(scanner.nextLine().isEmpty()){
            abilityLoop = false;
         }
     }
     else{
        abilityLoop = false;
     }
     }
     if(cClass == 'C'){
         defense = defense+cDexterity;
     }
          System.out.println("You have officially allocated your ability points, and now you are ready for your adventure! The Quest For Glory begins NOW!!!");

     System.out.println("Your first encounter is a fight. There's no talking your way out of this one. Press Enter to continue.
     scanner.nextLine();
     scanner.nextLine();
     if(cClass == 'A'){
          System.out.println("A montstrous Nibbit who will use his claws and teeth to attack stands in front of you. You are both in square 1. You get to go first. Would you like to move to a different square, or attack it?");
          cSquare = 1;
          e1Square = 1;
          actions = 2;
          e1Actions = 2;
          e1MaxHP = 40;
          e1CHP = 40;
          e1Strength = 3;
          e1Dexterity = 2;
          e1Intelligence = 1;
          e1Charisma = 0;
          e1Defense = 17;
          e1MagicResistance = 2;
          while(e1CHP > 0){
          //If there were multiple enemies just use && for the different enemies' current HP
          //If the enemy goes first, place their actions here instead of after the while(actions > 0) loop!!!
          while(actions > 0){
          choice = null;
          if(cSquare == e1Square){//If there were multiple enemies just use || to check if (cSquare == e1Square || cSquare == e2Square)
               System.out.println("A. Attack.");
               System.out.println("B. Move.");
               choice = scanner.next().toUpperCase().charAt(0);
               if(choice == 'A'){
                    actions--;
                    System.out.println("What weapon would you like to use to attack?");
                    System.out.println("A. "+weapon1Name);
                    System.out.println("B. "+weapon2Name);
                    System.out.println("C. "+weapon3Name);
                    System.out.println("D. "+weapon4Name);
                    while(f1aLoop){
                    chosenWeapon = scanner.next().toUpperCase().charAt(0);
                    if("ABCD".indexOf(chosenWeapon) >= 0){
                         chosenWeaponName = ChosenWeapon.get(chosenWeapon);
                         System.out.println("You attack the Nibbit with your "+chosenWeaponName+"!");
                         WEAPONS.caseWeapon();
                    }
                    else{
                         System.out.println("You can't attack with that, "+name+". Try again.");
                    }
                    }
               }
               else if(choice == 'B'){
                    actions--;
                    Move.execute();
               }
          }
          else{
               if(weapon1Name.equals("Spear") || weapon2Name.equals("Spear") || weapon3Name.equals("Spear") || weapon4Name.equals("Spear")){
                    System.out.println("Since your are not in the same square with any creature, but you have the spear as one of your weapons, your two choices are:");
                    System.out.println("A. Spear the Nibbit.");
                    System.out.println("B. Move.");
                    while(true){
                    choice = scanner.next().toUpperCase().charAt(0);
                    if(choice == 'A'){
                         actions--;
                         Spear.execute();
                         break;
                    }  
                    else if(choice == 'B'){
                         actions--;
                         Move.execute();
                         break;
                    }
                    else{
                         System.out.println("That is not a valid choice, "+name+". Try again.");
                    }
                    }
               }
               else{
                    System.out.println("Since you are not in the same square as any other creature, your only availible action is to move. Press Enter to move.");
                    Move.execute();
               }
          }
          }
          }
     }





    }

    
}












