import java.util.Scanner;

/**
 * RestOfADivison
 */
public class RestOfADivison {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int x = raf.nextInt();
        int y = raf.nextInt();
        if(x < y){
        for(int i = x + 1; i < y; i++){
            if(i % 5 == 2 || i % 5 == 3){
                System.out.println(i);
                }
            }
        }
        else if(x > y){
            for (int i = y + 1; i < x; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }  
        }
    }
}