/*Finn Clark
10/21/23
CIS - 12
Hartman
* */
import java.util.Scanner;

public class MyMath {

    public static int gCF(int x, int y) {

        while (y != 0){
            int z = y;
            y = x%y;
            x = z;
        }return x;
    }

        public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numerator = Integer.parseInt(in.nextLine());
        System.out.println("Enter another number to find their greatest common factor: ");
        int denominator = Integer.parseInt(in.nextLine());
        int gcf = gCF(numerator, denominator);
            System.out.printf("The greatest common factor of %d and %d is %d", numerator, denominator, gcf);
        }
    }
