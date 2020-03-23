import java.util.Scanner;

/**
 * OurDaysAreNeverComingBack
 */
public class OurDaysAreNeverComingBack {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        String quote = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        int n = raf.nextInt();
        String temp = quote.substring(0, n);
        System.out.println(temp);
        
    }
}