import java.util.Scanner;

public class Q66_UnionOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

        int[] union = new int[n1 + n2];
        int k = 0;
        for (int i = 0; i < n1; i++) union[k++] = arr1[i];
        for (int i = 0; i < n2; i++) {
            boolean found = false;
            for (int j = 0; j < n1; j++) {
                if (arr2[i] == arr1[j]) { found = true; break; }
            }
            if (!found) union[k++] = arr2[i];
        }
        System.out.print("Union: ");
        for (int i = 0; i < k; i++) System.out.print(union[i] + " ");
        System.out.println();
        sc.close();
    }
}
