
import java.util.*;
 class Print_prime {
    public static void main(String[] args) {
        Scanner sh= new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sh.nextInt();

        System.out.print("Enter ending number: ");
        int end = sh.nextInt();

        System.out.println("Prime numbers are:");
for (int num = start; num <= end; num++) {
            if (num <= 1) {
                continue;
            }

            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++)
                 {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)  {
                System.out.print(num + " ");
            }
        }
    }
}