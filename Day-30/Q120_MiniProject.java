import java.util.Scanner;

public class Q120_MiniProject {
    static int studentCount = 0;
    static int[] rollNos = new int[100];
    static String[] names = new String[100];
    static String[] emails = new String[100];
    static String[] phones = new String[100];
    static int[][] marks = new int[100][5];
    static String[] subjects = {"Maths", "Science", "English", "History", "Computer"};

    static void addStudent(Scanner sc) {
        System.out.print("Roll No: "); rollNos[studentCount] = sc.nextInt(); sc.nextLine();
        System.out.print("Name: "); names[studentCount] = sc.nextLine();
        System.out.print("Email: "); emails[studentCount] = sc.nextLine();
        System.out.print("Phone: "); phones[studentCount] = sc.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.print(subjects[i] + " marks: ");
            marks[studentCount][i] = sc.nextInt();
        }
        studentCount++;
        System.out.println("Student added successfully.");
    }

    static int getTotal(int idx) {
        int t = 0;
        for (int i = 0; i < 5; i++) t += marks[idx][i];
        return t;
    }

    static String getGrade(double pct) {
        if (pct >= 90) return "A+";
        if (pct >= 80) return "A";
        if (pct >= 70) return "B";
        if (pct >= 60) return "C";
        if (pct >= 50) return "D";
        return "F";
    }

    static void printMarksheet(int idx) {
        int total = getTotal(idx);
        double pct = total / 5.0;
        System.out.println("\n======= STUDENT MARKSHEET =======");
        System.out.println("Roll No : " + rollNos[idx]);
        System.out.println("Name    : " + names[idx]);
        System.out.println("Email   : " + emails[idx]);
        System.out.println("Phone   : " + phones[idx]);
        System.out.println("---------------------------------");
        for (int i = 0; i < 5; i++)
            System.out.printf("%-15s: %d%n", subjects[i], marks[idx][i]);
        System.out.println("---------------------------------");
        System.out.println("Total      : " + total + "/500");
        System.out.printf("Percentage : %.2f%%%n", pct);
        System.out.println("Grade      : " + getGrade(pct));
        System.out.println("Result     : " + (pct >= 40 ? "PASS" : "FAIL"));
        System.out.println("=================================");
    }

    static void displayAll() {
        if (studentCount == 0) { System.out.println("No students."); return; }
        for (int i = 0; i < studentCount; i++) printMarksheet(i);
    }

    static void searchByRoll(Scanner sc) {
        System.out.print("Enter Roll No: "); int roll = sc.nextInt();
        for (int i = 0; i < studentCount; i++) if (rollNos[i] == roll) { printMarksheet(i); return; }
        System.out.println("Student not found.");
    }

    static void classStatistics() {
        if (studentCount == 0) { System.out.println("No data."); return; }
        int highestTotal = 0, lowestTotal = Integer.MAX_VALUE;
        int topIdx = 0, bottomIdx = 0;
        int passCount = 0, failCount = 0;
        double totalPct = 0;

        for (int i = 0; i < studentCount; i++) {
            int total = getTotal(i);
            double pct = total / 5.0;
            totalPct += pct;
            if (total > highestTotal) { highestTotal = total; topIdx = i; }
            if (total < lowestTotal) { lowestTotal = total; bottomIdx = i; }
            if (pct >= 40) passCount++; else failCount++;
        }
        System.out.println("\n===== CLASS STATISTICS =====");
        System.out.println("Total Students : " + studentCount);
        System.out.printf("Class Average  : %.2f%%%n", totalPct / studentCount);
        System.out.println("Pass Count     : " + passCount);
        System.out.println("Fail Count     : " + failCount);
        System.out.println("Top Performer  : " + names[topIdx] + " (" + getTotal(topIdx) + "/500)");
        System.out.println("Needs Support  : " + names[bottomIdx] + " (" + getTotal(bottomIdx) + "/500)");
        System.out.println("============================");
    }

    static void sortByPercentage() {
        for (int i = 0; i < studentCount - 1; i++) {
            for (int j = 0; j < studentCount - 1 - i; j++) {
                if (getTotal(j) < getTotal(j + 1)) {
                    int tmpRoll = rollNos[j]; rollNos[j] = rollNos[j+1]; rollNos[j+1] = tmpRoll;
                    String tmpName = names[j]; names[j] = names[j+1]; names[j+1] = tmpName;
                    String tmpEmail = emails[j]; emails[j] = emails[j+1]; emails[j+1] = tmpEmail;
                    String tmpPhone = phones[j]; phones[j] = phones[j+1]; phones[j+1] = tmpPhone;
                    int[] tmpMarks = marks[j]; marks[j] = marks[j+1]; marks[j+1] = tmpMarks;
                }
            }
        }
        System.out.println("Students sorted by percentage (highest first).");
        System.out.printf("%-5s %-20s %-8s %-10s%n", "Rank", "Name", "Total", "Percentage");
        for (int i = 0; i < studentCount; i++) {
            double pct = getTotal(i) / 5.0;
            System.out.printf("%-5d %-20s %-8d %-10.2f%n", i + 1, names[i], getTotal(i), pct);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n====== STUDENT MANAGEMENT SYSTEM ======");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Marksheets");
            System.out.println("3. Search by Roll No");
            System.out.println("4. Class Statistics");
            System.out.println("5. Rank List (Sort by %)");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: addStudent(sc); break;
                case 2: displayAll(); break;
                case 3: searchByRoll(sc); break;
                case 4: classStatistics(); break;
                case 5: sortByPercentage(); break;
                case 6: System.out.println("Thank you! Exiting system."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 6);
        sc.close();
    }
}
