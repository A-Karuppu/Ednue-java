import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        int n;
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int numTerms = scanner.nextInt();

        if (numTerms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            for (int i = 0; i < numTerms; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
        scanner.close();
    }

   
}
