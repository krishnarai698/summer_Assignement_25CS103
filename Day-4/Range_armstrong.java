import java.util.Scanner;

public class Range_armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the range boundaries
        System.out.print("Enter lower bound: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter upper bound: ");
        int upperBound = scanner.nextInt();

        System.out.println("Armstrong numbers between " + lowerBound + " and " + upperBound + " are:");

        // Iterate through each number in the given range
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }

    /**
     * Helper method to verify if a number is an Armstrong number.
     */
    public static boolean isArmstrong(int num) {
        // Handle negative numbers if any are entered
        if (num < 0) {
            return false;
        }

        int originalNum = num;
        int sum = 0;
        
        // Find the total number of digits (order)
        int digits = String.valueOf(num).length();

        // Extract digits and calculate the sum of power
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        // Return true if the sum matches the original number
        return sum == originalNum;
    }
}
