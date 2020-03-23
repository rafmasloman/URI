import java.util.Scanner;

/**
 * Sphere
 */
public class Sphere {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        double r = raf.nextDouble();
        System.out.printf("VOLUME = %.3f\n",(4 * 3.14159 * Math.pow(r,3)) / 3);
    }
}