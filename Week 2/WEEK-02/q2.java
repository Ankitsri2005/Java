//Write a java program to create 2D array and access the array element.

public class q2 {
    public static void main (String[] args){
        int arr[][] = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println("array elements");

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
