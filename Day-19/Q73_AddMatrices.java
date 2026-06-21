import java.util.Scanner;

public class Q73_AddMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] a = new int[r][c], b = new int[r][c], sum = new int[r][c];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) a[i][j] = sc.nextInt();
        System.out.println("Enter second matrix:");
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) b[i][j] = sc.nextInt();

        System.out.println("Sum matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
