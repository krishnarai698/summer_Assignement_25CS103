import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Factors of " + num + " are: ");
        
        // Loop from 1 up to the target number
        for (int i = 1; i <= num; i++) {
            // Check if i divides num perfectly
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
