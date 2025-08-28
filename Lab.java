import java.util.Scanner;

public class Lab {
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
        // Problem 1 - Temperature Converter
        int fahrenheit = getIntInput("Enter temperature in Fahrenheit: ");
        int celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit+"°F is equal to "+celsius+"°C")
    }
}