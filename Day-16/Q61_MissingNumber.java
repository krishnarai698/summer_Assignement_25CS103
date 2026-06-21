import java.util.Scanner;

public class Q61_MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " elements (1 to " + n + " with one missing):");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int x : arr) actualSum += x;
        System.out.println("Missing number: " + (expectedSum - actualSum));
        sc.close();
    }
}
