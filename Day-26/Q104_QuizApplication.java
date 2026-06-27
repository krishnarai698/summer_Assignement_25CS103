import java.util.Scanner;

public class Q104_QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] questions = {
            "What is the capital of India?",
            "Which planet is closest to the Sun?",
            "What is 12 * 12?",
            "Which language is used for Android development?",
            "Who invented the telephone?"
        };
        String[][] options = {
            {"A. Mumbai", "B. New Delhi", "C. Kolkata", "D. Chennai"},
            {"A. Venus", "B. Earth", "C. Mercury", "D. Mars"},
            {"A. 124", "B. 144", "C. 132", "D. 156"},
            {"A. Python", "B. Swift", "C. Java", "D. C++"},
            {"A. Edison", "B. Bell", "C. Tesla", "D. Marconi"}
        };
        char[] answers = {'B', 'C', 'B', 'C', 'B'};
        int score = 0;

        System.out.println("Welcome to the Quiz!");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQ" + (i + 1) + ": " + questions[i]);
            for (String opt : options[i]) System.out.println(opt);
            System.out.print("Your answer (A/B/C/D): ");
            char ans = sc.next().toUpperCase().charAt(0);
            if (ans == answers[i]) { System.out.println("Correct!"); score++; }
            else System.out.println("Wrong! Correct answer: " + answers[i]);
        }
        System.out.println("\nYour score: " + score + "/" + questions.length);
        sc.close();
    }
}
