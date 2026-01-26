//10. Implementation of call by value and call by reference.

class q10 {

    static void changeValue(int x) {
        x = 100;
    }

    static void changeArray(int[] arr) {
        arr[0] = 100;
    }

    public static void main(String[] args) {
        int num = 50;
        int[] arr = {10};

        changeValue(num);
        changeArray(arr);

        System.out.println("Call by Value: " + num);
        System.out.println("Call by Reference: " + arr[0]);
    }
}

