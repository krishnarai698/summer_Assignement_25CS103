import java.util.*;
 class Lcm
  {
    public static void main(String[] args)
     {
        Scanner sh= new Scanner(System.in);
System.out.print("Enter first number: ");
        int a = sh.nextInt();
        System.out.print("Enter second number: ");
        int b = sh.nextInt();
        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;
        int lcm = (a * b) / gcd;

        System.out.println("LCM = " + lcm);
    }
}