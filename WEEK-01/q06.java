//Write a Java Program to calculate factorial value of a variable by taking input from command
//line.

class q06 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);
    }
}