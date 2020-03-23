import java.util.Scanner;

/**
 * PositiveNumbers
 */
public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int count = 0;
        for(int i = 0; i < 6; i++){
            double number = raf.nextDouble();
            if(number > 0){
                count++;
            }
        }
        System.out.println(count + " valores positivos");
    }
}