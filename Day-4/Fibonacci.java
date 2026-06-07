import java.util.*;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Terms: ");
        int n=sc.nextInt();
        int first_term=0;
        int second_term=1;
        for (int i = 0; i < n; i++) {
            System.out.print(first_term+" ");
            int next_term=first_term+second_term;
            first_term=second_term;
            second_term=next_term;
        }
        sc.close();
    }
}