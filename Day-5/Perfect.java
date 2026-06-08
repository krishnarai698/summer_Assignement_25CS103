import java.util.*;
public class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        
        int n = sc.nextInt();
        int t = n;
        if (n==1) {
            System.out.println(n+" Is Not a Perfect Number");
        }
        int sum = 1;
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                sum+=i;
            }
        }
        if (sum==n) {
            System.out.println(t+" Is a Perfect number");
        } else {
            System.out.println(t+" Is Not a Perfect number");
        }
        sc.close();
    }
}
