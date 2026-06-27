import java.util.Scanner;

public class Q92_MaxOccurringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int maxCount = 0;
        char maxChar = s.charAt(0);
        boolean[] visited = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) { count++; visited[j] = true; }
                }
                if (count > maxCount) { maxCount = count; maxChar = s.charAt(i); }
            }
        }
        System.out.println("Maximum occurring character: '" + maxChar + "' (" + maxCount + " times)");
        sc.close();
    }
}
