import java.util.Scanner;

/**
 * Average1
 */
public class Average1 {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        double number1 = raf.nextDouble() * 3.5;
        double number2 = raf.nextDouble() * 7.5;

        System.out.printf("MEDIA = %.5f\n",(number1 + number2) / 11);
    }
}