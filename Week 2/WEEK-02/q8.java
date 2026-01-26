//Implementation of parameterized constructor.

public class q8 {
    int value;

    q8(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        q8 obj = new q8(100);
        System.out.println("Value: " + obj.value);
    }
}
