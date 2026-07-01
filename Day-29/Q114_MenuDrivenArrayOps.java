import java.util.Scanner;

public class Q114_MenuDrivenArrayOps {
    static int[] arr = new int[100];
    static int n = 0;

    static void inputArray(Scanner sc) {
        System.out.print("Enter size: "); n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
    }

    static void displayArray() {
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void findSum() {
        int sum = 0;
        for (int i = 0; i < n; i++) sum += arr[i];
        System.out.println("Sum: " + sum + " | Average: " + (double) sum / n);
    }

    static void findMaxMin() {
        int max = arr[0], min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Max: " + max + " | Min: " + min);
    }

    static void linearSearch(Scanner sc) {
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) { System.out.println("Found at index " + i); return; }
        }
        System.out.println("Not found.");
    }

    static void sortArray() {
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - 1 - i; j++)
                if (arr[j] > arr[j + 1]) { int t = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = t; }
        System.out.println("Array sorted.");
        displayArray();
    }

    static void reverseArray() {
        for (int i = 0, j = n - 1; i < j; i++, j--) { int t = arr[i]; arr[i] = arr[j]; arr[j] = t; }
        System.out.println("Array reversed.");
        displayArray();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Input Array\n2. Display\n3. Sum & Average\n4. Max & Min\n5. Search\n6. Sort\n7. Reverse\n8. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: inputArray(sc); break;
                case 2: displayArray(); break;
                case 3: findSum(); break;
                case 4: findMaxMin(); break;
                case 5: linearSearch(sc); break;
                case 6: sortArray(); break;
                case 7: reverseArray(); break;
                case 8: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 8);
        sc.close();
    }
}
