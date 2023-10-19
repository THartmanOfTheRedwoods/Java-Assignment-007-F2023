
public class MyMath {
    public static int gcf(int a, int b){
        while (b!=0){
            if (a>b){
                int c = b;
                b = a%b;
                a = c;
            }
          else{  b = b%a;}
        } return a;
    }

    public static void main(String[] args) {
        System.out.println(gcf(78345,369 ));  }
}
