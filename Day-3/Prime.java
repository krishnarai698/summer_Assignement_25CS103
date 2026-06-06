import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n=sc.nextInt();
        int f=0;         
        for (int i = 2; i <= n/2; i++) {
            if (n%i==0) {
                f=1;
                break;
            }
        }
        if (f==1) {
            System.out.println(n+" Is Not a Prime Number");
        } else {
            System.out.println(n+" Is a Prime Number");
        }
    }
}
