import java.util.Scanner;

/**
 * Divisors1
 */
public class Divisors1 {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int n = raf.nextInt();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}