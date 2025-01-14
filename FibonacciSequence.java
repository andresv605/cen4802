package cen4802;
import java.util.Scanner;

public class FibonacciSequence {
    /**
     * This method uses recursion to calculate the position of a term of the Fibonacci sequence.
     *
     * @param n the position in the Fibonacci sequence (n >= 1)
     * @return the nth term of the Fibonacci sequence
     */
    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number position in the Fibonacci sequence: ");
        int n = scanner.nextInt();

        int y = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + y + ".");

        scanner.close();
    }
}

