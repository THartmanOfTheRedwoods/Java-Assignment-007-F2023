/*
// ChrisShortt
12/7/2023
*/
public class MyMath {

        // Method to calculate the Greatest Common Factor (GCF) of two numbers
        public static int gcf(int num1, int num2) {
            while (num2 != 0) {
                int temp = num2;
                num2 = num1 % num2;
                num1 = temp;
            }
            return num1;
        }

        // Example usage in a main method
        public static void main(String[] args) {
            int a = 12;
            int b = 18;
            int result = gcf(a, b);
            System.out.println("The GCF of " + a + " and " + b + " is: " + result);
        }
    }