import java.util.Scanner;

public class EvenFibonacciSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int N = sc.nextInt();

        int a = 2;   // first even Fibonacci number
        int b = 8;   // second even Fibonacci number
        int sum = 0;

        while (a <= N) {
            sum += a;
            int next = 4 * b + a; // generate next even Fibonacci
            a = b;
            b = next;
        }

        System.out.println("Sum of even Fibonacci numbers up to " + N + " is: " + sum);
        sc.close();
    }
}
