package quest;

public class Enemy{

    public String eName;
    public char eChar;
    public double eMaxHP;
    public double eCHP;
    public double eStrength;
    public double eDexterity;
    public double eIntelligence;
    public double eCharisma;
    public int eDefense;
    public int eMagicResistance;
    public int eSquare;
    public int eActions;
    public int eFlail;
    public char eCharHandaxes;
    public int eMace;
    public int eRapier;
    public int eScimitar;
    public int eTrident;
    public boolean eCurseOfWeakness;
    public boolean eCurseOfSlowness;
    public boolean eCurseOfDumbness;
    public boolean eCurseOfBabbling;

    public Enemy(String eName, char eChar, double eMaxHP, double eCHP, double eStrength, double eDexterity, double eIntelligence, double eCharisma, int eDefense, int eMagicResistance, int eSquare, int eActions, int eFlail, char eCharHandaxes, int eMace, int eRapier, int eScimitar, int eTrident, boolean eCurseOfWeakness, boolean eCurseOfSlowness, boolean eCurseOfDumbness, boolean eCurseOfBabbling){
        this.eName = eName;
        this.eChar = eChar;
        this.eMaxHP = eMaxHP;
        this.eCHP = eCHP;
        this.eStrength = eStrength;
        this.eDexterity = eDexterity;
        this.eIntelligence = eIntelligence;
        this.eCharisma = eCharisma;
        this.eDefense = eDefense;
        this.eMagicResistance = eMagicResistance;
        this.eSquare = eSquare;
        this.eActions = eActions;
        this.eFlail = eFlail;
        this.eCharHandaxes = eCharHandaxes;
        this.eMace = eMace;
        this.eRapier = eRapier;
        this.eScimitar = eScimitar;
        this.eTrident = eTrident;
        this.eCurseOfWeakness = eCurseOfWeakness;
        this.eCurseOfSlowness = eCurseOfSlowness;
        this.eCurseOfDumbness = eCurseOfDumbness;
        this.eCurseOfBabbling = eCurseOfBabbling;
    }
}
