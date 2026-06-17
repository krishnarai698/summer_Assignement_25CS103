import java.util.*;
public class PerfectFunction {
    public static boolean isPerfect(int n){
        if (n <= 1)
            return false;
        int sum = 0;
        for(int i=1;i<=n/2;i++){
            if (n%i==0) {
                sum = sum+i;
            }
        }
        if (n==sum) {
                return true;
            }
            else
                return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number: ");
        int n = sc.nextInt();
        if (isPerfect(n)) {
            System.out.println("The Number is Perfect");
        }
        else
            System.out.println("The Number is Not Perfect");
        sc.close();
    }
}
