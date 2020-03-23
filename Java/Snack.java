import java.util.Scanner;

/**
 * Snack
 */
public class Snack {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int x = raf.nextInt();
        int y = raf.nextInt();
        float[] price = {4.00f,4.50f,5.00f,2.00f,1.50f};
        for(int i = 1; i <= price.length; i++){
            if(i == x){
                System.out.printf("Total: R$ %.2f\n",(y * price[i-1]));
            }
        }
        
    }
}