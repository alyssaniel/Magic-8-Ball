
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String userName;
        Scanner keyboard;
        String userInput;
        //initializing
        keyboard= new Scanner(System.in);
        Random generator  = new Random();
        Scanner continueKB;
        String keepGoing;
        int go = 0;
        continueKB = new Scanner(System.in);

        System.out.println("Welcome to your Magic 8 Ball!");

        System.out.println("What is your name?");
        userName = keyboard.nextLine();

        System.out.println("Ask me only yes or no Questions!(Type Ok if you understand)");
        userInput = keyboard.nextLine();
        System.out.println(""+userName+", You May Ask Me A Question When You Are Ready!");

        String answer = keyboard.nextLine();
        int choice = 1 + generator.nextInt(15);
        String response = "";
        if (choice == 1)
            response = "Nope, never!";

        else if (choice == 2)
                response = "Yes Of Course!";

        else if (choice == 3)
                    response = "Heck No!";

        else if (choice == 4)
            response = "Sorry system shutting down...";

        else if (choice == 5)
            response = "Most likely";

        else if (choice == 6)
            response = "My sources say no";

        else if (choice == 7)
            response = "Yasss";

        else if (choice == 8)
            response = "Don't count on it";

        else if (choice == 9)
            response = "Signs Point To Yes";

        else if (choice == 10)
            response = "Nah";

        else if (choice == 11)
            response = "My Reply Is Yes";

        else if (choice == 12)
           response = "Don't Ask...I'm a ball!";

        else if (choice == 13)
            response = "Better Not Tell You Now";

        else if (choice == 14)
            response = "Focus and Ask Again";

        else if (choice == 15)
            response = "Ask Someone Who Cares";

        System.out.println(response);

        System.out.println("Would you like to ask again?");
        System.out.println("Type 'y' for yes or 'n' for no.");
        keepGoing = continueKB.nextLine();
        go = keepGoing.indexOf("y");



















    }
}
