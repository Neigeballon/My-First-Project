package quest;
import static quest.Quest.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Fireball {
    public static void execute() {
        for (int i = 1; i < 5; i++) {
            enemies.stream().anyMatch(e -> e.eSquare == i);
        }
    }
}
