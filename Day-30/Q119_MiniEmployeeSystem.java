import java.util.Scanner;

public class Q119_MiniEmployeeSystem {
    static int count = 0;
    static int[] ids = new int[100];
    static String[] names = new String[100];
    static String[] depts = new String[100];
    static String[] designations = new String[100];
    static double[] basics = new double[100];

    static double calculateGross(double basic) { return basic + 0.20 * basic + 0.50 * basic; }
    static double calculateNet(double gross) { return gross - (gross > 50000 ? 0.10 * gross : 0); }

    static void addEmployee(Scanner sc) {
        System.out.print("ID: "); ids[count] = sc.nextInt(); sc.nextLine();
        System.out.print("Name: "); names[count] = sc.nextLine();
        System.out.print("Department: "); depts[count] = sc.nextLine();
        System.out.print("Designation: "); designations[count] = sc.nextLine();
        System.out.print("Basic Salary: "); basics[count] = sc.nextDouble();
        count++;
        System.out.println("Employee added.");
    }

    static void displayAll() {
        if (count == 0) { System.out.println("No employees."); return; }
        System.out.printf("%-5s %-18s %-12s %-15s %-10s %-10s %-10s%n",
                "ID", "Name", "Dept", "Designation", "Basic", "Gross", "Net");
        for (int i = 0; i < count; i++) {
            double gross = calculateGross(basics[i]);
            double net = calculateNet(gross);
            System.out.printf("%-5d %-18s %-12s %-15s %-10.0f %-10.0f %-10.0f%n",
                    ids[i], names[i], depts[i], designations[i], basics[i], gross, net);
        }
    }

    static void departmentReport() {
        sc_ref = null;
        System.out.print("Enter Department: ");
        Scanner sc = new Scanner(System.in);
        String dept = sc.nextLine();
        int deptCount = 0;
        double totalSalary = 0;
        for (int i = 0; i < count; i++) {
            if (depts[i].equalsIgnoreCase(dept)) {
                System.out.printf("ID: %d | %s | Net: %.2f%n", ids[i], names[i], calculateNet(calculateGross(basics[i])));
                deptCount++;
                totalSalary += calculateNet(calculateGross(basics[i]));
            }
        }
        if (deptCount == 0) System.out.println("No employees in this department.");
        else System.out.printf("Total employees: %d | Total salary: %.2f%n", deptCount, totalSalary);
    }

    static Scanner sc_ref;

    static void searchEmployee(Scanner sc) {
        System.out.print("Enter ID: "); int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (ids[i] == id) {
                double gross = calculateGross(basics[i]);
                double net = calculateNet(gross);
                System.out.printf("ID: %d | Name: %s | Dept: %s | Designation: %s%n", ids[i], names[i], depts[i], designations[i]);
                System.out.printf("Basic: %.2f | Gross: %.2f | Net: %.2f%n", basics[i], gross, net);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    static void highestPaid() {
        if (count == 0) { System.out.println("No employees."); return; }
        int topIdx = 0;
        for (int i = 1; i < count; i++) if (basics[i] > basics[topIdx]) topIdx = i;
        System.out.println("Highest paid: " + names[topIdx] + " with Net Salary: " + String.format("%.2f", calculateNet(calculateGross(basics[topIdx]))));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add Employee\n2. Display All\n3. Search Employee\n4. Department Report\n5. Highest Paid\n6. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: addEmployee(sc); break;
                case 2: displayAll(); break;
                case 3: searchEmployee(sc); break;
                case 4: departmentReport(); break;
                case 5: highestPaid(); break;
                case 6: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 6);
        sc.close();
    }
}
