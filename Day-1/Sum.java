import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,sum=0;
        System.out.println("Enter the number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of first "+n+" natural numbers is: "+sum);
    }
}