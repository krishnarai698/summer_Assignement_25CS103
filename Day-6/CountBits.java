import java.util.*;

public class CountBits {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number: ");

            int n = sc.nextInt();
            int rem = 0;
            int count = 0;

            while(n!=0){
                rem = n%2;
                n/=2;
                if (rem==1) {
                    count++;
                }
        }
        System.out.println("The Number of Set bits is : "+count);
        sc.close();
    }
}
