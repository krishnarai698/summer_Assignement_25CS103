import java.util.Scanner;

public class Q90_FirstRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        char result = 0;
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) { result = s.charAt(i); found = true; break; }
            }
            if (found) break;
        }
        if (found) System.out.println("First repeating character: " + result);
        else System.out.println("No repeating character found");
        sc.close();
    }
}
