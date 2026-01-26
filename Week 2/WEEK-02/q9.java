//Implementation of returning the value from the caller method.

public class q9 {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println("Sum: " + result);
    }
}
