import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        int largest = 0;
        int Second_largest = 0;
        System.out.println("Enter Your Numbers: ");
        for(i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        for(i=0;i<a.length;i++){
            if (a[i]>largest) {
                largest=a[i];
            }
        }
        for(i=0;i<a.length;i++){
            if (a[i]>Second_largest&&a[i]!=largest) {
                Second_largest=a[i];
            }
        }
        System.out.println("The Second Largest Element is: "+Second_largest);
        sc.close();
    }
}
