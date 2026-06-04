import java.util.*;
class count
{
    public static void main(String args[])
    {

        System.out.println("Enter The Number");
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int i=n;
        int coun=0;
        while (i!=0) {
            i=i/10;
            coun++;
        }
        System.out.println("Number Of Digits In "+n+" Is "+ coun);
    }
}