package quest;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.io.*;

public class Quest {

    public static Map<Character, Integer> ChosenSquare = new HashMap<>();
    public static Map<Character, String> ChosenWeapon = new HashMap<>();
    public static Map<Character, String> ChosenSpell = new HashMap<>();
    public static Map<Character, String> ChosenProjectile = new HashMap<>();

    public static String name = "";
    public static char cClass = '\0';

    public static ArrayList<Enemy> enemies = new ArrayList<>();
    public static Enemy e = null;

    public static boolean t1 = false;
    public static boolean t2 = false;
    public static boolean t3 = false;
    public static boolean t4 = false;
    public static boolean t5 = false;
    public static boolean t6 = false;
    public static boolean t7 = false;
    public static boolean t8 = false;
    public static boolean t9 = false;
    public static boolean t10 = false;
    public static boolean t11 = false;
    public static boolean t12 = false;
    public static boolean t13 = false;
    public static boolean t14 = false;
    public static boolean t15 = false;
    public static boolean t16 = false;
    public static boolean t17 = false;
    public static boolean t18 = false;
    public static boolean t19 = false;
    public static boolean t20 = false;
    public static boolean t21 = false;
    public static boolean t22 = false;
    public static boolean t23 = false;
    public static boolean t24 = false;
    public static boolean t25 = false;
    public static boolean t26 = false;
    public static boolean t27 = false;
    public static boolean t28 = false;
    public static boolean t29 = false;
    public static boolean t30 = false;
    public static boolean t31 = false;
    public static boolean t32 = false;
    public static boolean t33 = false;
    public static boolean t34 = false;
    public static boolean t35 = false;
    public static boolean t36 = false;
    public static boolean t37 = false;
    public static boolean t38 = false;
    public static boolean t39 = false;
    public static boolean t40 = false;
    public static boolean t41 = false;
    public static boolean t42 = false;
    public static boolean t43 = false;
    public static boolean t44 = false;
    public static boolean t45 = false;
    public static boolean t46 = false;
    public static boolean t47 = false;
    public static boolean t48 = false;
    public static boolean t49 = false;

    public static double maxHP = 1;
    public static volatile double cHP = 1;
    public static int roll;
    public static double attackRoll;
    public static double damageDealt;
    public static double cStrength = 0;
    public static int strBonus = 0;
    public static double cDexterity = 0;
    public static int dexBonus = 0;
    public static double cIntelligence = 0;
    public static int intBonus = 0;
    public static double cCharisma = 0;
    public static int chaBonus = 0;
    public static int attackBonus = 0;
    public static double defense = 13;
    public static int magicResistance = 0;
    public static int cSquare;
    public static int actions;

    public static char choice;//Used during the quest as a variable based on user input to decide which route to take
    public static char charChoice;

    public static char choiceMove;
    public static char charMove;
    public static char charMove1 = '\0';
    public static char charMove2 = '\0';
    public static char charMove3 = '\0';
    public static char charMove4 = '\0';
    public static int chosenSquareName = 0;

    public static String armorName = "";
    public static int armorBonus = 0;
    public static int armorEnchant = 0;
    public static String weapon1Name = "";
    public static String weapon2Name = "";
    public static String weapon3Name = "";
    public static String weapon4Name = "";
    public static char chosenWeapon = '\0';
    public static char charSpear;
    public static char charWeapon;
    public static int battleaxe = 0;
    public static int daggers = 0;
    public static int mace = 0;
    public static int rapier = 0;
    public static int scimitar = 0;
    public static int spear = 0;
    public static String chosenWeaponName = "";

    public static int magicDefense;
    public static String spell1Name = "";
    public static String spell2Name = "";
    public static String spell3Name = "";
    public static String spell4Name = "";
    public static String chosenSpellName = "";
    public static String magicItemName = "";
    public static char chosenSpell = '\0';
    public static char charSpell = '\0';
    public static boolean askRage = false;//Used for Rod of Rage; before every spell cast, this boolean determines if it asks the user whether they want to rage or not.
    public static boolean doRage = false;//Based on the user's answer, this boolean determines whether the spell bonus occurs.
    public static int rages = 0;
    public static boolean ask1Sacrifice = false;//Used for Staff of Sacrifice; before every spell is cast, this boolean determines if it asks the user whether they want to sacrifice or not.
    public static boolean do1Sacrifice = false;//Based on the user's answer, this boolean determines whether the spell bonus occurs.
    public static boolean ask2Sacrifice = false;//Used for Staff of Sacrifice; before every spell is cast, this boolean determines if it asks the user whether they want to sacrifice again or not.
    public static boolean do2Sacrifice = false;//Based on the user's answer, this boolean determines whether the spell bonus occurs.
    public static boolean wonderWand = false;//Used for Wand of Wonder, this boolean determines whether the doWonder int for attack spells is set to one at the start of combat or not.
    public static boolean doWonder = false;
    public static boolean magesShield = false;
    public static boolean lionsStrength = false;
    public static boolean bobcatsDexterity = false;
    public static boolean dolphinsIntelligence = false;
    public static boolean snakesCharisma = false;

    public static String rangedWeaponName = "";
    public static int rangedEnchant = 0;
    public static char charProjectile;
    public static String projectile1Name = "";
    public static String projectile2Name = "";
    public static String projectile3Name = "";
    public static String projectile4Name = "";
    public static char chosenProjectile = '\0';
    public static String chosenProjectileName = "";

