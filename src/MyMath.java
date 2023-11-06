import java.util.Scanner;

public class MyMath {
    public static void gcf() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        while (a != b) {
            if (a > b) {
                a %= b;
                System.out.print(b);
                break;
            } else {
                 a %= b;
                System.out.print(a);
                break;
            }

        }
    }
    public static void main(String[] args) {
        gcf();
    }
}
