import java.util.*;
public class LargestAndSmallestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        System.out.println("Enter Your Numbers: ");
        for(i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for(i=1;i<a.length;i++){
            if (a[i]>max) {
                max = a[i];
            }
            else if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Smallest Number: " + min);
        System.out.println("Greatest Number: " + max);
        sc.close();
    }
}