    public enum Terrain {
        GRASS(1, "Grass", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        WHEAT(2, "Wheat", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        ROCK(3, "Rock", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        WATER_RIVER(4, "Water River", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        WATER_RIVER_BOAT(5, "Water River Boat", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        WATER_LAKE(6, "Water Lake", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        WATER_LAKE_BOAT(7, "Water Lake Boat", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        JUNGLE_FOREST(8, "Jungle Forest", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        JUNGLE_TEMPLE(9, "Jungle Temple", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        FOREST_OAK(10, "Forest Oak", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        FOREST_DARK(11, "Forest Dark", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        FOREST_DAPPLED(12, "Forest Dappled", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        FOREST_ANCIENT(13, "Forest Ancient", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        SAVANNA(14, "Savanna", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        DESERT_CACTI(15, "Desert Cacti", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        DESERT_SANDPIT(16, "Desert Sandpit", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        DESERT_TEMPLE(17, "Desert Temple", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        OVERGROWTH(18, "Overgrowth", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        FLOWERS_BEES(19, "Flowers Bees", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        FLOWERS_BUTTERFLIES(20, "Flowers Butterflies", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        SNOWY_PLAINS(21, "Snowy Plains", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        SNOWY_FOREST(22, "Snowy Forest", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        UNDERGROUND_CRYSTALS(23, "Underground Crystals", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        UNDERGROUND_DARK(24, "Underground Dark", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        UNDERGROUND_DEEP_DARK(25, "Underground Deep Dark", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        GEYSER_WATER(26, "Geyser Water", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        GEYSER_TOXIC(27, "Geyser Toxic", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        VILLAGE(28, "Village", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        ICE_SPIKES(29, "Ice Spikes", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        ICE_IGLOOS(30, "Ice Igloos", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        VOLCANO(31, "Volcano", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        CHASM_WATER(32, "Chasm Water", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        CHASM_LAVA(33, "Chasm Lava", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        RAVINE_STONE(34, "Ravine Stone", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        RAVINE_MINERALS(35, "Ravine Minerals", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        FOSSILS(36, "Fossils", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        MINESHAFT(37, "Mineshaft", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        FORTRESS(38, "Fortress", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        STRONGHOLD(39, "Stronghold", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        BASTION(40, "Bastion", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        AIRSHIP(41, "Airship", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        MESA(42, "Mesa", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        BADLANDS(43, "Badlands", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        OCEAN(44, "Ocean", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        OCEAN_MONUMENT(45, "Ocean Monument", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        OCEAN_CHASM(46, "Ocean Chasm", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        OCEAN_RAVINE(47, "Ocean Ravine", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        ASCENSION(48, "Ascension", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        GLORY(49, "Glory", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        public final int encounterNumber;
        public final String encounterName;
        public final int moveSquares;
        public final int meleePenalty;
        public final int meleeBonus;
        public final int magicPenalty;
        public final int magicBonus;
        public final int rangedPenalty;
        public final int rangedBonus;
        public final int sPenalty;
        public final int sBonus;
        public final int dPenalty;
        public final int dBonus;
        public final int iPenalty;
        public final int iBonus;
        public final int cPenalty;
        public final int cBonus;

        Terrain (int encounterNumber, String encounterName, int moveSquares, int meleePenalty, int meleeBonus, int magicPenalty, int magicBonus, int rangedPenalty, int rangedBonus, int sPenalty, int sBonus, int dPenalty, int dBonus, int iPenalty, int iBonus, int cPenalty, int cBonus) {
            this.encounterNumber = encounterNumber;
            this.encounterName = encounterName;
            this.moveSquares = moveSquares;
            this.meleePenalty = meleePenalty;
            this.meleeBonus = meleeBonus;
            this.magicPenalty = magicPenalty;
            this.magicBonus = magicBonus;
            this.rangedPenalty = rangedPenalty;
            this.rangedBonus = rangedBonus;
            this.sPenalty = sPenalty;
            this.sBonus = sBonus;
            this.dPenalty = dPenalty;
            this.dBonus = dBonus;
            this.iPenalty = iPenalty;
            this.iBonus = iBonus;
            this.cPenalty = cPenalty;
            this.cBonus = cBonus;
        }
    }

    public static Terrain[][] terrains = {
            {Terrain.GRASS, Terrain.WHEAT, Terrain.WATER_RIVER_BOAT, Terrain.WATER_LAKE, Terrain.WATER_LAKE_BOAT, Terrain.JUNGLE_FOREST, Terrain.JUNGLE_TEMPLE},
            {Terrain.ROCK, Terrain.WATER_RIVER, Terrain.FOREST_OAK, Terrain.FOREST_DARK, Terrain.FOREST_DAPPLED, Terrain.FOREST_ANCIENT, Terrain.SAVANNA},
            {Terrain.DESERT_CACTI, Terrain.DESERT_SANDPIT, Terrain.DESERT_TEMPLE, Terrain.OVERGROWTH, Terrain.FLOWERS_BEES, Terrain.FLOWERS_BUTTERFLIES, Terrain.SNOWY_PLAINS},
            {Terrain.SNOWY_FOREST, Terrain.UNDERGROUND_CRYSTALS, Terrain.UNDERGROUND_DARK, Terrain.UNDERGROUND_DEEP_DARK, Terrain.GEYSER_WATER, Terrain.GEYSER_TOXIC, Terrain.VILLAGE},
            {Terrain.ICE_SPIKES, Terrain.ICE_IGLOOS, Terrain.VOLCANO, Terrain.CHASM_WATER, Terrain.CHASM_LAVA, Terrain.RAVINE_STONE, Terrain.RAVINE_MINERALS},
            {Terrain.FOSSILS, Terrain.MINESHAFT, Terrain.FORTRESS, Terrain.STRONGHOLD, Terrain.BASTION, Terrain.AIRSHIP, Terrain.MESA},
            {Terrain.BADLANDS, Terrain.OCEAN, Terrain.OCEAN_MONUMENT, Terrain.OCEAN_CHASM, Terrain.OCEAN_RAVINE, Terrain.ASCENSION, Terrain.GLORY}
    };

    public static int row = 0;
    public static int column = 0;
    public static int encounter = 0;
    public static Terrain t = null;

    public static void Save(){
        try (FileWriter writer = new FileWriter("savegame.txt")) {
            writer.write(name+"\n");
            writer.write(cClass+"\n");
            writer.write(maxHP+"\n");
            writer.write(cHP+"\n");
            writer.write(cStrength+"\n");
            writer.write(strBonus+"\n");
            writer.write(cDexterity+"\n");
            writer.write(dexBonus+"\n");
            writer.write(cIntelligence+"\n");
            writer.write(intBonus+"\n");
            writer.write(cCharisma+"\n");
            writer.write(chaBonus+"\n");
            writer.write(attackBonus+"\n");
            writer.write(defense+"\n");
            writer.write(magicResistance+"\n");
            writer.write(armorBonus+"\n");
            writer.write(armorEnchant+"\n");
            writer.write(armorName+"\n");
            writer.write(weapon1Name+"\n");
            writer.write(weapon2Name+"\n");
            writer.write(weapon3Name+"\n");
            writer.write(weapon4Name+"\n");
            writer.write(spell1Name+"\n");
            writer.write(spell2Name+"\n");
            writer.write(spell3Name+"\n");
            writer.write(spell4Name+"\n");
            writer.write(magicItemName+"\n");
            writer.write(askRage+"\n");
            writer.write(ask1Sacrifice+"\n");
            writer.write(ask2Sacrifice+"\n");
            writer.write(wonderWand+"\n");
            writer.write(rangedWeaponName+"\n");
            writer.write(rangedEnchant+"\n");
            writer.write(projectile1Name+"\n");
            writer.write(projectile2Name+"\n");
            writer.write(projectile3Name+"\n");
            writer.write(projectile4Name+"\n");
            writer.write(t1+"\n");
            writer.write(t2+"\n");
            writer.write(t3+"\n");
            writer.write(t4+"\n");
            writer.write(t5+"\n");
            writer.write(t6+"\n");
            writer.write(t7+"\n");
            writer.write(t8+"\n");
            writer.write(t9+"\n");
            writer.write(t10+"\n");
            writer.write(t11+"\n");
            writer.write(t12+"\n");
            writer.write(t13+"\n");
            writer.write(t14+"\n");
            writer.write(t15+"\n");
            writer.write(t16+"\n");
            writer.write(t17+"\n");
            writer.write(t18+"\n");
            writer.write(t19+"\n");
            writer.write(t20+"\n");
            writer.write(t21+"\n");
            writer.write(t22+"\n");
            writer.write(t23+"\n");
            writer.write(t24+"\n");
            writer.write(t25+"\n");
            writer.write(t26+"\n");
            writer.write(t27+"\n");
            writer.write(t28+"\n");
            writer.write(t29+"\n");
            writer.write(t30+"\n");
            writer.write(t31+"\n");
            writer.write(t32+"\n");
            writer.write(t33+"\n");
            writer.write(t34+"\n");
            writer.write(t35+"\n");
            writer.write(t36+"\n");
            writer.write(t37+"\n");
            writer.write(t38+"\n");
            writer.write(t39+"\n");
            writer.write(t40+"\n");
            writer.write(t41+"\n");
            writer.write(t42+"\n");
            writer.write(t43+"\n");
            writer.write(t44+"\n");
            writer.write(t45+"\n");
            writer.write(t46+"\n");
            writer.write(t47+"\n");
            writer.write(t48+"\n");
            writer.write(t49+"\n");
            writer.write(row+"\0");
            writer.write(column+"\0");

            System.out.println("Game saved!");
        }
        catch (IOException e) {
            System.out.println("Save failed.");
            e.printStackTrace();
        }
    }

    public static void Load(){
        File file = new File("savegame.txt");
        try(Scanner reader = new Scanner(file)){
            name = reader.nextLine().trim();
            cClass = reader.nextLine().trim().charAt(0);
            maxHP = Double.parseDouble(reader.nextLine().trim());
            cHP = Double.parseDouble(reader.nextLine().trim());
            cStrength = Double.parseDouble(reader.nextLine().trim());
            strBonus = Integer.parseInt(reader.nextLine().trim());
            cDexterity = Double.parseDouble(reader.nextLine().trim());
            dexBonus = Integer.parseInt(reader.nextLine().trim());
            cIntelligence = Double.parseDouble(reader.nextLine().trim());
            intBonus = Integer.parseInt(reader.nextLine().trim());
            cCharisma = Double.parseDouble(reader.nextLine().trim());
            chaBonus = Integer.parseInt(reader.nextLine().trim());
            attackBonus = Integer.parseInt(reader.nextLine().trim());
            defense = Double.parseDouble(reader.nextLine().trim());
            magicResistance = Integer.parseInt(reader.nextLine().trim());
            armorBonus = Integer.parseInt(reader.nextLine().trim());
            armorEnchant = Integer.parseInt(reader.nextLine().trim());
            armorName = reader.nextLine().trim();
            weapon1Name = reader.nextLine().trim();
            weapon2Name = reader.nextLine().trim();
            weapon3Name = reader.nextLine().trim();
            weapon4Name = reader.nextLine().trim();
            spell1Name = reader.nextLine().trim();
            spell2Name = reader.nextLine().trim();
            spell3Name = reader.nextLine().trim();
            spell4Name = reader.nextLine().trim();
            magicItemName = reader.nextLine().trim();
            askRage = Boolean.parseBoolean(reader.nextLine().trim());
            ask1Sacrifice = Boolean.parseBoolean(reader.nextLine().trim());
            ask2Sacrifice = Boolean.parseBoolean(reader.nextLine().trim());
            wonderWand = Boolean.parseBoolean(reader.nextLine().trim());
            rangedWeaponName = reader.nextLine().trim();
            rangedEnchant = Integer.parseInt(reader.nextLine().trim());
            projectile1Name = reader.nextLine().trim();
            projectile2Name = reader.nextLine().trim();
            projectile3Name = reader.nextLine().trim();
            projectile4Name = reader.nextLine().trim();
            t1 = Boolean.parseBoolean(reader.nextLine().trim());
            t2 = Boolean.parseBoolean(reader.nextLine().trim());
            t3 = Boolean.parseBoolean(reader.nextLine().trim());
            t4 = Boolean.parseBoolean(reader.nextLine().trim());
            t5 = Boolean.parseBoolean(reader.nextLine().trim());
            t6 = Boolean.parseBoolean(reader.nextLine().trim());
            t7 = Boolean.parseBoolean(reader.nextLine().trim());
            t8 = Boolean.parseBoolean(reader.nextLine().trim());
            t9 = Boolean.parseBoolean(reader.nextLine().trim());
            t10 = Boolean.parseBoolean(reader.nextLine().trim());
            t11 = Boolean.parseBoolean(reader.nextLine().trim());
            t12 = Boolean.parseBoolean(reader.nextLine().trim());
            t13 = Boolean.parseBoolean(reader.nextLine().trim());
            t14 = Boolean.parseBoolean(reader.nextLine().trim());
            t15 = Boolean.parseBoolean(reader.nextLine().trim());
            t16 = Boolean.parseBoolean(reader.nextLine().trim());
            t17 = Boolean.parseBoolean(reader.nextLine().trim());
            t18 = Boolean.parseBoolean(reader.nextLine().trim());
            t19 = Boolean.parseBoolean(reader.nextLine().trim());
            t20 = Boolean.parseBoolean(reader.nextLine().trim());
            t21 = Boolean.parseBoolean(reader.nextLine().trim());
            t22 = Boolean.parseBoolean(reader.nextLine().trim());
            t23 = Boolean.parseBoolean(reader.nextLine().trim());
            t24 = Boolean.parseBoolean(reader.nextLine().trim());
            t25 = Boolean.parseBoolean(reader.nextLine().trim());
            t26 = Boolean.parseBoolean(reader.nextLine().trim());
            t27 = Boolean.parseBoolean(reader.nextLine().trim());
            t28 = Boolean.parseBoolean(reader.nextLine().trim());
            t29 = Boolean.parseBoolean(reader.nextLine().trim());
            t30 = Boolean.parseBoolean(reader.nextLine().trim());
            t31 = Boolean.parseBoolean(reader.nextLine().trim());
            t32 = Boolean.parseBoolean(reader.nextLine().trim());
            t33 = Boolean.parseBoolean(reader.nextLine().trim());
            t34 = Boolean.parseBoolean(reader.nextLine().trim());
            t35 = Boolean.parseBoolean(reader.nextLine().trim());
            t36 = Boolean.parseBoolean(reader.nextLine().trim());
            t37 = Boolean.parseBoolean(reader.nextLine().trim());
            t38 = Boolean.parseBoolean(reader.nextLine().trim());
            t39 = Boolean.parseBoolean(reader.nextLine().trim());
            t40 = Boolean.parseBoolean(reader.nextLine().trim());
            t41 = Boolean.parseBoolean(reader.nextLine().trim());
            t42 = Boolean.parseBoolean(reader.nextLine().trim());
            t43 = Boolean.parseBoolean(reader.nextLine().trim());
            t44 = Boolean.parseBoolean(reader.nextLine().trim());
            t45 = Boolean.parseBoolean(reader.nextLine().trim());
            t46 = Boolean.parseBoolean(reader.nextLine().trim());
            t47 = Boolean.parseBoolean(reader.nextLine().trim());
            t48 = Boolean.parseBoolean(reader.nextLine().trim());
            t49 = Boolean.parseBoolean(reader.nextLine().trim());
            row = Integer.parseInt(reader.nextLine().trim());
            column = Integer.parseInt(reader.nextLine().trim());
        }
        catch(FileNotFoundException e){
            System.out.println("No save file was found. Begin a new Quest for Glory now!!!");
        }
        catch(NumberFormatException | StringIndexOutOfBoundsException | NoSuchElementException e){
            System.out.println("Sorry, your save file was corrupted. Start a new Quest for Glory now!!!");
        }
    }

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            while(true){
                if(cHP <= 0){
                    System.out.println("What a tragic ending, "+name+"! Your hp has dropped to zero or below! The Quest for Glory ends now!");
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("savegame.txt", false))) {
                        // The file is now empty. You can either close it immediately to leave it blank,
                        // or start writing fresh save data here.
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.exit(0);
                }
            }
        });
        thread.start();
        Scanner scanner = new Scanner(System.in);
        Load();
        Encounter.execute();

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

        //Fighter only variables
        char armor = '\0';
        char weapon1;
        char weapon2;
        char weapon3;
        char weapon4;

        //Wizard only variables
        char spell1;
        char spell2;
        char spell3;
        char spell4;
        char magicItem;

        //Ranger only variables
        char rangedWeapon = '\0';
        char projectile1;
        char projectile2;
        char projectile3;
        char projectile4;

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
        Map<Character, String> Magics = Map.ofEntries(
                Map.entry('A', "Rod of Rage"),
                Map.entry('B', "Staff of Sacrifice"),
                Map.entry('C', "Wand of Wonder")
        );

        //Ranger Ranged Weapon Map
        Map<Character, String> Bows = Map.ofEntries(
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

        System.out.println("Hello fellow adventurer! Welcome to the quest of Finding Glory! Enter your character's name.");
        name = scanner.next();
        scanner.nextLine();
        System.out.println("Good luck, " + name + "! May you find all the Glory! But beware, you must make the right decisions or you will fail. This game will automatically save after you create your character and after every encounter.");
        System.out.println(name + ", you must know the rules of this adventure. First of all, if I, the narrator, ask you to enter a number, do not enter any other characters. If you are given a list of choices that correspond to a letter, then just type the letter! Press Enter to continue.");
        scanner.nextLine();
        System.out.println("In this game, there is Defense. When you are attacked, your Defense score, which starts at 13, is subtracted from the enemy's success score, and the difference is how much HP you lose. This works the same way for the enemy when you attack an enemy. Press Enter to continue.");
        scanner.nextLine();
        System.out.println("Also, there is Magic Resistance. When an attack spell is cast, the caster must make an intelligence check and then either divide it by or subtract their opponent's Magic Resistance from it to determine the damage done. The operation varies based on what spell is cast. Your starting Magic Resistance is 3. Press Enter to continue.");
        scanner.nextLine();
        System.out.println("When faced with a dilemma, there may be options to attack or to try to talk your way out of it or something else. If you choose to attack, you will go first in the round. If you fail to talk your way out of something, your new enemy goes first in the round. Press Enter to continue.");
        scanner.nextLine();
        System.out.println("In combat, there are 4 squares that are locations where you and each enemy are. The squares are named 1, 2, 3, and 4. Top right = #1, bottom right = #2, bottom left = #3, top left = #4. Press enter to continue.");
        scanner.nextLine();
        System.out.println("In each combat round, you and each enemy has a turn. In that turn, they can take 2 actions. In an action, they or you can attack, cast a spell, use a magic item, or move to a different square. Some special things take no action. Press Enter to continue.");
        scanner.nextLine();
        System.out.println("When attacking, a melee attack can only be made if you are in the same square as the enemy. A ranged attack can only be made from a different square than the enemy. Press Enter to continue.");
        scanner.nextLine();

        while (cLoop) {
            System.out.println("To start, you must choose your class.");
            System.out.println("A. Fighter");
            System.out.println("B. Wizard");
            System.out.println("C. Ranger");
            cClass = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();

            if (cClass == 'A') {
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
                while (aLoop) {
                    armor = scanner.next().toUpperCase().charAt(0);
                    scanner.nextLine();
                    if (armor == 'A') {
                        aLoop = false;
                        armorBonus = 3;
                        armorEnchant = 5;
                        defense += armorBonus;
                    } else if (armor == 'B') {
                        aLoop = false;
                        armorBonus = 5;
                        armorEnchant = 3;
                        defense += armorBonus;
                        dexBonus = -1;
                    } else if (armor == 'C') {
                        aLoop = false;
                        armorBonus = 7;
                        armorEnchant = 1;
                        defense += armorBonus;
                        dexBonus = -2;
                    } else {
                        System.out.println("That is not a valid armor, " + name + ". Try again.");
                    }
                }
                armorName = Armors.get(armor);
                System.out.println("That " + armorName + " is going to protect you really well, " + name + "!");
                System.out.println("Now that you've chosen your armor, the last thing to choose during this character creation phase before ability points is to choose 4 weapons to wield. For now, just choose one.");
                System.out.println("A. Battleaxe: Add your strength score to the end result of an attack, but take a -2 penalty on defense for this turn *this effect stacks*.");
                System.out.println("B. 2 Daggers: Gain a +2 bonus on defense for this turn *this effect stacks*, but deal -3 damage.");
                System.out.println("C. Flail: Increase your strength score by one for this attack, but the enemy becomes angry and gains a +1 to whatever ability they use to attack for their next attack.");
                System.out.println("D. Halberd: Target all enemies in melee range with your attack, but all enemies hit gain an extra attack against you.");
                System.out.println("E. 2 Handaxes: Target 2 enemies in melee range with your attack, but the damage done to each of them is cut in half.");
                System.out.println("F. Longsword: Just a longsword; no bonus, no penalty.");
                System.out.println("G. Mace: The target enemy takes a -1 penalty to their Strength score for one turn, but you take a -1 penalty on damage and defense for this turn.");
                System.out.println("H. Rapier: The target enemy takes a -1 penalty to their Dexterity score for one turn, but you take a -1 penalty on damage and defense for this turn.");
                System.out.println("I. Scimitar: The target enemy takes a -1 penalty to their Intelligence score for one turn, but you take a -1 penalty on damage and defense for this turn.");
                System.out.println("J. Scythe: With this weapon, you have a 1 in 3 chance of dealing double damage, but if it does not, then you gain a -3 penalty on damage.");
                System.out.println("K. Spear: You can make an attack against an enemy that is not in your square with this weapon, except you gain a -2 penalty on defense for one turn *this effect stacks*.");
                System.out.println("L. Trident: Your attack with this weapon is made 3 times, and the best result is taken. For the next attack made against you during this combat, the attacking enemy rolls their attack twice and takes the best result.");
                System.out.println("M. Warhammer: Deal splash damage equal to one half of the damage dealt to the target enemy to all other enemies in the same square as you. Deal one half of the splash damage dealt to yourself.");
                while (w1Loop) {
                    weapon1 = scanner.next().toUpperCase().charAt(0);
                    if ("ABCDEFGHIJKLM".indexOf(weapon1) >= 0) {
                        w1Loop = false;
                        weapon1Name = Weapons.get(weapon1);
                    } else {
                        System.out.println("Sorry, " + name + ". You can't have that weapon.");
                    }
                }
                System.out.println("Good job, " + name + "! You now have " + weapon1Name + " in your arsenal!");
                System.out.println("Now it is time to choose your second weapon. It would be foolish to choose the same weapon twice unless you were looking for a challenge! Remember, you'll have four weapons, but you can only use one per attack.");
                while (w2Loop) {
                    weapon2 = scanner.next().toUpperCase().charAt(0);
                    if ("ABCDEFGHIJKLM".indexOf(weapon2) >= 0) {
                        w2Loop = false;
                        weapon2Name = Weapons.get(weapon2);
                    } else {
                        System.out.println("Sorry, " + name + ". You can't have that weapon.");
                    }
                }
                System.out.println("Well done, " + name + "! You now have " + weapon2Name + " in your belt!");
                System.out.println("You know what to do now. What would you like as your third weapon?");
                while (w3Loop) {
                    weapon3 = scanner.next().toUpperCase().charAt(0);
                    if ("ABCDEFGHIJKLM".indexOf(weapon3) >= 0) {
                        w3Loop = false;
                        weapon3Name = Weapons.get(weapon3);
                    } else {
                        System.out.println("Sorry, " + name + ". You can't have that weapon.");
                    }
                }
                System.out.println("Great pick, " + name + "! You now have " + weapon3Name + " in your control!");
                System.out.println("Fourth?");
                while (w4Loop) {
                    weapon4 = scanner.next().toUpperCase().charAt(0);
                    if ("ABCDEFGHIJKLM".indexOf(weapon4) >= 0) {
                        w4Loop = false;
                        weapon4Name = Weapons.get(weapon4);
                    } else {
                        System.out.println("Sorry, " + name + ". You can't have that weapon.");
                    }
                }
                System.out.println("At last, " + name + "! You now have " + weapon4Name + " in your possession!");
            } else if (cClass == 'B') {
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
                System.out.println("A. Mage's Shield: A floating shield that grants a temporary +6 Defense bonus *does not stack with itself*.");
                System.out.println("B. Minor Healing: Heal 6 HP. You cannot go beyond your maximum HP. If you are already at your max HP, you cannot cast this spell.");
                System.out.println("C. Lions's Strength: Gain a temporary +1 bonus to your Strength score *does not stack with itself*.");
                System.out.println("D. Bobcat's Dexterity: Gain a temporary +1 bonus to your Dexterity score *does not stack with itself*.");
                System.out.println("E. Dolphin's Intelligence: Gain a temporary +1 bonus to your Intelligence score *does not stack with itself*.");
                System.out.println("F. Snake's Charisma: Gain a temporary +1 bonus to your Charisma score *does not stack with itself*.");
                System.out.println("G. Fireball: Make an intelligence check and deal damage to all enemies in a square of your choosing equal to the intelligence check divided by the enemy's Magic Resistance score.");
                System.out.println("H. Magic Torpedo: Make an intelligence check and deal damage to one enemy you are fighting equal to the intelligence check minus their Magic Resistance score.");
                System.out.println("I. Poison Cloud: Make an intelligence check and deal damage to all enemies in a square of your choice every turn for 4 turns equal to the intelligence check divided by twice the enemy's Magic Resistance score *this effect stacks*.");
                System.out.println("J. Curse of Weakness: One enemy you are fighting gains a permanent -1 penalty to their Strength score. A single enemy can only have one Curse of Weakness at a time.");
                System.out.println("K. Curse of Slowness: One enemy you are fighting gains a permanent -1 penalty to their Dexterity score. A single enemy can only have one Curse of Slowness at a time.");
                System.out.println("L. Curse of Stupidity: One enemy you are fighting gains a permanent -1 penalty to their Intelligence score. A single enemy can only have one Curse of Stupidity at a time.");
                System.out.println("M. Curse of Babbling: One enemy you are fighting gains a permanent -1 penalty to their Charisma score. A single enemy can only have one Curse of Babbling at a time.");
                while (s1Loop) {
                    spell1 = scanner.next().toUpperCase().charAt(0);
                    if ("ABCDEFGHIJKLM".indexOf(spell1) >= 0) {
                        s1Loop = false;
                        spell1Name = Spellbook.get(spell1);
                    } else {
                        System.out.println("That is not a valid spell choice, " + name + ". Try again.");
                    }
                }
                System.out.println("Nice, " + name + "! Your first choice, " + spell1Name + ", was recorded in your spellbook!");
                System.out.println("Alright, now it is time to choose your second spell. It would not be wise to choose the same spell unless you are looking for a challenge in which you want fewer spells.");
                while (s2Loop) {
                    spell2 = scanner.next().toUpperCase().charAt(0);
                    if ("ABCDEFGHIJKLM".indexOf(spell2) >= 0) {
                        s2Loop = false;
                        spell2Name = Spellbook.get(spell2);
                    } else {
                        System.out.println("That is not a valid spell choice, " + name + ". Try again.");
                    }
                }
                System.out.println("Congrats, " + name + "! Your first choice, " + spell2Name + ", was logged in your spellbook!");
                System.out.println("You know the drill. What's your third pick?");
                while (s3Loop) {
                    spell3 = scanner.next().toUpperCase().charAt(0);
                    if ("ABCDEFGHIJKLM".indexOf(spell3) >= 0) {
                        s3Loop = false;
                        spell3Name = Spellbook.get(spell3);
                    } else {
                        System.out.println("That is not a valid spell choice, " + name + ". Try again.");
                    }
                }
                System.out.println("Amazing, " + name + "! Your first choice, " + spell3Name + ", was written in your spellbook!");
                System.out.println("Last Spell?");
                while (s4Loop) {
                    spell4 = scanner.next().toUpperCase().charAt(0);
                    if ("ABCDEFGHIJKLM".indexOf(spell4) >= 0) {
                        s4Loop = false;
                        spell4Name = Spellbook.get(spell4);
                    } else {
                        System.out.println("That is not a valid spell choice, " + name + ". Try again.");
                    }
                }
                System.out.println("Wonderful, " + name + "! Your first choice, " + spell4Name + ", was engraved in your spellbook!");
                System.out.println("Now it is time to choose one of 3 magic items that will imbue your spells with even more power!");
                System.out.println("A. Rod of Rage: When you cast a spell, you can choose to go into a rage. If you do, the spell's effect is multiplied by 1.5, but the enemy's next attack deals 1.5x damage.");
                System.out.println("B. Staff of Sacrifice: When you cast a spell, you can choose to lose 2 HP to increase the effect it: +2 for defense spells, +6 on damage spells, 0 increase on heal spells. If you choose to lose 4 HP instead, then your buff spells and debuff spells gain a +1 increase.");
                System.out.println("C. Wand of Wonder: Your first attack spell of the combat deals 2.5x damage.");
                while (mLoop) {
                    magicItem = scanner.next().toUpperCase().charAt(0);
                    if (magicItem == 'A') {
                        mLoop = false;
                        askRage = true;
                    } else if (magicItem == 'B') {
                        mLoop = false;
                        ask1Sacrifice = true;
                        ask2Sacrifice = true;
                    } else if (magicItem == 'C') {
                        mLoop = false;
                        wonderWand = true;
                    } else {
                        System.out.println("Sorry, " + name + ". You can't have that magic item. Try again.");
                    }
                }
            } else if (cClass == 'C') {
                cLoop = false;
                maxHP = 45;
                cHP = 45;
                strBonus = 0;
                dexBonus = 1;
                intBonus = 0;
                chaBonus = 0;
                defense++;
                magicResistance = 3;
                attackBonus = -3;
                System.out.println("You chose the Ranger class. This is all about ranged attacks and dexterity. You must use agile force to win the Glory!");
                System.out.println("As a ranger, your HP is 45. You have a unique ability to dodge attacks; you have a static +1 to Defense, which no other class has. You have a variety of ranged weapons and projectiles to choose from. Rangers also gain a +1 bonus on all Dexterity skill checks. Press Enter to continue.");
                scanner.nextLine();
                System.out.println("As a ranger, you have no armor; your Defense bonus is equal to the starting 14 + your Dexterity score. Rangers are very powerful; their ranged weapons and projectiles can deal a lot of damage, but due to the distance they have to cover, they deal -3 damage; don't worry about it though. Choose your ranged weapon now.");
                System.out.println("A. Crossbow: You gain a +5 bonus to damage with this weapon, but its enchantability is only 1, meaning enchantments on this weapon will not have a very high effect.");
                System.out.println("B. Longbow: You gain a +3 bonus to damage with this weapon, and its enchantability is 3.");
                System.out.println("C. Shortbow: You only gain a +1 bonus to damage with this weapon, but its enchantability is 5.");
                while (rLoop) {
                    rangedWeapon = scanner.next().toUpperCase().charAt(0);
                    if (rangedWeapon == 'A') {
                        rLoop = false;
                        attackBonus = attackBonus + 5;
                        rangedEnchant = 1;
                    } else if (rangedWeapon == 'B') {
                        rLoop = false;
                        attackBonus = attackBonus + 3;
                        rangedEnchant = 3;
                    } else if (rangedWeapon == 'C') {
                        rLoop = false;
                        attackBonus = attackBonus + 1;
                        rangedEnchant = 5;
                    } else {
                        System.out.println("That is not a valid ranged weapon choice, " + name + ". Try again.");
                    }
                }
                rangedWeaponName = Bows.get(rangedWeapon);
                System.out.println("That " + rangedWeaponName + " is sure to kill your enemies, " + name + ".");
                System.out.println("Now for the fun. It's time to choose some projectiles that will be shooting out of your " + rangedWeaponName + "! You will be able to choose four different projectiles; you can only choose to use one per attack, though. For now, choose your first projectile.");
                System.out.println("A. Acid Arrows: The targeted enemy takes 1 acid damage every turn *this effect DOES stack*!");
                System.out.println("B. Electric Arrows: The targeted enemy loses one action *this effect does not stack* but the shock shocks you, giving you a -3 penalty on defense *non-stacking*.");
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
                while (p1Loop) {
                    projectile1 = scanner.next().toUpperCase().charAt(0);
                    if ("ABCDEFGHIJKLM".indexOf(projectile1) >= 0) {
                        p1Loop = false;
                        projectile1Name = Projectiles.get(projectile1);
                    } else {
                        System.out.println("That is not a valid choice for a projectile, " + name + ". Try again.");
                    }
                }
                System.out.println("Good choice, " + name + "! Those " + projectile1Name + " were added to your quiver.");
                System.out.println("Now pick your the second projectile that you want. You shouldn't pick the same projectile twice in a row unless you want to give yourself a challenge!");
                while (p2Loop) {
                    projectile2 = scanner.next().toUpperCase().charAt(0);
                    if ("ABCDEFGHIJKLM".indexOf(projectile2) >= 0) {
                        p2Loop = false;
                        projectile2Name = Projectiles.get(projectile2);
                    } else {
                        System.out.println("That is not a valid choice for a projectile, " + name + ". Try again.");
                    }
                }
                System.out.println("Wonderful pick, " + name + "! Those " + projectile2Name + " were stuffed into your belt.");
                System.out.println("You know the drill. What's your third projectile going to be?");
                while (p3Loop) {
                    projectile3 = scanner.next().toUpperCase().charAt(0);
                    if ("ABCDEFGHIJKLM".indexOf(projectile3) >= 0) {
                        p3Loop = false;
                        projectile3Name = Projectiles.get(projectile3);
                    } else {
                        System.out.println("That is not a valid choice for a projectile, " + name + ". Try again.");
                    }
                }
                System.out.println("That's a great one, " + name + "! Those " + projectile3Name + " were just placed into your secret arrow compartment.");
                System.out.println("Fourth?");
                while (p4Loop) {
                    projectile4 = scanner.next().toUpperCase().charAt(0);
                    if ("ABCDEFGHIJKLM".indexOf(projectile4) >= 0) {
                        p4Loop = false;
                        projectile4Name = Projectiles.get(projectile4);
                    } else {
                        System.out.println("That is not a valid choice for a projectile, " + name + ". Try again.");
                    }
                }
                System.out.println("Amazing arrow, " + name + "! Those " + projectile4Name + " were stored safely within your pockets.");
            } else {
                System.out.println("That is not a valid class, " + name + ". Try again.");
            }
        }
        System.out.println("Now it is time to allocate points into your skills: Strength, Dexterity, Intelligence, and Charisma, which is for speaking. When you make an ability check, a six sided die will be rolled virtually, and the result will be multiplied by your skill score, and any static bonuses or penalties you have will be added at the end. The skill used depends on the situation. You have a total of 10 points to allocate *decimals allowed, no negatives allowed*.");
        while (abilityLoop) {
            strengthLoop = true;
            dexterityLoop = true;
            intelligenceLoop = true;
            charismaLoop = true;

            System.out.println("How many points would you like in Strength?");
            while (strengthLoop) {
                try {
                    cStrength = scanner.nextDouble();
                    scanner.nextLine();
                    if (cStrength <= 10) {
                        if (cStrength < 0) {
                            System.out.println("You cannot have a negative number of points in Strength, " + name + ". Try again.");
                        } else {
                            strengthLoop = false;
                        }
                    } else {
                        System.out.println("You cannot have that many points in Strength, " + name + ". Your total amount of ability points cannot exceed 10. Try again.");
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Invalid character. Try again.");
                    scanner.nextLine();
                }
            }
            System.out.println("How many points would you like in Dexterity? If you are a ranger, your dexterity score determines your defense bonus.");
            while (dexterityLoop) {
                try {
                    cDexterity = scanner.nextDouble();
                    scanner.nextLine();
                    if (cDexterity <= 10 - cStrength) {
                        if (cDexterity < 0) {
                            System.out.println("You cannot have a negative number of points in Dexterity, " + name + ". Try again.");
                        } else {
                            dexterityLoop = false;
                        }
                    } else {
                        System.out.println("You cannot have that many points in Dexterity, " + name + ". Your total amount of ability points cannot exceed 10. Try again.");
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Invalid character. Try again.");
                    scanner.nextLine();
                }
            }
            System.out.println("How many points would you like in Intelligence?");
            while (intelligenceLoop) {
                try {
                    cIntelligence = scanner.nextDouble();
                    scanner.nextLine();
                    if (cIntelligence <= 10 - cStrength - cDexterity) {
                        if (cIntelligence < 0) {
                            System.out.println("You cannot have a negative number of points in Intelligence, " + name + ". Try again.");
                        } else {
                            intelligenceLoop = false;
                        }
                    } else {
                        System.out.println("You cannot have that many points in Intelligence, " + name + ". Your total amount of ability points cannot exceed 10. Try again.");
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Invalid character. Try again.");
                    scanner.nextLine();
                }
            }
            System.out.println("How many points would you like in Charisma?");
            while (charismaLoop) {
                try {
                    cCharisma = scanner.nextDouble();
                    scanner.nextLine();
                    if (cCharisma <= 10 - cStrength - cDexterity - cIntelligence) {
                        if (cCharisma < 0) {
                            System.out.println("You cannot have a negative number of points in Charisma, " + name + ". Try again.");
                        } else {
                            charismaLoop = false;
                        }
                    } else {
                        System.out.println("You cannot have that many points in Charisma, " + name + ". Your total amount of ability points cannot exceed 10. Try again.");
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Invalid character. Try again.");
                    scanner.nextLine();
                }
            }
            if (cStrength + cDexterity + cIntelligence + cCharisma < 10) {
                System.out.println("You didn't allocate " + (10 - cStrength - cDexterity - cIntelligence - cCharisma) + " points! Oh well, maybe you were looking for a challenge, or maybe you were bad at math. If you want to reallocate your points, type in any character and then Enter. If you do not, simply press Enter.");
                if (scanner.nextLine().isEmpty()) {
                    abilityLoop = false;
                }
            } else {
                abilityLoop = false;
            }
        }
        if (cClass == 'C') {
            defense += cDexterity;
        }
        System.out.println("You have officially allocated your ability points, and now you are ready for your adventure! The Quest For Glory begins NOW!!!");
        Save();
        System.out.println("Your first encounter is a fight. There's no talking your way out of this one. Press Enter to continue.");
        scanner.nextLine();
        Encounter1.execute();
    }
}
