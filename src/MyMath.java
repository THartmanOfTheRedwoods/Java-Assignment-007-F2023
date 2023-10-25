import java.util.Scanner;

public class MyMath {

    private static int gcf;
    private static int userVal1;
    private static int userVal2;
    static Scanner s = new Scanner(System.in);

    private static void getUserVals() {
        userVal1 = Integer.parseInt(s.nextLine());
        userVal2 = Integer.parseInt(s.nextLine());
    }

    private static int euclidMod(int dividend, int divisor) {
        return dividend % divisor;
    }

    private static void euclidGCF() {
        getUserVals();
        while (userVal1 % userVal2 != 0) {
            gcf = euclidMod(userVal1, userVal2);
            userVal1 = userVal2;
            userVal2 = gcf;
        }
        showGCF();
    }

    private static void showGCF(){
        System.out.println(gcf);
    }

    public static void main(String[] args) {
        euclidGCF();
    }
}
