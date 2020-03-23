import java.util.Scanner;

/**
 * EvenOrOdd
 */
public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int n = raf.nextInt();
        int number[] = new int[n];
        for(int i = 0; i < n; i++){
            number[i] = raf.nextInt();
        }
        for(int i = 0; i < n; i++){    
            if(number[i] % 2 != 0){
                if(number[i] > 0){
                    System.out.println("ODD POSITIVE");
                }
                else if(number[i] < 0){
                    System.out.println("ODD NEGATIVE");
                }
            }
            else if(number[i] % 2 == 0){
                if(number[i] < 0){
                    System.out.println("EVEN NEGATIVE");
                }
                else if(number[i] > 0){
                    System.out.println("EVEN POSITIVE");
                }
                else if(number[i] == 0){
                    System.out.println("NULL");
                }
            }
            
        }
    }
}