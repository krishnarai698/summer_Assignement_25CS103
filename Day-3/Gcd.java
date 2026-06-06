 import java.util.*;
 class Gcd
 {
    public static void main(String[] args)
     {
        Scanner sh= new Scanner(System.in);

 
        System.out.print("Enter first number: ");
        int a = sh.nextInt();

        System.out.print("Enter second number: ");
        int b = sh.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD = " + a);
    }
}