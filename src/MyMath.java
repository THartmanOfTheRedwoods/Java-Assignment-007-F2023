import java.util.Scanner;

/**
 * @author Olivia McKittrick
 */
public class MyMath {
    public static int gcf(int a, int b) { // the two numbers
        while (b != 0) { // while statement that continues as long as b is not = 0
            int temp = b; // temporarily stores b in temp to keep the original b value
            b = a % b; // updates the value of b
            a = temp; // updates value of a with value of b stored in temp
        }
        return a;
    }
    public static void main(String[] args) {
        int num1 = 1112;
        int num2 = 695;

        int result = gcf(num1, num2);
        System.out.println("The GCF of " + num1 + " and " + num2 + " is " + result);
    }
}
