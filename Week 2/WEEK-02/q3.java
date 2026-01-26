//Write a Java program to find the sum of even numbers in an integer array.

public class q3 {
    public static void main (String[] args){
        int arr[] = {1,2,3,4,5};
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            if(num % 2 == 0)
                sum +=num;

        }
        System.out.println("even numbers " + sum);


    }
}
