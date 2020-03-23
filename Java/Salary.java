import java.util.Scanner;

/**
 * Salary
 */
public class Salary {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int number = raf.nextInt();
        int number2 = raf.nextInt();
        double number3 = raf.nextDouble();

            double salary = (double) number2 * number3;
            System.out.printf("NUMBER = %d\n",number);
            System.out.printf("SALARY = U$ %.2f\n",salary);
        
    }
}