import java.util.Scanner;
/**
 * EvenSquare
 */
public class EvenSquare {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int n = raf.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
            System.out.println(i + "^" + "2 = " + (int) Math.pow(i,2));
            }
        }
    }
}