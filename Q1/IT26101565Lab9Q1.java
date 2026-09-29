import java.util.Scanner;

public class IT26101565Lab9Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, c;
        double discriminant;
        double x1, x2;

        System.out.print("Enter a: ");
        a = input.nextDouble();

        System.out.print("Enter b: ");
        b = input.nextDouble();

        System.out.print("Enter c: ");
        c = input.nextDouble();

        // Calculate the discriminant
        discriminant = Math.pow(b, 2) - (4 * a * c);

        // Three possible scenarios
        if (discriminant > 0) {

            // Two different real roots
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("There are two real solutions.");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (discriminant == 0) {

            // One real root
            x1 = -b / (2 * a);

            System.out.println("There is one real solution.");
            System.out.println("x = " + x1);

        } else {

            // No real roots
            System.out.println("There are no real solutions.");
        }
    }
}