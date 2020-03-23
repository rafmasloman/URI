import java.util.Scanner;

/**
 * AreaOfCircle
 */
public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        double n = 3.14159;
        double r = raf.nextDouble();
        double a = n * Math.pow(r,2);
        System.out.printf("A=%.4f\n",a);

    }
}