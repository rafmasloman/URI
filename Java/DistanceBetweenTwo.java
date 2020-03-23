import java.util.Scanner;

/**
 * DistanceBetweenTwo
 */
public class DistanceBetweenTwo {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        double x1 = raf.nextDouble();
        double y1 = raf.nextDouble();

        double x2 = raf.nextDouble();
        double y2 = raf.nextDouble();

        System.out.printf("%.4f\n",Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
    }
}