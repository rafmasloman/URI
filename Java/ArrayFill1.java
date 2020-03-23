import java.util.Scanner;

/**
 * ArrayFill1
 */
public class ArrayFill1 {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int n = raf.nextInt();
        int number[] = new int[10];
        for(int i = 0; i < number.length; i++){
            System.out.println("N" + "[" + i + "] = " + n);
            n += n;
        }
    }
}