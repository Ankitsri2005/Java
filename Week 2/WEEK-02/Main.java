//Write a java program to create a simple array and access array element.

class Main{
    public static void main (String[] args){
        int arr[] = {1,2,3,4,5,6};
        System.out.println("Array elements");

        for(int i=0; i<arr.length; i++){
            System.out.println("index "+ i + " : "+ arr[i]);
        }

    }
}