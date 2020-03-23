import java.util.Scanner;

/**
 * TheGreatest
 */
public class TheGreatest {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int a = raf.nextInt();
        int b = raf.nextInt();
        int c = raf.nextInt();

        System.out.printf("%d eh o maior\n", a > b && a > c ? a : b > a && b > c ? b : c);
    }
}