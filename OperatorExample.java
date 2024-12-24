public class OperatorExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;
        
        // Arithmetic Operators
        int sum = a + b;           // Addition
        int difference = a - b;    // Subtraction
        int product = a * b;       // Multiplication
        int quotient = a / b;      // Division
        int remainder = a % b;     // Modulus

        // Relational Operators
        boolean isEqual = (a == b);     // Equal to
        boolean isNotEqual = (a != b);  // Not equal to
        boolean isGreater = (a > b);    // Greater than
        boolean isLess = (a < b);       // Less than

        // Logical Operators
        boolean and = (a > b) && (b < c); // AND
        boolean or = (a > b) || (b > c);  // OR
        boolean not = !(a > b);           // NOT

        // Assignment Operator
        int d = a; // a ki value "d" m assign hogi

        // Unary Operator
        int postIncrement = a++;  // Post-increment
        int preIncrement = ++b;   // Pre-increment

        // RESULT
        System.out.println("Arithmetic Operations:");
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + difference);
        System.out.println("a * b = " + product);
        System.out.println("a / b = " + quotient);
        System.out.println("a % b = " + remainder);

        System.out.println("\nRelational Operations:");//'\n'used 4 nxt line
        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("a > b: " + isGreater);
        System.out.println("a < b: " + isLess);

        System.out.println("\nLogical Operations:");
        System.out.println("(a > b) && (b < c): " + and);
        System.out.println("(a > b) || (b > c): " + or);
        System.out.println("!(a > b): " + not);

        System.out.println("\nUnary Operations:");
        System.out.println("Post-increment a++: " + postIncrement);
        System.out.println("Pre-increment ++b: " + preIncrement);

        System.out.println("\nAssignment Operation:");
        System.out.println("d = a: " + d);
    }
}
