import java.util.Scanner;

public class Q81_StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int len = 0;
        for (char c : s.toCharArray()) len++;
        System.out.println("Length of string: " + len);
        sc.close();
    }
}
