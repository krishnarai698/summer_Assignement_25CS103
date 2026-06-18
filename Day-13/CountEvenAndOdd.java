import java.util.*;
public class CountEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        int even = 0;
        int odd = 0;
        System.out.println("Enter Your Numbers: ");
        for(i=0;i<a.length;i++){
            a[i] = sc.nextInt();
            if (i%2==0) {
                even++;
            }
            else
                odd++;
        }
        System.out.println("Number of odd elements: "+odd);
        System.out.println("Number of even elements: "+even);
    }
}
