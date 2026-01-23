//Write a Java program to find maximum of three numbers.

class q08 {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;
        int max = (a > b && a > c) ? a : (b > c ? b : c);
        System.out.println("Maximum = " + max);
    }
}