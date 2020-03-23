import java.util.Scanner;

/**
 * ArrayFill3
 */
public class ArrayFill3 {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);

        int n[] = new int[100];
        float x = raf.nextFloat();
        double bulat = Math.floor(x);
        for(int i = 1; i <= n.length; i++){
            System.out.printf("N[%d] = %.4f \n",i-1,bulat);
            bulat /= 2;
            
        }
    }
}