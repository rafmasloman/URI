import java.util.Scanner;

/**
 * SumOddNumbers2
 */
public class SumOddNumbers2 {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int n = raf.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        int temp = 0;
        for(int i = 0; i < n; i++){
            x[i] = raf.nextInt();
            y[i] = raf.nextInt();
            if(y[i] > x[i]){
            for(int j = y[i]; j < x[i]; j++){
                temp++;
            }
            System.out.println(temp);
            }
            if (x[i] > y[i]) {
            for (int j = x[i]; j < y[i]; j++) {
                temp++;
            }
            System.out.println(temp);
            }
        }
    }
}