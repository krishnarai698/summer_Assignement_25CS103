import java.util.Scanner;

public class Q76_DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        System.out.println("Enter matrix:");
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) mat[i][j] = sc.nextInt();

        int primary = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            primary += mat[i][i];
            secondary += mat[i][n - 1 - i];
        }
        System.out.println("Primary diagonal sum: " + primary);
        System.out.println("Secondary diagonal sum: " + secondary);
        sc.close();
    }
}
