import java.util.Scanner;

public class Q102_VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Are you a citizen? (yes/no): ");
        String citizen = sc.next();

        if (age >= 18 && citizen.equalsIgnoreCase("yes")) {
            System.out.println(name + ", you are eligible to vote.");
        } else if (age < 18) {
            System.out.println(name + ", you are not eligible. Minimum age is 18.");
        } else {
            System.out.println(name + ", only citizens are eligible to vote.");
        }
        sc.close();
    }
}
