import java.util.Scanner;
/**
 * OddNumbers
 */
public class OddNumbers {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int number = raf.nextInt();
        for(int i = 1; i <= number; i++){
            if(i % 2 != 0){
            System.out.println(i);
            
            }
        }
    }
}