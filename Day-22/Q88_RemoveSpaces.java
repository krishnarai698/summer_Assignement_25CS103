import java.util.Scanner;

public class Q88_RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ') sb.append(c);
        }
        System.out.println("String without spaces: " + sb.toString());
        sc.close();
    }
}
