import java.util.Scanner;

/**
 * SequenceIJ2
 */
public class SequenceIJ2 {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        for(int I = 1; I <= 9; I+=2){
            for(int J = 7; J >= 5; J--){
                System.out.print("I=" + I + " J=" + J + "\n");
            }
        }
    }
}