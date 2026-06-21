import java.util.Scanner;

public class Q64_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] result = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            boolean isDup = false;
            for (int j = 0; j < k; j++) {
                if (result[j] == arr[i]) { isDup = true; break; }
            }
            if (!isDup) result[k++] = arr[i];
        }
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) System.out.print(result[i] + " ");
        System.out.println();
        sc.close();
    }
}
