import java.util.Scanner;

public class Q93_StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        boolean isRotation = false;
        if (s1.length() == s2.length()) {
            String doubled = s1 + s1;
            if (doubled.contains(s2)) isRotation = true;
        }
        System.out.println(isRotation ? s2 + " is a rotation of " + s1 : s2 + " is not a rotation of " + s1);
        sc.close();
    }
}
