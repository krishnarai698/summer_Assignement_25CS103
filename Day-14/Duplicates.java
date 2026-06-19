import java.util.*;
public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i, j;
        int flag = 0;
        System.out.println("Enter Your Numbers: ");
        for(i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                if (a[i]==a[j]) {
                    System.out.println("Duplicate element found at: "+a[i]);
                    flag++;
                }
            }
        }
        if (flag==0) {
            System.out.println("Duplicate element not found");
        }
        sc.close();
    }
}
