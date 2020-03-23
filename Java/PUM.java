import java.util.Scanner;

/**
 * PUM
 */
public class PUM {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int n = raf.nextInt();
        int pum[][] = new int[n][4];
        for(int i = 1; i <= pum.length; i++){
            
                System.out.print(i + " ");
                if(i == 3){
                    System.out.print("PUM");
                }
            
        }
        
    }
}