import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary Number: ");
        int n = sc.nextInt();
        int i = 0;
        int d = 0;
        while (n>0) {
            int r = n%10;
            n/=10;
            d = d+r*(int) Math.pow(2, i++);
        }
        System.out.println("The Number in Decimal Is: "+d);
        sc.close();
    }
}
