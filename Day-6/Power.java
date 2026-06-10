import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int r = 1;
        for(int i=1;i<=n;i++){
            r=r*x;
        } 
        System.out.println("The Answer Is: "+r);
    }
}
