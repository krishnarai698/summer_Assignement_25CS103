import java.util.Scanner;

public class Q94_CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        StringBuilder compressed = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char cur = s.charAt(i);
            int count = 0;
            while (i < s.length() && s.charAt(i) == cur) { count++; i++; }
            compressed.append(cur);
            if (count > 1) compressed.append(count);
        }
        String result = compressed.toString();
        System.out.println("Compressed string: " + (result.length() < s.length() ? result : s));
        sc.close();
    }
}
