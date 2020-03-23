import java.util.Scanner;

/**
 * Password
 */
public class Password {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int n = raf.nextInt();
        if (n >= 1001 && n <= 9999){
            while(n != n-1){
                if(n >= 1001 && n <= 9999){
                n-=1;
                System.out.println(n);
                n = raf.nextInt();
                }
                else if(n < 1001 || n > 9999){
                    System.exit(0);
                }
            }
        }
        else if (n < 1001 || n > 9999) {
            System.exit(0);
        }
      
    }
}