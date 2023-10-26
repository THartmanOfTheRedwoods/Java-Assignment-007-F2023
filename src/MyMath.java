import java.util.Scanner;

public class MyMath {

    public static void gcf(){
        //2 inputs from user
        System.out.println("enter dividend");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("enter divisor");
        int b = input.nextInt();


        //gcf algorithm
       while(b!=0){
           int c = b;
           b = a % b;
           a = c;
           }

        System.out.println("the gcf is " + a);
    }

    public static void main(String[] args) {
        gcf();
    }

}
