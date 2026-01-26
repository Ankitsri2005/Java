//Write a Java program to check whether a number is prime or not.

public class q05 {
    public static void main(String[] args) {
        int num = 7;
        boolean isprime = true;

        if(num <= 1)
            isprime = false;

        for(int i=2; i<num/2; i++){
            if(num % i == 0){
                isprime = false;
                break;
            }

        }
        if(isprime)
            System.out.println("prime number");
         else
            System.out.println("not prime number");



    }
}
