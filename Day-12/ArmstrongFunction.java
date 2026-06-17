import java.util.*;
public class ArmstrongFunction {
    public static boolean isArmstrong(int n){
        int t=n;
        int digits=0;
        int sum=0;
        while(t>0){
            t=t/10;
            digits++;
        }
        t=n;
        while (t>0) { 
            int last_digit=t%10;
            sum = (int) (sum+ Math.pow(last_digit, digits));
            t=t/10;
        }
        if (sum==n) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int n = sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println("The Number is Armstrong");
        }
        else
            System.out.println("The Number is not Armstrong");
        sc.close();
    }
}
