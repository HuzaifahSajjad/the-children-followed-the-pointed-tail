import java.util.Scanner;

public class LabPart3 {
    public static Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        // Problem 3 - Number Guessing Game
        int guessedNumber = 0;
        int secretNumber = 1225;
        int maximumNumber = 10000;
        while (guessedNumber != secretNumber) {
            guessedNumber = getIntInput("Guess the number between 1 and 9999: ");
            if (guessedNumber >= maximumNumber) {
                System.out.println("Not allowed!");
            } else if (guessedNumber > secretNumber) {
                System.out.println("Too high!");
            } else if (guessedNumber < secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! You got it!");
            }
        }
    }
}