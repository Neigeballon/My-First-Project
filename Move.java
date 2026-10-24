import java.util.*;
import static Quest.*;

public class Move{
     public static void execute(){
          Scanner scanner = new Scanner(System.in);
          ChosenSquare.clear();
          choiceMove = '\0';
          charMove = 'A';
          System.out.println("Which square would you like to move to? Type in the number Remember, you are in square "+cSquare+".");
          if(cSquare != 1){
               System.out.println(charMove+". Move to square #1");
               charMove1 = charMove;
               ChosenSquare.put(charMove1, 1);
               charMove++;
          }
          if(cSquare != 2){
               System.out.println(charMove+". Move to square #2");
               charMove2 = charMove;
               ChosenSquare.put(charMove2, 2);
               charMove++;
          }
          if(cSquare != 3){
               System.out.println(charMove+". Move to square #3");
               charMove3 = charMove;
               ChosenSquare.put(charMove3, 3);
               charMove++;
          }
          if(cSquare != 4){
               System.out.println(charMove+". Move to square #4");
               charMove4 = charMove;
               ChosenSquare.put(charMove4, 4);
               charMove++;
          }
          while(true){
          choiceMove = scanner.next().toUpperCase().charAt(0);
          if(choiceMove >= 'A' && choiceMove < charMove){
               chosenSquareName = ChosenSquare.get(choiceMove);
               System.out.println("You are now in square #"+chosenSquareName+".");
               break;
          }
          else{
               System.out.println("That is not a valid square to move into, "+name+". Try again.");
          }
          }
          switch(chosenSquareName){
               case 1 -> cSquare = 1;
               case 2 -> cSquare = 2;
               case 3 -> cSquare = 3;
               case 4 -> cSquare = 4;
               default -> System.out.println("");
          }
     }
}
