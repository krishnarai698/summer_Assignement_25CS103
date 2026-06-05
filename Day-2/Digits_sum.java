import java.util.*;
public class Digits_sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your number: ");
        int n=sc.nextInt();
        int sum=0;
        int t=n;
        while (n>0) {
            sum+=n%10;
            n/=10; 
        }
        System.out.println("The Sum of Digits of "+t+" Is "+sum);
    }
}


