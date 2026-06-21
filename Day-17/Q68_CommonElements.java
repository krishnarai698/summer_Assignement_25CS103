import java.util.Scanner;

public class Q68_CommonElements {
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

        System.out.print("Enter size of third array: ");
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        System.out.println("Enter elements of third array:");
        for (int i = 0; i < n3; i++) arr3[i] = sc.nextInt();

        System.out.print("Common elements: ");
        for (int i = 0; i < n1; i++) {
            boolean inArr2 = false, inArr3 = false;
            for (int j = 0; j < n2; j++) if (arr1[i] == arr2[j]) { inArr2 = true; break; }
            for (int j = 0; j < n3; j++) if (arr1[i] == arr3[j]) { inArr3 = true; break; }
            if (inArr2 && inArr3) System.out.print(arr1[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
