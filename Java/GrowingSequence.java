import java.util.Scanner;

/**
 * GrowingSequence
 */
public class GrowingSequence {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int X = raf.nextInt();
        while(X != 0){
            for (int i = 1; i <= X; i++) {
                if(i == X){
                    System.out.print(i + " \n");
                }
                else{
                    System.out.print(i + " ");  
                }
            }
            X = raf.nextInt();
        }
    }
}