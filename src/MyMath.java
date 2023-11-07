import java.util.Scanner;
public class MyMath {
    static Scanner scan = new Scanner(System.in);
    public static void gcf() {
        System.out.println("This method will calculate the greatest common factor (GCF) of two numbers.");
        System.out.println("Enter your larger number: ");
            int a = scan.nextInt();
            System.out.println("Enter your smaller number: ");
            int b = scan.nextInt();
        while (true) {
            if (a % b == 0) {
                break;
            } else {
                int c = a % b;
                a = b;
                b = c;
            }
        }
        System.out.println("The GCF of the numbers you entered is " + b);
    }
    public static void main(String[] args) {
        gcf();
    }
}
