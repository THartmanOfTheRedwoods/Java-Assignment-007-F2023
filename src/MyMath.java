import java.util.Scanner;

public class MyMath {

        public static int gcf(int a, int b) {
            while (b != 0) {
                if (a > b) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                } else {
                    int temp = a;
                    a = b;
                    b = temp % b;
                }
            }

            return a;
        }

        // method for testing
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("first number: ");
            int num1 = scanner.nextInt();

            System.out.print("second number: ");
            int num2 = scanner.nextInt();


            int result = gcf(num1, num2);
            System.out.println("The GCF of " + num1 + " and " + num2 + " is: " + result);


        }
    }

