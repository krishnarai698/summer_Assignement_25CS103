import java.util.*;

public class InputArray {
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
        System.out.println("The Numbers In the Array are ");
        for(i=0;i<a.length;i++){
        System.out.print(" "+a[i]);
        sc.close();
        }
    }    
}
