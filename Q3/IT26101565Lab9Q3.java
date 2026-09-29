public class IT26101565Lab9Q3 {

    // Method to add two integers
    public static int add(int num1, int num2) {

        return num1 + num2;
    }

    // Method to multiply two integers
    public static int multiply(int num1, int num2) {

        return num1 * num2;
    }

    // Method to square an integer
    public static int square(int num) {

        return num * num;
    }

    public static void main(String[] args) {

        int result1;
        int result2;

        // Expression i
        result1 = square(add(multiply(3, 4), multiply(5, 7)));

        // Expression ii
        result2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of expression i = " + result1);
        System.out.println("Result of expression ii = " + result2);
    }
}

