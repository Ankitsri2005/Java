
//An educational institute plans to develop a Java-based Utility System to assist students in
//        performing basic computational and logical operations required in academic activities. The
//        system should demonstrate the use of input/output operations, arithmetic processing,
//        decision-making constructs, modular programming using methods, object-oriented concepts
//        using classes, and command-line arguments. As a Java lab student, you are required to design
//        and implement a Java application that satisfies the following functional requirements:
//        • Display an appropriate welcome message at the start of execution.
//        • Perform basic arithmetic processing using declared variables.
//        • Compute a mathematical result using iterative logic, and demonstrate modularity by
//        implementing the logic using methods and separate classes.
//        • Accept user input both through the keyboard and via command-line arguments.
//        • Classify numeric input based on given conditions.

import java.util.Scanner;

class Utility {
    void arithmetic(int a, int b) {
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
    }

    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    void classify(int n) {
        if (n > 0)
            System.out.println("Positive Number");
        else if (n < 0)
            System.out.println("Negative Number");
        else
            System.out.println("Zero");
    }
}

class q13 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Utility System");

        int x = 10, y = 5;
        Utility u = new Utility();
        u.arithmetic(x, y);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factorial = " + u.factorial(n));
        u.classify(n);

        if (args.length > 0) {
            int cmd = Integer.parseInt(args[0]);
            System.out.println("Command Line Input = " + cmd);
            u.classify(cmd);
        }
    }
}
