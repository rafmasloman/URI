import java.util.Scanner;

/**
 * EvenBetweenFive
 */
public class EvenBetweenFive {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int input;
        int count = 0;
        for(int i = 0; i < 5; i++){
            input = raf.nextInt();
            if(input % 2 == 0){
               count++; 
            }
        }
        System.out.println(count + " valores pares");
    }
}