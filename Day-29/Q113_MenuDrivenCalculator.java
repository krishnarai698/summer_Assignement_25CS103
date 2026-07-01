import java.util.Scanner;

public class Q113_MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Modulus\n6. Power\n7. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 6) {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b = sc.nextDouble();
                switch (choice) {
                    case 1: System.out.println("Result: " + (a + b)); break;
                    case 2: System.out.println("Result: " + (a - b)); break;
                    case 3: System.out.println("Result: " + (a * b)); break;
                    case 4:
                        if (b == 0) System.out.println("Division by zero!");
                        else System.out.println("Result: " + (a / b));
                        break;
                    case 5:
                        if (b == 0) System.out.println("Division by zero!");
                        else System.out.println("Result: " + (a % b));
                        break;
                    case 6: System.out.println("Result: " + Math.pow(a, b)); break;
                }
            } else if (choice == 7) {
                System.out.println("Exiting calculator.");
            } else {
                System.out.println("Invalid choice.");
            }
        } while (choice != 7);
        sc.close();
    }
}
