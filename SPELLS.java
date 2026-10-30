package quest;
import static quest.Quest.*;
import java.util.*;

public class SPELLS{
     public static void execute(){
           Scanner scanner = new Scanner(System.in);
           char spellChoice = '\0'
           switch(chosenSpellName){
                case "Mage's Shield" -> {
                     if(askRage){
                          System.out.println("Would you like to use your Rod of Rage's power, "+name+"? Keep in mind that enemy damage done to you will increase. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               doRage = true;
                               rages++;
                               MagesShield.execute();
                               doRage = false;
                          }
                          else{
                               MagesShield.execute();
                          }
                     }
                     else if(ask1Sacrifice){
                          System.out.println("Would you like to use your Staff of Sacrifice's power by losing 2 HP, "+name+"? You currently have "+cHP+" HP. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               cHP = cHP-2;
                               do1Sacrifice = true;
                               MagesShield.execute();
                               do1Sacrifice = false;
                          }
                          else{
                               MagesShield.execute();
                          }
                     }
                }
                case "Minor Healing" -> {
                     if(askRage){
                          System.out.println("Would you like to use your Rod of Rage's power, "+name+"? Keep in mind that enemy damage done to you will increase. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               doRage = true;
                               rages++;
                               MinorHealing.execute();
                               doRage = false;
                          }
                          else{
                               MinorHealing.execute();
                          }
                     }
                }
                case "Lion's Strength" -> {
                     if(askRage){
                          System.out.println("Would you like to use your Rod of Rage's power, "+name+"? Keep in mind that enemy damage done to you will increase. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               doRage = true;
                               rages++;
                               LionsStrength.execute();
                               doRage = false;
                          }
                          else{
                               LionsStrength.execute();
                          }
                     }
                     else if(ask2Sacrifice){
                          System.out.println("Would you like to use your Staff of Sacrifice's power by losing 4 HP, "+name+"? You currently have "+cHP+" HP. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               cHP = cHP-4;
                               do2Sacrifice = true;
                               LionsStrength.execute();
                               do2Sacrifice = false;
                          }
                          else{
                               LionsStrength.execute();
                          }
                     }
                }
                case "Bobcat's Dexterity" -> {
                     if(askRage){
                          System.out.println("Would you like to use your Rod of Rage's power, "+name+"? Keep in mind that enemy damage done to you will increase. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               doRage = true;
                               rages++;
                               BobcatsDexterity.execute();
                               doRage = false;
                          }
                          else{
                               BobcatsDexterity.execute();
                          }
                     }
                     else if(ask2Sacrifice){
                          System.out.println("Would you like to use your Staff of Sacrifice's power by losing 4 HP, "+name+"? You currently have "+cHP+" HP. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               cHP = cHP-4;
                               do2Sacrifice = true;
                               BobcatsDexterity.execute();
                               do2Sacrifice = false;
                          }
                          else{
                               BobcatsDexterity.execute();
                          }
                     }
                }
                case "Dolphin's Intelligence" -> {
                     if(askRage){
                          System.out.println("Would you like to use your Rod of Rage's power, "+name+"? Keep in mind that enemy damage done to you will increase. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               doRage = true;
                               rages++;
                               DolphinsIntelligence.execute();
                               doRage = false;
                          }
                          else{
                               DolphinsIntelligence.execute();
                          }
                     }
                     else if(ask2Sacrifice){
                          System.out.println("Would you like to use your Staff of Sacrifice's power by losing 4 HP, "+name+"? You currently have "+cHP+" HP. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               cHP = cHP-4;
                               do2Sacrifice = true;
                               DolphinsIntelligence.execute();
                               do2Sacrifice = false;
                          }
                          else{
                               DolphinsIntelligence.execute();
                          }
                     }
                }
                case "Snake's Charisma" -> {
                     if(askRage){
                          System.out.println("Would you like to use your Rod of Rage's power, "+name+"? Keep in mind that enemy damage done to you will increase. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               doRage = true;
                               rages++;
                               SnakesCharisma.execute();
                               doRage = false;
                          }
                          else{
                               SnakesCharisma.execute();
                          }
                     }
                     else if(ask2Sacrifice){
                          System.out.println("Would you like to use your Staff of Sacrifice's power by losing 4 HP, "+name+"? You currently have "+cHP+" HP. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               cHP = cHP-4;
                               do2Sacrifice = true;
                               SnakesCharisma.execute();
                               do2Sacrifice = false;
                          }
                          else{
                               SnakesCharisma.execute();
                          }
                     }
                }
                case "Fireball" -> {
                     if(askRage){
                          System.out.println("Would you like to use your Rod of Rage's power, "+name+"? Keep in mind that enemy damage done to you will increase. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               doRage = true;
                               rages++;
                               Fireball.execute();
                               doRage = false;
                          }
                          else{
                               Fireball.execute();
                          }
                     }
                     else if(ask1Sacrifice){
                          System.out.println("Would you like to use your Staff of Sacrifice's power by losing 2 HP, "+name+"? You currently have "+cHP+" HP. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               cHP = cHP-2;
                               do1Sacrifice = true;
                               Fireball.execute();
                               do1Sacrifice = false;
                          }
                          else{
                               Fireball.execute();
                          }
                     }
                }
                case "Magic Torpedo" -> {
                     if(askRage){
                          System.out.println("Would you like to use your Rod of Rage's power, "+name+"? Keep in mind that enemy damage done to you will increase. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               doRage = true;
                               rages++;
                               MagicTorpedo.execute();
                               doRage = false;
                          }
                          else{
                               MagicTorpedo.execute();
                          }
                     }
                     else if(ask1Sacrifice){
                          System.out.println("Would you like to use your Staff of Sacrifice's power by losing 2 HP, "+name+"? You currently have "+cHP+" HP. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               cHP = cHP-2;
                               do1Sacrifice = true;
                               MagicTorpedo.execute();
                               do1Sacrifice = false;
                          }
                          else{
                               MagicTorpedo.execute();
                          }
                     }
                }
                case "Poison Cloud" -> {
                     if(askRage){
                          System.out.println("Would you like to use your Rod of Rage's power, "+name+"? Keep in mind that enemy damage done to you will increase. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               doRage = true;
                               rages++;
                               PoisonCloud.execute();
                               doRage = false;
                          }
                          else{
                               PoisonCloud.execute();
                          }
                     }
                     else if(ask1Sacrifice){
                          System.out.println("Would you like to use your Staff of Sacrifice's power by losing 2 HP, "+name+"? You currently have "+cHP+" HP. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               cHP = cHP-2;
                               do1Sacrifice = true;
                               PoisonCloud.execute();
                               do1Sacrifice = false;
                          }
                          else{
                               PoisonCloud.execute();
                          }
                     }
                }
                case "Curse of Weakness" -> {
                    if(askRage){
                          System.out.println("Would you like to use your Rod of Rage's power, "+name+"? Keep in mind that enemy damage done to you will increase. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               doRage = true;
                               rages++;
                               CurseofWeakness.execute();
                               doRage = false;
                          }
                          else{
                               CurseofWeakness.execute();
                          }
                     }
                     else if(ask2Sacrifice){
                          System.out.println("Would you like to use your Staff of Sacrifice's power by losing 4 HP, "+name+"? You currently have "+cHP+" HP. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               cHP = cHP-4;
                               do2Sacrifice = true;
                               CurseofWeakness.execute();
                               do2Sacrifice = false;
                          }
                          else{
                               CurseofWeakness.execute();
                          }
                     } 
                }
                case "Curse of Slowness" -> {
                     if(askRage){
                          System.out.println("Would you like to use your Rod of Rage's power, "+name+"? Keep in mind that enemy damage done to you will increase. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               doRage = true;
                               rages++;
                               CurseofSlowness.execute();
                               doRage = false;
                          }
                          else{
                               CurseofSlowness.execute();
                          }
                     }
                     else if(ask2Sacrifice){
                          System.out.println("Would you like to use your Staff of Sacrifice's power by losing 4 HP, "+name+"? You currently have "+cHP+" HP. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               cHP = cHP-4;
                               do2Sacrifice = true;
                               CurseofSlowness.execute();
                               do2Sacrifice = false;
                          }
                          else{
                               CurseofSlowness.execute();
                          }
                     } 
                }
                case "Curse of Stupidity" -> {
                     if(askRage){
                          System.out.println("Would you like to use your Rod of Rage's power, "+name+"? Keep in mind that enemy damage done to you will increase. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               doRage = true;
                               rages++;
                               CurseofStupidity.execute();
                               doRage = false;
                          }
                          else{
                               CurseofStupidity.execute();
                          }
                     }
                     else if(ask2Sacrifice){
                          System.out.println("Would you like to use your Staff of Sacrifice's power by losing 4 HP, "+name+"? You currently have "+cHP+" HP. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               cHP = cHP-4;
                               do2Sacrifice = true;
                               CurseofStupidity.execute();
                               do2Sacrifice = false;
                          }
                          else{
                               CurseofStupidity.execute();
                          }
                     } 
                }
                case "Curse of Babbling" -> {
                     if(askRage){
                          System.out.println("Would you like to use your Rod of Rage's power, "+name+"? Keep in mind that enemy damage done to you will increase. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               doRage = true;
                               rages++;
                               CurseofBabbling.execute();
                               doRage = false;
                          }
                          else{
                               CurseofBabbling.execute();
                          }
                     }
                     else if(ask2Sacrifice){
                          System.out.println("Would you like to use your Staff of Sacrifice's power by losing 4 HP, "+name+"? You currently have "+cHP+" HP. If so, press enter. If not, type in anything and then press enter.");
                          if(scanner.nextLine().isEmpty()){
                               cHP = cHP-4;
                               do2Sacrifice = true;
                               CurseofBabbling.execute();
                               do2Sacrifice = false;
                          }
                          else{
                               CurseofBabbling.execute();
                          }
                     } 
                }
                default -> System.out.println("");
          }
     }
     public static void reset(){
          MagesShield.reset();
          LionsStrength.reset();
          BobcatsDexterity.reset();
          DolphinsIntelligence.reset();
          SnakesCharisma.reset();
     }
}
