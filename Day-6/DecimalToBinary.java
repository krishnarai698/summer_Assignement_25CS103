import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal number: ");

        int n = sc.nextInt();
        int rem = 0;
        String binary="";

        while(n!=0){
            rem = n%2;
            n/=2;
            binary = rem+binary;
        }
        System.out.println("The Number in binary Is: "+binary);
        sc.close();
    }
}
