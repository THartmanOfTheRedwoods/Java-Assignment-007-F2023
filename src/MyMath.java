import java.util.Scanner;

public class MyMath {
    public static int gcf(int in1, int in2){
        int in3;
        while(in2 != 0){
            if(in1 > in2)
                in3 = in2;
            else in2 = in2 % in1;
            in3 = in2;
            in2 = in1 % in2;
            in1 = in3;
        }
        return in1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int in1, in2;

        System.out.println("Please enter two integers to find their greatest common factor");
        System.out.print("First integer: ");
        in1 = Integer.parseInt(s.nextLine());
        System.out.print("Second integer: ");
        in2 = Integer.parseInt(s.nextLine());

        System.out.printf("The greatest common factor of %d and %d is %d", in1, in2, gcf(in1, in2));
    }
}
