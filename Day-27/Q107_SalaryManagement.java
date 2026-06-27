import java.util.Scanner;

public class Q107_SalaryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt(); sc.nextLine();
        String[] names = new String[n];
        double[] basic = new double[n];
        double[] hra = new double[n];
        double[] da = new double[n];
        double[] gross = new double[n];
        double[] tax = new double[n];
        double[] net = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter basic salary: ");
            basic[i] = sc.nextDouble(); sc.nextLine();
            hra[i] = 0.20 * basic[i];
            da[i] = 0.50 * basic[i];
            gross[i] = basic[i] + hra[i] + da[i];
            tax[i] = gross[i] > 50000 ? 0.10 * gross[i] : 0;
            net[i] = gross[i] - tax[i];
        }

        System.out.printf("%n%-15s %-10s %-8s %-8s %-10s %-8s %-10s%n",
                "Name", "Basic", "HRA", "DA", "Gross", "Tax", "Net");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-15s %-10.2f %-8.2f %-8.2f %-10.2f %-8.2f %-10.2f%n",
                    names[i], basic[i], hra[i], da[i], gross[i], tax[i], net[i]);
        }
        sc.close();
    }
}
