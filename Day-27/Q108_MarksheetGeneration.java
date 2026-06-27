import java.util.Scanner;

public class Q108_MarksheetGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        String[] subjects = {"Maths", "Science", "English", "History", "Computer"};
        int[] marks = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for " + subjects[i] + " (out of 100): ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double percentage = total / 5.0;
        String grade;
        if (percentage >= 90) grade = "A+";
        else if (percentage >= 80) grade = "A";
        else if (percentage >= 70) grade = "B";
        else if (percentage >= 60) grade = "C";
        else if (percentage >= 50) grade = "D";
        else grade = "F";

        String result = percentage >= 40 ? "PASS" : "FAIL";

        System.out.println("\n========== MARKSHEET ==========");
        System.out.println("Name: " + name + "   Roll No: " + roll);
        System.out.println("--------------------------------");
        for (int i = 0; i < 5; i++)
            System.out.printf("%-15s: %d%n", subjects[i], marks[i]);
        System.out.println("--------------------------------");
        System.out.println("Total      : " + total + "/500");
        System.out.printf("Percentage : %.2f%%%n", percentage);
        System.out.println("Grade      : " + grade);
        System.out.println("Result     : " + result);
        System.out.println("================================");
        sc.close();
    }
}
