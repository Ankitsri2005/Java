//A college plans to develop a Java-based Student Marks Analysis System to process and
//analyze academic data efficiently. The system should store student marks using arrays
//and perform various analytical and decision-making operations on the stored data. As a
//Java lab student, you are required to design and implement a Java program that meets
//the following functional requirements:

//• Store the marks of a given number of students using a one-dimensional array.
//• Accept marks from the user at runtime.
//• Compute and display statistical information such as total and average marks.
//• Identify the highest and lowest marks from the dataset.
//• Classify each student’s result based on predefined evaluation criteria.
//• Display all stored marks in an organized format.
//• Ensure proper validation of input values.

import java.util.*;

class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter marks of student " + (i + 1) + ": ");
                int m = sc.nextInt();

                if (m >= 0 && m <= 100) {
                    marks[i] = m;
                    break;
                }
                System.out.println("Invalid marks! Enter between 0–100.");
            }
        }

        for (int mark : marks) {
            total += mark;
            max = Math.max(max, mark);
            min = Math.min(min, mark);
        }

        double average = (double) total / n;

        System.out.println("\n--- Student Marks Report ---");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);

        System.out.println("\nStudent Results:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": " + marks[i] + " - ");
            if (marks[i] >= 40) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
        sc.close();
    }
}

