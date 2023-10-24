import java.util.Scanner;

public class MyMath {

    public static int gcf(int a, int b) {
        while (b != 0) {
            if (a > b) {
                int c = b;
                b = a % b;
                a = c;
            } else {
                b = b % a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inputOne, inputTwo = null;
        String message1 = "Give me a %snumber please (Q to quit): ", message2 = "Give me a second %snumber please (Q to quit): ";
        System.out.print(String.format(message1, ""));
        while (!(inputOne = s.nextLine()).equals("Q")) {
            if (inputTwo == null) {
                inputTwo = inputOne;
                System.out.print(String.format(message2, ""));
                continue;
            }
            System.out.printf("GCF of %s and %s is %d%n", inputOne, inputTwo, gcf(Integer.parseInt(inputOne), Integer.parseInt(inputTwo)));
            System.out.print(String.format(message1, ""));
            inputTwo = null;
        }
    }
}
