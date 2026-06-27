import java.util.Scanner;

public class Q86_CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim();
        if (s.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            int count = 1;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') count++;
            }
            System.out.println("Word count: " + count);
        }
        sc.close();
    }
}
