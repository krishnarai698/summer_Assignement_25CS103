import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
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
            System.out.println(n+" Is an Armstrong Number");
        } else {
            System.out.println(n+" Is not an Armstrong Number");
        }
    }
}
