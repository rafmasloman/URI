import java.util.Scanner;

/**
 * EasyFibonacci
 */
public class EasyFibonacci {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int number = raf.nextInt();
        int temp1 = 0;
        int temp2 = 1;
        int bantu;
        for(int i = 1; i <= number; i++){
            System.out.print(temp1 + " " + i);
        }
    }
}