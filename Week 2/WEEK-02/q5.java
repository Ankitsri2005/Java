//Write a Java program to find the sum of diagonal elements in a 2D array.

public class q5 {
    public static void main (String[] args){
        int matrices[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        int sum = 0;
        for(int i=0; i<matrices.length; i++){
            sum += matrices[i][i];

            }
        System.out.println("diagonal sum: "+sum);
        }




    }

