import java.util.*;

public class PalindromeFunction {
    public static boolean isPalindrome(int n){
        int rev=0;
        int rem;
        int t=n;
        while (n!=0) { 
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if (t==rev) {
            return true;
            
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println("The Number is Palindrome");
        }
        else
            System.out.println("The Number is Not Palindrome");
        sc.close();
    }
}
