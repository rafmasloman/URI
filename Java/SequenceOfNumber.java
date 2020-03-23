import java.util.Scanner;

/**
 * SequenceOfNumber
 */
public class SequenceOfNumber {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int m = raf.nextInt();
        int n = raf.nextInt();

        while(m > 0 && n > 0){
            int temp = 0;

            if(m > n || m == n){
            for (int i = n; i <= m; i++) {
                temp += i;
            }
            for(int i = n; i <= m; i++){
                System.out.print(i + " ");
            }
            System.out.print("Sum=" + temp + "\n");
            }

            else if(m < n || m == n){
                for (int i = m; i <= n; i++) {
                    temp += i;
                }
                for (int i = m; i <= n; i++) {
                    System.out.print(i + " ");
                }
                System.out.print("Sum=" + temp + "\n");  
            }
            m = raf.nextInt();
            n = raf.nextInt();

        }
    }
}