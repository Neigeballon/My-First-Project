public class Enemy{
     
     public String eName;
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
     
     public Enemy(String eName, double eMaxHP, double eCHP, double eStrength, double eDexterity, double eIntelligence, double eCharisma, int eDefense, int eMagicResistance, int eSquare, int eActions){
          this.eName = eName;
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
     }
}
