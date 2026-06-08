import java.util.Scanner;

public class Prime_factor {
    public static void printPrimeFactors(int n) {
        // Handle negative numbers, 0, and 1
        if (n <= 1) {
            System.out.println("No prime factors for numbers less than or equal to 1.");
            return;
        }

        // 1. Print and divide out all the 2s
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // 2. n must be odd at this point. Check odd factors up to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // 3. If n is still greater than 2, the remaining n is prime
        if (n > 2) {
            System.out.print(n);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.print("Prime factors of " + number + ": ");
            printPrimeFactors(number);
        } else {
            System.out.println("Please enter a valid integer.");
        }
        
        scanner.close();
    }
}
