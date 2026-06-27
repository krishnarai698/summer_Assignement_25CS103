import java.util.Scanner;

public class Q97_MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first sorted array: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n1; i++) a[i] = sc.nextInt();

        System.out.print("Enter size of second sorted array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n2; i++) b[i] = sc.nextInt();

        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) merged[k++] = a[i++];
            else merged[k++] = b[j++];
        }
        while (i < n1) merged[k++] = a[i++];
        while (j < n2) merged[k++] = b[j++];

        System.out.print("Merged sorted array: ");
        for (int x : merged) System.out.print(x + " ");
        System.out.println();
        sc.close();
    }
}
