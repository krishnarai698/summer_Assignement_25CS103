import java.util.Scanner;

public class Q98_CommonCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        System.out.print("Common characters: ");
        boolean[] printed = new boolean[256];
        for (char c : s1.toCharArray()) {
            if (!printed[c] && s2.indexOf(c) != -1) {
                System.out.print(c + " ");
                printed[c] = true;
            }
        }
        System.out.println();
        sc.close();
    }
}
