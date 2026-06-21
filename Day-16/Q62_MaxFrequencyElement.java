import java.util.Scanner;

public class Q62_MaxFrequencyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int maxFreq = 0, maxElem = arr[0];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) count++;
            }
            if (count > maxFreq) {
                maxFreq = count;
                maxElem = arr[i];
            }
        }
        System.out.println("Maximum frequency element: " + maxElem + " (appears " + maxFreq + " times)");
        sc.close();
    }
}
