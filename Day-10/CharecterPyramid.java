public class CharecterPyramid {
    public static void main(String[] args) {
        int rows = 5;

        
        for (int i = 1; i <= rows; i++) {
            
            
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            
            ch -= 2;

            
            for (int j = 1; j < i; j++) {
                System.out.print(ch);
                ch--;
            }

            
            System.out.println();
        }        
    }
}
