import java.util.Scanner;

/**
 * Twitting
 */
public class Twitting {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        String T = raf.nextLine();
        int panjangT = T.length();
        if(panjangT > 140){
            System.out.println("MUTE");
        }
        else if(panjangT <= 140){
            System.out.println("TWEET");
        }
    }
}