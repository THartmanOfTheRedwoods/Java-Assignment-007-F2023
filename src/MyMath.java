import java.util.Scanner;

public class MyMath {

    private static int gcf;
    private static int userVal1;
    private static int userVal2;
    static Scanner s = new Scanner(System.in);


    private static void getUserVals() {
        userVal1 = Integer.parseInt(s.nextLine());
        userVal2 = Integer.parseInt(s.nextLine());
        sortUserVals(userVal1, userVal2);
    }

    private static void sortUserVals(int a, int b) {
        if (a > b) {
            userVal1 = b;
            userVal2 = a;
        }
    }

    private static int euclidModulo(int dividend, int divisor) {
        return dividend % divisor;
    }

    private static void euclidGCF() {
        getUserVals();
        if (userVal1 == userVal2) {
            gcf = userVal1;
        }
        while (userVal1 % userVal2 != 0) {
            gcf = euclidModulo(userVal1, userVal2);
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
