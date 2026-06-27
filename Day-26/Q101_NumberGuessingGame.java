import java.util.Scanner;

public class Q101_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = (int)(Math.random() * 100) + 1;
        int attempts = 0;
        System.out.println("Guess the number between 1 and 100!");
        while (true) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;
            if (guess < secret) System.out.println("Too low!");
            else if (guess > secret) System.out.println("Too high!");
            else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                break;
            }
        }
        sc.close();
    }
}
