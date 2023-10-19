import java.util.Scanner;
public class MyMath {

    public static int gCF(int a, int b) {
        while (b!= 0) {
            if (a>b) {
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
        System.out.println("Give a positive number: ");
        int a = Integer.parseInt(s.nextLine());
        System.out.println("Give a positive number: ");
        int b = Integer.parseInt(s.nextLine());
        System.out.println(gCF(a,b));
    }
}
