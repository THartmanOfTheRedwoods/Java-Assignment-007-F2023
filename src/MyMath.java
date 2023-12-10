/**
 *
 * @author Trevor Hartman
 * @author Angelina Perez
 */
import java.util.Scanner;
public class MyMath {

    public static int gCF(int a, int b) {
        while (b!= 0) {
            if (a > b) {
                int c = b;
                b = a % b;
                a = c;
            } else {
                b = b % a;
            }
        } return a;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input1, input2 = null;
        String message = "Give me a %snumber (Q to quit):";
        System.out.printf(String.format(message, ""));
        while (!(input1 = s.nextLine()).equals("Q")) {
            if (input2 == null) {
                input2 = input1;
                System.out.printf(String.format(message, "second "));
                continue;
            }
            System.out.printf("GCF of %s and %s is %d%n",
                    input1, input2, gCF(Integer.parseInt(input1),Integer.parseInt(input2)));

            System.out.printf(String.format(message, ""));
            input2 = null;
        }
    }
}

