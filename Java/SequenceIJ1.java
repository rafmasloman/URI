import java.util.Scanner;

/**
 * SequenceIJ1
 */
public class SequenceIJ1 {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int j = 60;
        for(int i = 1; i < 40; i+=3,j-=5){
            System.out.print("I=" + i + " J=" + j + "\n");
        }
    }
}