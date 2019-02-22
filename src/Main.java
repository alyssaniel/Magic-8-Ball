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
        while (go == 0)

        System.out.println("What is your name?");
        userName = keyboard.nextLine();

        System.out.println("Ask me only yes or no Questions!(Type Ok if you understand)");
        userInput = keyboard.nextLine();
        System.out.println(""+userName+", You May Ask Me A Question When You Are Ready!");

        String answer = keyboard.nextLine();
        int choice = 1 + generator.nextInt(10);
        String response = "";
        if (choice == 1) 
            response = "Nope, never!";
















    }
}
