import java.util.Scanner;

public class Q103_ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000.00;
        int pin = 1234;

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();
        if (enteredPin != pin) {
            System.out.println("Incorrect PIN. Access denied.");
            sc.close();
            return;
        }

        int choice;
        do {
            System.out.println("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("Current balance: Rs. %.2f%n", balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    if (dep > 0) { balance += dep; System.out.printf("Deposited Rs. %.2f. New balance: Rs. %.2f%n", dep, balance); }
                    else System.out.println("Invalid amount.");
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double wd = sc.nextDouble();
                    if (wd > 0 && wd <= balance) { balance -= wd; System.out.printf("Withdrawn Rs. %.2f. New balance: Rs. %.2f%n", wd, balance); }
                    else System.out.println("Insufficient balance or invalid amount.");
                    break;
                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        sc.close();
    }
}
