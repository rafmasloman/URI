import java.util.Scanner;
public class FuelSpent{
    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int spentTime = raf.nextInt();
        int average = raf.nextInt();
        System.out.printf("%.3f\n",((double) average * (double) spentTime) / 12);

    }
}