import java.util.Scanner;

/**
 * Average2
 */
public class Average2 {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        double a = raf.nextDouble() * 2;
        double b = raf.nextDouble() * 3;
        double c = raf.nextDouble() * 5;

        System.out.printf("MEDIA = %.1f",(a + b + c) / 10);

    }
}