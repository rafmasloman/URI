import java.util.Arrays;
import java.util.Scanner;

/**
 * SimpleSort
 */
public class SimpleSort {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int number1 = raf.nextInt();
        int number2 = raf.nextInt();
        int number3 = raf.nextInt();

        if(number1  > number2 && number1 > number3){
            System.out.println(number1);
            if(number2 > number3){
                System.out.println(number2);
                System.out.println(number3);
            }
            else if(number3 > number2){
                System.out.println(number2);
                System.out.println(number3);
            }
        }
        else if(number2 > number1 && number2 > number3){
            System.out.println(number2);
            if (number1 > number3) {
                System.out.println(number1);
                System.out.println(number3);
            } 
            else if(number3 > number1){
                System.out.println(number3);
                System.out.println(number1);
            }
        }
    }
}