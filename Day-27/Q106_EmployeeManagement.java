import java.util.Scanner;

public class Q106_EmployeeManagement {
    static int count = 0;
    static int[] empIds = new int[100];
    static String[] empNames = new String[100];
    static String[] departments = new String[100];
    static double[] salaries = new double[100];

    static void addEmployee(Scanner sc) {
        System.out.print("Enter Employee ID: "); empIds[count] = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Name: "); empNames[count] = sc.nextLine();
        System.out.print("Enter Department: "); departments[count] = sc.nextLine();
        System.out.print("Enter Salary: "); salaries[count] = sc.nextDouble();
        count++;
        System.out.println("Employee added.");
    }

    static void displayAll() {
        if (count == 0) { System.out.println("No employees found."); return; }
        System.out.printf("%-6s %-20s %-15s %-10s%n", "ID", "Name", "Department", "Salary");
        for (int i = 0; i < count; i++)
            System.out.printf("%-6d %-20s %-15s %-10.2f%n", empIds[i], empNames[i], departments[i], salaries[i]);
    }

    static void searchById(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (empIds[i] == id) {
                System.out.printf("ID: %d | Name: %s | Dept: %s | Salary: %.2f%n",
                        empIds[i], empNames[i], departments[i], salaries[i]);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    static void updateSalary(Scanner sc) {
        System.out.print("Enter Employee ID to update salary: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (empIds[i] == id) {
                System.out.print("Enter new salary: ");
                salaries[i] = sc.nextDouble();
                System.out.println("Salary updated.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add Employee\n2. Display All\n3. Search\n4. Update Salary\n5. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: addEmployee(sc); break;
                case 2: displayAll(); break;
                case 3: searchById(sc); break;
                case 4: updateSalary(sc); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }
}
