import java.util.Scanner;

public class Q109_LibraryManagement {
    static int count = 0;
    static int[] bookIds = new int[100];
    static String[] titles = new String[100];
    static String[] authors = new String[100];
    static boolean[] available = new boolean[100];

    static void addBook(Scanner sc) {
        System.out.print("Enter Book ID: "); bookIds[count] = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Title: "); titles[count] = sc.nextLine();
        System.out.print("Enter Author: "); authors[count] = sc.nextLine();
        available[count] = true;
        count++;
        System.out.println("Book added.");
    }

    static void displayBooks() {
        if (count == 0) { System.out.println("No books found."); return; }
        System.out.printf("%-5s %-25s %-20s %-10s%n", "ID", "Title", "Author", "Status");
        for (int i = 0; i < count; i++)
            System.out.printf("%-5d %-25s %-20s %-10s%n", bookIds[i], titles[i], authors[i],
                    available[i] ? "Available" : "Issued");
    }

    static void issueBook(Scanner sc) {
        System.out.print("Enter Book ID to issue: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (bookIds[i] == id) {
                if (available[i]) { available[i] = false; System.out.println("Book issued."); }
                else System.out.println("Book already issued.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    static void returnBook(Scanner sc) {
        System.out.print("Enter Book ID to return: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (bookIds[i] == id) {
                if (!available[i]) { available[i] = true; System.out.println("Book returned."); }
                else System.out.println("Book was not issued.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add Book\n2. Display Books\n3. Issue Book\n4. Return Book\n5. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: addBook(sc); break;
                case 2: displayBooks(); break;
                case 3: issueBook(sc); break;
                case 4: returnBook(sc); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }
}
