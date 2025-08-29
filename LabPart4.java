import java.util.Scanner;

public class LabPart4 {
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
        // Problem 4 - Simple Quiz (Challenge)
        int correctAnswers = 0;
        String firstAnswer = getInput("Question 1: What is the capital of France?\n" +
                "Your answer: ");
        if (firstAnswer.equals("Paris")) {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("WRONG WRONG WRONG !!!");
        }
        String secondAnswer = getInput("\nQuestion 2: What is 2 + 2?\nYour answer: ");
        if (secondAnswer.equals("4")) {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("WRONG WRONG WRONG !!!");
        }
        String thirdAnswer = getInput("\nQuestion 3: What language are we learning?\n" +
                "Your answer: ");
        if (thirdAnswer.equals("Java")) {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("WRONG WRONG WRONG !!!");
        }
        String declaration;
        if (correctAnswers == 3) {
            declaration = "Perfect!";
        } else if (correctAnswers == 2) {
            declaration = "Good job!";
        } else if (correctAnswers == 1) {
            declaration = "Too bad!";
        } else {
            declaration = ":(";
        }
        System.out.println("\nFinal Score: "+correctAnswers+"/3 - "+declaration);
    }
}

// -- REFLECTION QUESTIONS --
// 1) Some of the differences throw off my muscle memory, but it wasn't too bad...
// 2) Never :3
// 3) No :|