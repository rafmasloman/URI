import java.util.Scanner;

/**
 * Consumption
 */
public class Consumption {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int x = raf.nextInt();
        double y = raf.nextDouble();
        System.out.printf("%.3f km/l\n",x / y);
    }
}