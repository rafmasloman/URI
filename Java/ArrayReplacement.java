import java.util.Scanner;

/**
 * ArrayReplacement
 */
public class ArrayReplacement {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int number = 10;
        int x[] = new int[number];
        for(int i = 0; i < number; i++){
            x[i] = raf.nextInt();
        }
        for (int i = 0; i < number; i++) {
            if(x[i] <= 0){
            System.out.println("X[" + i + "] = " + 1);
            }
            if(x[i] > 0){
                System.out.println("X[" + i + "] = " + x[i]);
            }
        }
    }
}