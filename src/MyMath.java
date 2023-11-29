import java.util.Scanner;

/**
 * @author Trevor Hartman
 * @author MJ Fracess
 * @since Version 1.0
 */
public class MyMath {
    private final static Scanner s = new Scanner(System.in);
    public static void gcf (){
        System.out.println("Enter your first number to find the greatest common factor:");
        int a = s.nextInt();

        System.out.println("Enter your second number to find the greatest common factor:");
        int b = s.nextInt();

        while (b!= 0){
            int c = a;
            a=b;
            b = c % b;
        }
        System.out.printf("The Greatest Common Factor is: %d", a);
    }

    public static void main(String[] args) {
    gcf();
    }
}
