public class MethodOverloading {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add 3 integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add 2 double numbers
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling add method with 2 integers
        int sum1 = add(5, 10);
        System.out.println("Sum of two integers: " + sum1);

        // Calling add method with 3 integers
        int sum2 = add(5, 10, 15);
        System.out.println("Sum of three integers: " + sum2);

        // Calling add method with 2 double values
        double sum3 = add(5.5, 10.5);
        System.out.println("Sum of two doubles: " + sum3);
    }
}