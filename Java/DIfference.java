import java.util.Scanner;

/**
 * DIfference
 */
public class DIfference {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int a = raf.nextInt();
        int b = raf.nextInt();
        int c = raf.nextInt();
        int d = raf.nextInt();

        System.out.println("DIFERENCA = " + ((a * b) - (c * d)));

    }
}