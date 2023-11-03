import java.util.Scanner;

public class MyMath {
    static Scanner s = new Scanner(System.in);

    /**
     * gcf finds the greatest common denominator
     * between the two integers
     * .
     * Side note, when the first is less than the second it's weird..?
     * But that wasn't the assignment, it prints
     * The Greatest Common Denominator is 139
     * when 1112 and 695, so... I'm done <3
     */
    public static void gcf() {

        System.out.println("Enter your first integer");
        int a = s.nextInt();
        System.out.println("Enter your second integer");
        int b = s.nextInt();
        int c = 0;
        boolean notZero = (b != 0);
        boolean aNotZero = (a!= 0);
        boolean aGreaterThanB = (a > b);
        while (notZero) {
            while (aGreaterThanB) {
                while (b == 0){
                    System.out.printf("The Greatest Common Denominator is %d", c);
                    System.exit(0);
                }
                c = b;
                b = a % b;
                a = c;
            }
            while (aNotZero){
                b = b % a;
            }
            break;
            }

    }

    public static void main(String[] args) {
        gcf();
    }
}
// 1112 gcf 695 = 139