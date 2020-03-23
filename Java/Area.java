import java.util.Scanner;

/**
 * Area
 */
public class Area {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        double a = raf.nextDouble();
        double b = raf.nextDouble();
        double c = raf.nextDouble();

        System.out.printf("TRIANGULO: %.3f\n",(a * c)/2);
        System.out.printf("CIRCULO: %.3f\n",(3.14159 * Math.pow(c, 2)));
        System.out.printf("TRAPEZIO: %.3f\n",((a + b) * c)/2);
        System.out.printf("QUADRADO: %.3f\n",(Math.pow(b, 2)));
        System.out.printf("RETANGULO: %.3f\n",a * b);

    }
}