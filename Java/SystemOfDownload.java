import java.util.Scanner;

/**
 * SystemOfDownload
 */
public class SystemOfDownload {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int c = raf.nextInt();
        int x[] = new int[c];
        int y[] = new int[c];

        for(int i = 0; i < c; i ++){
            x[i] = raf.nextInt();
            y[i] = raf.nextInt();
        }
        
        for (int i = 0; i < c; i++) {
            if((x[i] + y [i]) == 0){
                System.out.println("PROXYCITY");
            }
            else if((x[i] + y [i]) == 1){
                System.out.println("P.Y.N.G.");
            }
            else if ((x[i] + y[i]) == 2) {
                System.out.println("DNSUEY!");
            }
            else if ((x[i] + y[i]) == 3) {
                System.out.println("SERVERS");
            }
            else if ((x[i] + y[i]) == 4) {
                System.out.println("HOST!");
            }
            else if ((x[i] + y[i]) == 5) {
                System.out.println("CRIPTONIZE");
            }
            else if ((x[i] + y[i]) == 6) {
                System.out.println("OFFLINE DAY");
            }
            else if ((x[i] + y[i]) == 7) {
                System.out.println("SALT");
            }
            else if ((x[i] + y[i]) == 8) {
                System.out.println("ANSWER!");
            }
            else if ((x[i] + y[i]) == 9) {
                System.out.println("RAR?");
            }
            else if ((x[i] + y[i]) == 10) {
                System.out.println("WIFI ANTENNAS");
            }
            
        }
    }
}