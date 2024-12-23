import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no. of terms for the Fibonacci series: ");
        int n = scanner.nextInt(); 
        System.out.println("Fibonacci Series up to " + n + " terms:");
        printFibonacci(n);
         scanner.close();
    }

    // Function print Fibonacci series
    static void printFibonacci(int n) {
        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculating the next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
}