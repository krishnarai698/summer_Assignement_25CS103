import java.util.Scanner;

public class Q75_TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] mat = new int[r][c];

        System.out.println("Enter matrix:");
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) mat[i][j] = sc.nextInt();

        System.out.println("Transposed matrix:");
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) System.out.print(mat[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}
