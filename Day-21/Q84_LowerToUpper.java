import java.util.Scanner;

public class Q84_LowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char)(chars[i] - 32);
            }
        }
        System.out.println("Uppercase: " + new String(chars));
        sc.close();
    }
}
