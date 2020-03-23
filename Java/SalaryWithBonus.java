import java.util.Scanner;

/**
 * SalaryWithBonus
 */
public class SalaryWithBonus {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        String name = raf.next();
        double salaryOne = raf.nextDouble();
        double salaryTwo = raf.nextDouble();
        double receives = (salaryTwo * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n",salaryOne + receives);
    }
}