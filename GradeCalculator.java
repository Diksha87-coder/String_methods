
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in English: ");
        int english = sc.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        System.out.print("Enter marks in Science: ");
        int science = sc.nextInt();

        if (english < 0 || english > 100 ||
            maths < 0 || maths > 100 ||
            science < 0 || science > 100) {
            System.out.println("Invalid marks! Enter marks from 0 to 100.");
            sc.close();
            return;
        }

        int total = english + maths + science;
        double percentage = total / 3.0;

        System.out.println("\n----- Student Result -----");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total + "/300");
        System.out.printf("Percentage: %.2f%%\n", percentage);

        if (english < 33 || maths < 33 || science < 33) {
            System.out.println("Grade: Fail");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
