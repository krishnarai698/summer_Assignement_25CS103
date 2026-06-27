import java.util.Scanner;

public class Q85_PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (chars[left] != chars[right]) { isPalindrome = false; break; }
            left++;
            right--;
        }
        System.out.println(s + (isPalindrome ? " is a palindrome" : " is not a palindrome"));
        sc.close();
    }
}
