import java.util.Scanner;

public class Q110_BankAccountSystem {
    static int count = 0;
    static int[] accNos = new int[100];
    static String[] accNames = new String[100];
    static double[] balances = new double[100];

    static void createAccount(Scanner sc) {
        System.out.print("Enter Account Number: "); accNos[count] = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Account Holder Name: "); accNames[count] = sc.nextLine();
        System.out.print("Enter Initial Balance: "); balances[count] = sc.nextDouble();
        count++;
        System.out.println("Account created successfully.");
    }

    static int findAccount(int accNo) {
        for (int i = 0; i < count; i++) if (accNos[i] == accNo) return i;
        return -1;
    }

    static void deposit(Scanner sc) {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        int idx = findAccount(accNo);
        if (idx == -1) { System.out.println("Account not found."); return; }
        System.out.print("Enter deposit amount: ");
        double amt = sc.nextDouble();
        balances[idx] += amt;
        System.out.printf("Deposited Rs. %.2f. New Balance: Rs. %.2f%n", amt, balances[idx]);
    }

    static void withdraw(Scanner sc) {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        int idx = findAccount(accNo);
        if (idx == -1) { System.out.println("Account not found."); return; }
        System.out.print("Enter withdrawal amount: ");
        double amt = sc.nextDouble();
        if (amt > balances[idx]) System.out.println("Insufficient balance.");
        else { balances[idx] -= amt; System.out.printf("Withdrawn Rs. %.2f. New Balance: Rs. %.2f%n", amt, balances[idx]); }
    }

    static void checkBalance(Scanner sc) {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        int idx = findAccount(accNo);
        if (idx == -1) System.out.println("Account not found.");
        else System.out.printf("Account: %d | Name: %s | Balance: Rs. %.2f%n", accNos[idx], accNames[idx], balances[idx]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Check Balance\n5. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: createAccount(sc); break;
                case 2: deposit(sc); break;
                case 3: withdraw(sc); break;
                case 4: checkBalance(sc); break;
                case 5: System.out.println("Thank you!"); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }
}
