import java.util.Scanner;

public class MyMath {
    public static Scanner scanner = new Scanner(System.in);
    public static void gcf() {
        System.out.println("Give First Number: ");
        int a = scanner.nextInt();
        System.out.println("Give Second Number: ");
        int b = scanner.nextInt();
        int c;

        while (b != 0) {
            c = a;
            a = b;
            b = c % a;
        }

        System.out.println("GCF is: " + a);
    }
    public static void main(String[] args) {
        gcf();
    }
}
