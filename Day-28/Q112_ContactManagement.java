import java.util.Scanner;

public class Q112_ContactManagement {
    static int count = 0;
    static String[] names = new String[100];
    static String[] phones = new String[100];
    static String[] emails = new String[100];

    static void addContact(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter Name: "); names[count] = sc.nextLine();
        System.out.print("Enter Phone: "); phones[count] = sc.nextLine();
        System.out.print("Enter Email: "); emails[count] = sc.nextLine();
        count++;
        System.out.println("Contact added.");
    }

    static void displayAll() {
        if (count == 0) { System.out.println("No contacts."); return; }
        System.out.printf("%-5s %-20s %-15s %-25s%n", "No.", "Name", "Phone", "Email");
        for (int i = 0; i < count; i++)
            System.out.printf("%-5d %-20s %-15s %-25s%n", i + 1, names[i], phones[i], emails[i]);
    }

    static void searchContact(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter name to search: ");
        String key = sc.nextLine().toLowerCase();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (names[i].toLowerCase().contains(key)) {
                System.out.println("Name: " + names[i] + " | Phone: " + phones[i] + " | Email: " + emails[i]);
                found = true;
            }
        }
        if (!found) System.out.println("Contact not found.");
    }

    static void deleteContact(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter name to delete: ");
        String key = sc.nextLine().toLowerCase();
        for (int i = 0; i < count; i++) {
            if (names[i].toLowerCase().equals(key)) {
                for (int j = i; j < count - 1; j++) {
                    names[j] = names[j+1]; phones[j] = phones[j+1]; emails[j] = emails[j+1];
                }
                count--;
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add Contact\n2. Display All\n3. Search\n4. Delete\n5. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: addContact(sc); break;
                case 2: displayAll(); break;
                case 3: searchContact(sc); break;
                case 4: deleteContact(sc); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }
}
