import java.util.Scanner;

public class Multipilication_table
{
    public static void main(String args[])
    {
        int i,n;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}