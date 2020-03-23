import java.util.Scanner;

/**
 * SixOddNumber
 */
public class SixOddNumber {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int x = raf.nextInt();
        int temp = 0;
        temp = x;
        for(int i = 0; i <= 10; i++){
            temp++;
            if(temp % 2 != 0){
                System.out.println(temp);
            }
        }
    }
}