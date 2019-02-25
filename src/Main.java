import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String userName;
        Scanner keyboard;
        int go;
        String userInput;
        //initializing
        keyboard= new Scanner(System.in);
        Random generator  = new Random();
        go = 0;


        System.out.println("What is your name?");
        userName = keyboard.nextLine();

        System.out.println("Ask me only yes or no Questions!(Type Ok if you understand)");
        userInput = keyboard.nextLine();
        System.out.println(""+userName+", You May Ask Me A Question When You Are Ready!");

        String answer = keyboard.nextLine();
        int choice = 1 + generator.nextInt(11);
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
            response = "Don't count of it";

        else if (choice == 9)
            response = "Signs Point To Yes";

        else if (choice == 10)
            response = "Nah";

        else if (choice == 11)
            response = "My Reply Is Yes";
        System.out.println(response);

















    }
}
