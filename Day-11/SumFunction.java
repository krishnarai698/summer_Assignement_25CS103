import java.util.*;

public class SumFunction {

    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        int n = sc.nextInt();
        System.out.println("Enter The Second Number: ");
        int m = sc.nextInt();
        System.out.println("The Sum is : "+add(n, m));
        sc.close();
    }
}
