public class Methods{

    // Method to add 2 numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Method to multiply 2 numbers
    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

       public static void main(String[] args) {
        // Call the addNumbers method
        int sum = addNumbers(5, 10);
        System.out.println("Sum: " + sum);

        // Call the multiplyNumbers method
        int product = multiplyNumbers(5, 10);
        System.out.println("Product: " + product);
    }
}