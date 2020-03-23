import java.util.Scanner;

/**
 * EvenOddPositiveAndNegative
 */
public class EvenOddPositiveAndNegative {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int input;
        int even = 0; 
        int odd = 0;
        int positive = 0;
        int negative = 0;
        for(int i = 0; i < 5; i++){
           input = raf.nextInt();
            if(input % 2 == 0){
                even++;
            }
            if(input % 2 != 0){
                odd++;
            }
            if(input > 0){
                positive++;
            }
            if(input < 0){
                negative++;
            }
        }
        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(positive + " valor(es) positivo(s)");
        System.out.println(negative + " valor(es) negativo(s)");
    }
}