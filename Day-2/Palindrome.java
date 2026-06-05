import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n=sc.nextInt();
        int rev=0;
        int rem;
        int t=n;
        while (n!=0) { 
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if (t==rev) {
            System.out.println("Number is Palindrome");
            
        } else {
            System.out.println("Number Is Not Palindrome");
        }
    }
}
