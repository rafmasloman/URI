import java.util.Scanner;

/**
 * AscendingAndDescending
 */
public class AscendingAndDescending {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int X = raf.nextInt();
        int Y = raf.nextInt();

        while(X != Y){
            if (X > Y){
                System.out.println("Decrescente");
            }
            else if(X < Y){
                System.out.println("Crescente");
            }
            X = raf.nextInt();
            Y = raf.nextInt();
        }
            
            
    }
}