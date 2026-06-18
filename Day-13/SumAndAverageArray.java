import java.util.*;
public class SumAndAverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        int sum = 0;
        double avg = 0;
        System.out.println("Enter Your Numbers: ");
        for(i=0;i<a.length;i++){
            a[i] = sc.nextInt();
            sum+=a[i];
            avg=sum/a.length;
        }
        System.out.println("The Sum is: "+sum);
        System.out.println("The Average is: "+avg);
        sc.close();
    }
}
