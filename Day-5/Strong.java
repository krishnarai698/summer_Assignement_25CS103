import java.util.Scanner;

public class Strong {

    // Helper method to calculate the factorial of a digit
    public static int getFactorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check: ");
        int originalNumber = scanner.nextInt();
        
        int temp = originalNumber;
        int sumOfFactorials = 0;
        
        // Extract digits and calculate sum of their factorials
        while (temp > 0) {
            int lastDigit = temp % 10;
            sumOfFactorials += getFactorial(lastDigit);
            temp /= 10;
        }
        
        // Check if the sum matches the original number
        if (sumOfFactorials == originalNumber) {
            System.out.println(originalNumber + " is a Strong Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Strong Number.");
        }
        
        scanner.close();
    }
}
