import java.util.Scanner;

public class Q116_InventoryManagement {
    static int count = 0;
    static int[] itemIds = new int[100];
    static String[] itemNames = new String[100];
    static int[] quantities = new int[100];
    static double[] prices = new double[100];

    static void addItem(Scanner sc) {
        System.out.print("Enter Item ID: "); itemIds[count] = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Item Name: "); itemNames[count] = sc.nextLine();
        System.out.print("Enter Quantity: "); quantities[count] = sc.nextInt();
        System.out.print("Enter Price: "); prices[count] = sc.nextDouble();
        count++;
        System.out.println("Item added.");
    }

    static void displayItems() {
        if (count == 0) { System.out.println("No items."); return; }
        System.out.printf("%-5s %-20s %-10s %-10s %-12s%n", "ID", "Name", "Qty", "Price", "Total Value");
        for (int i = 0; i < count; i++)
            System.out.printf("%-5d %-20s %-10d %-10.2f %-12.2f%n",
                    itemIds[i], itemNames[i], quantities[i], prices[i], quantities[i] * prices[i]);
    }

    static void updateStock(Scanner sc) {
        System.out.print("Enter Item ID: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (itemIds[i] == id) {
                System.out.print("Enter quantity to add: ");
                quantities[i] += sc.nextInt();
                System.out.println("Stock updated. New quantity: " + quantities[i]);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    static void searchItem(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter item name to search: ");
        String key = sc.nextLine().toLowerCase();
        for (int i = 0; i < count; i++) {
            if (itemNames[i].toLowerCase().contains(key))
                System.out.printf("ID: %d | %s | Qty: %d | Price: %.2f%n", itemIds[i], itemNames[i], quantities[i], prices[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add Item\n2. Display Items\n3. Update Stock\n4. Search Item\n5. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: addItem(sc); break;
                case 2: displayItems(); break;
                case 3: updateStock(sc); break;
                case 4: searchItem(sc); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }
}
