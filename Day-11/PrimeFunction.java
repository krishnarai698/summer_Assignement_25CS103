import java.util.*;
public class PrimeFunction {
    public static boolean prime(int n){
        if (n <= 1) return false;
        
        for(int i=2;i<n;i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int n = sc.nextInt();
        if (prime(n)) {
            System.out.println("The Number is Prime");
        }
        else
            System.out.println("The Number IS Not Prime");
        sc.close();
    }
}
