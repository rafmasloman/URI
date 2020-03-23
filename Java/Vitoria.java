import java.util.Scanner;

/**
 * Vitoria
 */
public class Vitoria {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int n = raf.nextInt();
        String S[] = new String[n];
        for(int i = 0; i < n; i++){
            S[i] = raf.nextLine() + raf.next();
        }
        System.out.println("Ciencia da Computacao");

    }
}