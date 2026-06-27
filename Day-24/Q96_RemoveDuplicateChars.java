import java.util.Scanner;

public class Q96_RemoveDuplicateChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) { seen = true; break; }
            }
            if (!seen) result.append(s.charAt(i));
        }
        System.out.println("String after removing duplicates: " + result.toString());
        sc.close();
    }
}
