package quest;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static quest.Quest.*;

public class Victory {
    public static void execute() {
        System.out.println("VICTOOOOORRRRRYYYYY, "+name+"!!!!!!!!!!!!!!!!! You have attained the GLOOOOORYYYYYY!!!!!!!!");
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
