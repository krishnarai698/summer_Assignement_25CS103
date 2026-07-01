import java.util.Scanner;

public class Q118_MiniLibrarySystem {
    static int bookCount = 0, memberCount = 0;
    static int[] bookIds = new int[50];
    static String[] bookTitles = new String[50];
    static String[] bookAuthors = new String[50];
    static boolean[] bookAvailable = new boolean[50];
    static int[] issuedTo = new int[50];

    static int[] memberIds = new int[50];
    static String[] memberNames = new String[50];

    static void addBook(Scanner sc) {
        System.out.print("Book ID: "); bookIds[bookCount] = sc.nextInt(); sc.nextLine();
        System.out.print("Title: "); bookTitles[bookCount] = sc.nextLine();
        System.out.print("Author: "); bookAuthors[bookCount] = sc.nextLine();
        bookAvailable[bookCount] = true;
        issuedTo[bookCount] = -1;
        bookCount++;
        System.out.println("Book added.");
    }

    static void addMember(Scanner sc) {
        System.out.print("Member ID: "); memberIds[memberCount] = sc.nextInt(); sc.nextLine();
        System.out.print("Name: "); memberNames[memberCount] = sc.nextLine();
        memberCount++;
        System.out.println("Member added.");
    }

    static void issueBook(Scanner sc) {
        System.out.print("Book ID: "); int bid = sc.nextInt();
        System.out.print("Member ID: "); int mid = sc.nextInt();
        for (int i = 0; i < bookCount; i++) {
            if (bookIds[i] == bid) {
                if (!bookAvailable[i]) { System.out.println("Book not available."); return; }
                bookAvailable[i] = false; issuedTo[i] = mid;
                System.out.println("Book issued to member " + mid);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    static void returnBook(Scanner sc) {
        System.out.print("Book ID: "); int bid = sc.nextInt();
        for (int i = 0; i < bookCount; i++) {
            if (bookIds[i] == bid) {
                if (bookAvailable[i]) { System.out.println("Book was not issued."); return; }
                bookAvailable[i] = true; issuedTo[i] = -1;
                System.out.println("Book returned.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    static void displayBooks() {
        System.out.printf("%-5s %-25s %-20s %-12s %-10s%n", "ID", "Title", "Author", "Status", "IssuedTo");
        for (int i = 0; i < bookCount; i++)
            System.out.printf("%-5d %-25s %-20s %-12s %-10s%n", bookIds[i], bookTitles[i], bookAuthors[i],
                    bookAvailable[i] ? "Available" : "Issued", bookAvailable[i] ? "-" : String.valueOf(issuedTo[i]));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add Book\n2. Add Member\n3. Issue Book\n4. Return Book\n5. Display Books\n6. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: addBook(sc); break;
                case 2: addMember(sc); break;
                case 3: issueBook(sc); break;
                case 4: returnBook(sc); break;
                case 5: displayBooks(); break;
                case 6: System.out.println("Exiting library system."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 6);
        sc.close();
    }
}
