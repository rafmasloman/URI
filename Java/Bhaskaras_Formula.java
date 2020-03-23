import java.util.Scanner;

/**
 * Bhaskara's_Formula
 */
public class Bhaskaras_Formula {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        double a = raf.nextDouble();
        double b = raf.nextDouble();
        double c = raf.nextDouble();
        System.out.printf("R1 = %.5f\n",(-b + ((Math.sqrt(Math.pow(b, 2)-4*a*c))))/ 2*a);
    }
}