import java.util.Scanner;

/**
 * PositiveAndAverage
 */
public class PositiveAndAverage {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int count = 0;
        double temp = 0;
        double input; 
        for(int i = 0; i < 6; i++){
            input = raf.nextDouble();
            if(input >= 0){
                count++;
                temp += input;
            }
        }
        System.out.printf("%d valores positivos\n%.1f\n",count,(temp/count));
    }
}