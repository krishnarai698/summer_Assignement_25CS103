import java.util.Scanner;

public class Q78_SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter matrix:");
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) mat[i][j] = sc.nextInt();

        boolean symmetric = true;
        outer:
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (mat[i][j] != mat[j][i]) { symmetric = false; break outer; }

        System.out.println(symmetric ? "Matrix is symmetric" : "Matrix is not symmetric");
        sc.close();
    }
}
