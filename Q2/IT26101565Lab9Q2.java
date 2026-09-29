import java.util.Scanner;

public class IT26101565Lab9Q2 {

    // Method to calculate the area of a circle
    public static double circleArea(double radius) {

        double area;

        area = Math.PI * radius * radius;

        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius;
        double area;

        System.out.print("Enter the radius: ");
        radius = input.nextDouble();

        area = circleArea(radius);

        System.out.println("Area of the circle = " + area);
    }
}
