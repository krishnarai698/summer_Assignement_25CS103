import java.util.*;
public class Digits_product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int n=sc.nextInt();
        int p=1;
        int t=n;
        while (n!=0) { 
            p*=n%10;
            n/=10;
        }
        System.out.println("The Product of Digits Of "+t+" Is "+p);
    }
}
