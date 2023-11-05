//Naqibullah Haiwadpal
//11/4/2023
import java.util.Scanner;

public class MyMath {

    // Method to compute the greatest common factor (GCF) of two numbers
    public static int gcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Calculate and display the GCF
        System.out.println("The GCF of " + number1 + " and " + number2 + " is: " + gcf(number1, number2));

        // Close the scanner
        scanner.close();
    }
}
