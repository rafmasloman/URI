import java.util.Scanner;

/**
 * WeightedAverages
 */
public class WeightedAverages {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int n = raf.nextInt();
        double n2[] = new double[n * 3];
        int weight1  = 2;
        for(int i = 0; i < n2.length; i++){
            n2[i] = raf.nextDouble();
        }
        for (int i = 0; i < n2.length; i++) {
            weight1 += i;
            if(weight1 == 2){
                
            }
        }
    }
}