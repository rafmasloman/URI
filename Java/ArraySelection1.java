import java.util.Scanner;

/**
 * ArraySelection1
 */
public class ArraySelection1 {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int arr[] = new int[100];
        for(int i = 0; i < arr.length; i++){
            double x = raf.nextDouble();
            if(x <= 10){
            System.out.println("A" + "[" + i + "]" + " = " + x);
            }    
        }
    }
}