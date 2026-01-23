//Write a Java Program to calculate factorial value of a declared variable by creating separate
//class and method for factorial segment.

class Fact {
    int calc(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

class q05 {
    public static void main(String[] args) {
        Fact f = new Fact();
        System.out.println("Factorial = " + f.calc(5));
    }
}