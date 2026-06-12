import java.util.Scanner;

public class RecursiveSum {
    private static int Sum(int n){
       if(n==0){
        return 0;
        }
        return n%10+Sum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int n = sc.nextInt();
        System.out.println("The Sum of Digits of "+n+" Is "+Sum(n));
        sc.close();
    }
}
