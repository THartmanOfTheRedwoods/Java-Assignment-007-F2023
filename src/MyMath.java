/**
 *
 * @author Trevor Hartman
 * @author Cassandra Portlock
 *
 * @since Version 1
 *
 */

import java.util.Scanner;

public class MyMath {
    private final static Scanner s = new Scanner(System.in);
    public static void gcf() {
        System.out.print("Type first number to find greatest common factor: ");
        int a = s.nextInt();

        System.out.print("Type first number to find greatest common factor: ");
        int b = s.nextInt();

        while (b != 0) {
            int gcf = a;
            a = b;
            b = gcf % b;
        }

        System.out.printf("The Greatest Common Factor is: %s", a);
    }

    public static void main(String[] args) {
        gcf();
    }
}
