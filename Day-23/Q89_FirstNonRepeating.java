import java.util.Scanner;

public class Q89_FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        char result = 0;
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            boolean repeats = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) { repeats = true; break; }
            }
            if (!repeats) { result = s.charAt(i); found = true; break; }
        }
        if (found) System.out.println("First non-repeating character: " + result);
        else System.out.println("No non-repeating character found");
        sc.close();
    }
}
