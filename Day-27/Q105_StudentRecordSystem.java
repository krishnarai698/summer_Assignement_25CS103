import java.util.Scanner;

public class Q105_StudentRecordSystem {
    static int count = 0;
    static int[] ids = new int[100];
    static String[] names = new String[100];
    static double[] marks = new double[100];

    static void addStudent(Scanner sc) {
        System.out.print("Enter ID: "); ids[count] = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Name: "); names[count] = sc.nextLine();
        System.out.print("Enter Marks: "); marks[count] = sc.nextDouble();
        count++;
        System.out.println("Student added.");
    }

    static void displayAll() {
        if (count == 0) { System.out.println("No records found."); return; }
        System.out.printf("%-5s %-20s %-10s%n", "ID", "Name", "Marks");
        for (int i = 0; i < count; i++)
            System.out.printf("%-5d %-20s %-10.2f%n", ids[i], names[i], marks[i]);
    }

    static void searchById(Scanner sc) {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (ids[i] == id) {
                System.out.printf("Found: %d | %s | %.2f%n", ids[i], names[i], marks[i]);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void deleteById(Scanner sc) {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (ids[i] == id) {
                for (int j = i; j < count - 1; j++) {
                    ids[j] = ids[j+1]; names[j] = names[j+1]; marks[j] = marks[j+1];
                }
                count--;
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add Student\n2. Display All\n3. Search\n4. Delete\n5. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: addStudent(sc); break;
                case 2: displayAll(); break;
                case 3: searchById(sc); break;
                case 4: deleteById(sc); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }
}
