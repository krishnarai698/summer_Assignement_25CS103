import java.util.Scanner;

public class Q115_MenuDrivenStringOps {
    static String str = "";

    static void inputString(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter string: ");
        str = sc.nextLine();
    }

    static void displayLength() {
        int len = 0;
        for (char c : str.toCharArray()) len++;
        System.out.println("Length: " + len);
    }

    static void reverseString() {
        char[] chars = str.toCharArray();
        int l = 0, r = chars.length - 1;
        while (l < r) { char t = chars[l]; chars[l] = chars[r]; chars[r] = t; l++; r--; }
        System.out.println("Reversed: " + new String(chars));
    }

    static void checkPalindrome() {
        char[] chars = str.toCharArray();
        int l = 0, r = chars.length - 1;
        boolean pal = true;
        while (l < r) { if (chars[l] != chars[r]) { pal = false; break; } l++; r--; }
        System.out.println(pal ? "Palindrome" : "Not a palindrome");
    }

    static void countVowels() {
        int v = 0;
        for (char c : str.toLowerCase().toCharArray())
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') v++;
        System.out.println("Vowels: " + v);
    }

    static void toUpperCase() {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) if (ch[i] >= 'a' && ch[i] <= 'z') ch[i] -= 32;
        System.out.println("Uppercase: " + new String(ch));
    }

    static void removeSpaces() {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) if (c != ' ') sb.append(c);
        System.out.println("Without spaces: " + sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Input String\n2. Length\n3. Reverse\n4. Palindrome Check\n5. Count Vowels\n6. Uppercase\n7. Remove Spaces\n8. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: inputString(sc); break;
                case 2: displayLength(); break;
                case 3: reverseString(); break;
                case 4: checkPalindrome(); break;
                case 5: countVowels(); break;
                case 6: toUpperCase(); break;
                case 7: removeSpaces(); break;
                case 8: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 8);
        sc.close();
    }
}
