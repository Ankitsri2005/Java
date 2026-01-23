//Write a Java Program to calculate factorial value of a declared variable by creating separate
//method for factorial segment.

class q04 {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial = " + factorial(num));
    }
}