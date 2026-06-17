import java.util.*;
public class MaximumFunction {
    public static int Max(int a, int b){
        if (a>b) {
            return a;
        }
        else
            return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        int n = sc.nextInt();
        System.out.println("Enter The Second Number: ");
        int m = sc.nextInt();
        System.out.println("The Maximum Number Is: "+Max(n, m));
        sc.close();
    }
}
