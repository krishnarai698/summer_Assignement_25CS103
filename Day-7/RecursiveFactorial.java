import java.util.*;

public class RecursiveFactorial {
    int fact(int n)
    {
        if (n==0)
            return 1;
        else
            return(n*fact(n-1));
    }
    public static void main(String[] args) {
        RecursiveFactorial obj = new RecursiveFactorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number :");
        int n = sc.nextInt();
        System.out.println("The factorial of "+n+" Is "+obj.fact(n));
        sc.close();
    }
}