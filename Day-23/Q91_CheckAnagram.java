import java.util.Scanner;

public class Q91_CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().toLowerCase();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("Not anagrams");
        } else {
            int[] freq = new int[26];
            for (char c : s1.toCharArray()) if (c >= 'a' && c <= 'z') freq[c - 'a']++;
            for (char c : s2.toCharArray()) if (c >= 'a' && c <= 'z') freq[c - 'a']--;
            boolean isAnagram = true;
            for (int f : freq) if (f != 0) { isAnagram = false; break; }
            System.out.println(isAnagram ? "Strings are anagrams" : "Strings are not anagrams");
        }
        sc.close();
    }
}
