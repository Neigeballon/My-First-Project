import java.util.*;

public class Move{
     public static void execute(){
          Scanner scanner = new Scanner(System.in);
          System.out.println("Which square would you like to move to? Type in the number Remember, you are in square "+cSquare+". It would be a waste of an action to move into the same square you are already in.");
               System.out.println("A. #1.");
               System.out.println("B. #2.");
               System.out.println("C. #3.");
               System.out.println("D. #4.");
               choice = '\0';
               while(true){
               choice = scanner.next().toUpperCase().charAt(0);
               if(choice == 'A'){
                    cSquare = 1;
                    System.out.println("Now you are in square #1.");
                    break;
               }
               else if(choice == 'B'){
                    cSquare = 2;
                    System.out.println("Now you are in square #2.");
                    break;
               }
               else if(choice == 'C'){
                    cSquare = 3;
                    System.out.println("Now you are in square #3.");
                    break;
               }
               else if(choice == 'D'){
                    cSquare = 4;
                    System.out.println("Now you are in square #4.");
                    break;
               }
               else{
               System.out.println("That is not a valid square to move into, "+name+". Try again.");
               }
               }            
     }
}
