import java.util.Scanner;

public class Q80_ColumnWiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter matrix:");
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) mat[i][j] = sc.nextInt();

        for (int j = 0; j < c; j++) {
            int sum = 0;
            for (int i = 0; i < r; i++) sum += mat[i][j];
            System.out.println("Sum of column " + (j + 1) + ": " + sum);
        }
        sc.close();
    }
}
