import java.util.Scanner;

public class Q117_StudentRecordArrayStrings {
    static int count = 0;
    static int[] rollNos = new int[100];
    static String[] names = new String[100];
    static int[][] subMarks = new int[100][5];
    static String[] subjects = {"Maths", "Science", "English", "History", "Computer"};

    static void addStudent(Scanner sc) {
        System.out.print("Enter Roll No: "); rollNos[count] = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Name: "); names[count] = sc.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.print("Marks in " + subjects[i] + ": ");
            subMarks[count][i] = sc.nextInt();
        }
        count++;
        System.out.println("Student record added.");
    }

    static void displayStudent(int idx) {
        int total = 0;
        System.out.println("\nRoll No: " + rollNos[idx] + " | Name: " + names[idx]);
        for (int i = 0; i < 5; i++) { System.out.println(subjects[i] + ": " + subMarks[idx][i]); total += subMarks[idx][i]; }
        double pct = total / 5.0;
        String grade = pct >= 90 ? "A+" : pct >= 80 ? "A" : pct >= 70 ? "B" : pct >= 60 ? "C" : pct >= 50 ? "D" : "F";
        System.out.printf("Total: %d | Percentage: %.2f%% | Grade: %s | Result: %s%n",
                total, pct, grade, pct >= 40 ? "PASS" : "FAIL");
    }

    static void displayAll() {
        if (count == 0) { System.out.println("No records."); return; }
        for (int i = 0; i < count; i++) displayStudent(i);
    }

    static void searchByRoll(Scanner sc) {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        for (int i = 0; i < count; i++) if (rollNos[i] == roll) { displayStudent(i); return; }
        System.out.println("Student not found.");
    }

    static void topPerformer() {
        if (count == 0) { System.out.println("No records."); return; }
        int topIdx = 0, topTotal = 0;
        for (int i = 0; i < count; i++) {
            int total = 0;
            for (int j = 0; j < 5; j++) total += subMarks[i][j];
            if (total > topTotal) { topTotal = total; topIdx = i; }
        }
        System.out.println("Top Performer:");
        displayStudent(topIdx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add Student\n2. Display All\n3. Search by Roll No\n4. Top Performer\n5. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: addStudent(sc); break;
                case 2: displayAll(); break;
                case 3: searchByRoll(sc); break;
                case 4: topPerformer(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        sc.close();
    }
}
