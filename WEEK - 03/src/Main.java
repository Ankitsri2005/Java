//Write a java program to implement BufferedReader class.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Enter your name: ");

        String name = br.readLine();


        System.out.println("Hello " + name);
    }
}
