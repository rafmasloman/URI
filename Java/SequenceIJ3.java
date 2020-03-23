import java.util.Scanner;

/**
 * SequenceIJ3
 */
public class SequenceIJ3 {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        for (int i = 1; i <= 9; i+=2) {
            for (int j = 7; j >= 5; j--){
                for(int k = j+=2; k > j; k++){
                    System.out.print("I="+i+"J="+j+"\n");
                }
            }
        }
    }
}