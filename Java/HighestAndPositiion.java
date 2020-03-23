import java.util.Scanner;

/**
 * HighestAndPositiion
 */
public class HighestAndPositiion {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int number[] = new int[100];
        int temp = 0;
        int temp2 = 0;
        for(int i = 0; i < 100; i++){
            number[i] = raf.nextInt();
        }
        for(int i = 0; i < 100; i++){
            if(number[i] > temp2){
                temp2 = number[i];
                temp = i + 1;
            }
        }
        System.out.println(temp2);
        System.out.println(temp);
    }
}