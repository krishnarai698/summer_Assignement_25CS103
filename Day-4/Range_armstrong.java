import java.util.Scanner;

public class Range_armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower bound: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter upper bound: ");
        int upperBound = scanner.nextInt();

        System.out.println("Armstrong numbers between " + lowerBound + " and " + upperBound + " are:");

        
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }

    public static boolean isArmstrong(int num) {
        
        if (num < 0) {
            return false;
        }

        int originalNum = num;
        int sum = 0;
        
        
        int digits = String.valueOf(num).length();

        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        
        return sum == originalNum;
    }
}
