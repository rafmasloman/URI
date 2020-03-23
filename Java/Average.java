import java.util.Scanner;

/**
 * Average
 */
public class Average {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        float a = raf.nextDouble();
        float b = raf.nextDouble();
        float c = raf.nextDouble();
        float average = (a + b + c) * 1 / 3;
        System.out.print("MEDIA = " + average);
    }
}