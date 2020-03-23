import java.util.Scanner;

/**
 * Remaining2
 */
public class Remaining2 {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int n = raf.nextInt();
        for(int i = 1; i <= 10000; i++){
            if(i % n == 2){
                System.out.println(i);
            }
        }
    }
}
