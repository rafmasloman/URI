import java.util.Scanner;

/**
 * TimeConversion
 */
public class TimeConversion {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int n = raf.nextInt();
        int second = n % 60;
        int minute = n / 60;
        int hour = minute % 60;
        minute = minute/60;
        System.out.println(minute + ":" + hour + ":" + second);

    }
}