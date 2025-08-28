import java.util.Scanner;

public class LabPart2 {
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
        // Problem 2 - Grade Calculator
        int firstScore = getIntInput("Enter first test score: ");
        int secondScore = getIntInput("Enter second test score: ");
        int thirdScore = getIntInput("Enter third test score: ");
        float averageScores = (float) (firstScore + secondScore + thirdScore) / 3;
        System.out.println("Your average is " + averageScores);
        String letterGrade;
        if (averageScores > 100) {
            letterGrade = "S, which is bigger than humanly possible. " +
                    "So it changed into an F. You dirty hacker.";
        } else if (100.0 >= averageScores && averageScores >= 90.0) {
            letterGrade = "A";
        } else if (90.0 > averageScores && averageScores >= 80.0) {
            letterGrade = "B";
        } else if (80.0 > averageScores && averageScores >= 70.0) {
            letterGrade = "C";
        } else if (70.0 > averageScores && averageScores >= 60.0) {
            letterGrade = "D";
        } else if (60.0 > averageScores && averageScores >= 0) {
            letterGrade = "F";
        } else {
            letterGrade = "Z, which means you somehow have a negative grade. " +
                    "I'm astonished... even cheating in an S score is preferable to this.";
        }
        System.out.println("Your letter grade is: " + letterGrade);
    }
}