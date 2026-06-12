import java.util.*;
public class RecursiveFibonacci {
    int fib(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        RecursiveFibonacci obj = new RecursiveFibonacci();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit:");
        int x = sc.nextInt();
        System.out.println(obj.fib(x));
        sc.close();
    }
}