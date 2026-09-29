import java.util.Scanner;

public class IT26101565Lab9Q4 {

    // a) Calculate final mark: 30% assignment + 70% exam
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    // b) Determine grade based on final mark
    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // c) Print student details formatted into columns
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s%-15.2f%-15c%n", name, finalMark, grade);
    }

    // d) Main method to handle input for 5 students
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store details for 5 students
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        // Input loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = scanner.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignmentMark = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double examMark = scanner.nextDouble();

            // Calculate final mark and grade
            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            grades[i] = findGrades(finalMarks[i]);

            System.out.println(); // Blank line between student inputs
        }

        // Print header
        System.out.printf("%-15s%-15s%-15s%n", "Name", "Final Mark", "Grade");

        // Print student details
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        scanner.close();
    }
}