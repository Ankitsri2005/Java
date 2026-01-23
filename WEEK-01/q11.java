//Write a Java program for following grading system.
//Note: Percentage>=90% : Grade A
//Percentage>=80% : Grade B
//Percentage>=70% : Grade C
//Percentage>=60% : Grade D
//Percentage>=40% : Grade E
//Percentage<40% : Grade F


class q11 {
    public static void main(String[] args) {
        int p = 78;

        if (p >= 90) System.out.println("Grade A");
        else if (p >= 80) System.out.println("Grade B");
        else if (p >= 70) System.out.println("Grade C");
        else if (p >= 60) System.out.println("Grade D");
        else if (p >= 40) System.out.println("Grade E");
        else System.out.println("Grade F");
    }
}