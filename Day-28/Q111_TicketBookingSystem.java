import java.util.Scanner;

public class Q111_TicketBookingSystem {
    static int totalSeats = 10;
    static boolean[] seats = new boolean[10];
    static String[] passengerNames = new String[10];
    static int[] bookingIds = new int[10];
    static int bookingCounter = 1001;

    static void displaySeats() {
        System.out.println("Seat Status:");
        for (int i = 0; i < totalSeats; i++)
            System.out.println("Seat " + (i + 1) + ": " + (seats[i] ? "Booked" : "Available"));
    }

    static void bookTicket(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter passenger name: ");
        String name = sc.nextLine();
        System.out.print("Enter seat number (1-" + totalSeats + "): ");
        int seat = sc.nextInt() - 1;
        if (seat < 0 || seat >= totalSeats) { System.out.println("Invalid seat."); return; }
        if (seats[seat]) { System.out.println("Seat already booked."); return; }
        seats[seat] = true;
        passengerNames[seat] = name;
        bookingIds[seat] = bookingCounter++;
        System.out.println("Ticket booked! Booking ID: " + bookingIds[seat]);
    }

    static void cancelTicket(Scanner sc) {
        System.out.print("Enter Booking ID to cancel: ");
        int id = sc.nextInt();
        for (int i = 0; i < totalSeats; i++) {
            if (seats[i] && bookingIds[i] == id) {
                seats[i] = false;
                System.out.println("Booking " + id + " cancelled for " + passengerNames[i]);
                passengerNames[i] = null;
                return;
            }
        }
        System.out.println("Booking ID not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. View Seats\n2. Book Ticket\n3. Cancel Ticket\n4. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: displaySeats(); break;
                case 2: bookTicket(sc); break;
                case 3: cancelTicket(sc); break;
                case 4: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        sc.close();
    }
}
