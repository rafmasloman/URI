import java.util.Scanner;

/**
 * IamToorg
 */
public class IamToorg {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int N = raf.nextInt();
        String tes[] = new String[N];

        for (int i = 0; i < tes.length; i++) {
            tes[i] = raf.nextLine() + raf.next();
        }
        for (int i = 0; i < tes.length; i++) {
            System.out.println("I am Toorg!");
        }
    }
}