//Write a Java program to check whether a number is palindrome or not.

public class q04 {
    public static void main(String[] args) {
        int num = 121, rev = 0, temp = num;
        while (temp != 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        if (rev == num)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");

    }
}
