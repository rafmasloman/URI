import java.util.Scanner;

/**
 * MultiplicationTable
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int n = raf.nextInt();
        if(n > 1 && n < 1000){
            for(int i = 1; i <= 10; i++){
                System.out.println(i + " x " + n + " = " + (i * n));
            }
        }
    }
}