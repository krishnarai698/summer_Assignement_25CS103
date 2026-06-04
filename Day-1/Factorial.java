import java.util.Scanner;

public class Factorial {
    public static void main(String args[])
    {
        int i,n,fact=1;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of "+n+" is: "+fact);
    }
    
}
