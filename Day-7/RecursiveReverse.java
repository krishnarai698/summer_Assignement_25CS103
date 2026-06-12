public class RecursiveReverse {
public static void rev(int number) {
}
    public static void main(String[] args) {
        int num = 123;
        while (num > 0) {
            int rev = num % 10;
            System.out.print(rev);
            num = num / 10;
        }
    }
}