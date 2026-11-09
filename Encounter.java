package quest;

import static quest.Quest.*;

public class Encounter {
    public static void execute() {
        encounter = terrains[row][column].encounterNumber;
        switch (encounter) {
            case 1 -> Encounter1.execute();
            case 2 -> Encounter2.execute();
            case 3 -> Encounter3.execute();
            case 4 -> Encounter4.execute();
            case 5 -> Encounter5.execute();
            case 6 -> Encounter6.execute();
            case 7 -> Encounter7.execute();
            case 8 -> Encounter8.execute();
            case 9 -> Encounter9.execute();
            case 10 -> Encounter10.execute();
            case 11 -> Encounter11.execute();
            case 12 -> Encounter12.execute();
            case 13 -> Encounter13.execute();
            case 14 -> Encounter14.execute();
            case 15 -> Encounter15.execute();
            case 16 -> Encounter16.execute();
            case 17 -> Encounter17.execute();
            case 18 -> Encounter18.execute();
            case 19 -> Encounter19.execute();
            case 20 -> Encounter20.execute();
            case 21 -> Encounter21.execute();
            case 22 -> Encounter22.execute();
            case 23 -> Encounter23.execute();
            case 24 -> Encounter24.execute();
            case 25 -> Encounter25.execute();
            case 26 -> Encounter26.execute();
            case 27 -> Encounter27.execute();
            case 28 -> Encounter28.execute();
            case 29 -> Encounter29.execute();
            case 30 -> Encounter30.execute();
            case 31 -> Encounter31.execute();
            case 32 -> Encounter32.execute();
            case 33 -> Encounter33.execute();
            case 34 -> Encounter34.execute();
            case 35 -> Encounter35.execute();
            case 36 -> Encounter36.execute();
            case 37 -> Encounter37.execute();
            case 38 -> Encounter38.execute();
            case 39 -> Encounter39.execute();
            case 40 -> Encounter40.execute();
            case 41 -> Encounter41.execute();
            case 42 -> Encounter42.execute();
            case 43 -> Encounter43.execute();
            case 44 -> Encounter44.execute();
            case 45 -> Encounter45.execute();
            case 46 -> Encounter46.execute();
            case 47 -> Encounter47.execute();
            case 48 -> Encounter48.execute();
            case 49 -> Encounter49.execute();
            case 50 -> Victory.execute();
            default -> System.out.println("Create your character!");
        }
    }
}
