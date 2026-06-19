import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        int flag = 0;
        System.out.println("Enter Your Numbers: ");
        for(i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter The element You want to search: ");
        int SearchElement=sc.nextInt();
        for(i=0;i<a.length;i++){
            if (a[i]==SearchElement) {
                flag++;
                break;
            }
        }
        if (flag>0) {
            System.out.println("The Element is Found at index: "+i);
        }
        else
            System.out.println("Element Not Found");
        sc.close();
    }
}
