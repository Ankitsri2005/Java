//Write a Java program to reverse a number.


public class q03 {
    public static void main(String[] args) {
        int num = 1234, rev = 0;

        while(num != 0){
            int digit = num % 10;
            rev = rev*10+digit;
            num /= 10;

        }
        System.out.println("reversed number is: " + rev);



    }
}
