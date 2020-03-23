import java.util.Scanner;

/**
 * ThePronalanciaPuzzle
 */
public class ThePronalanciaPuzzle {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        long number = raf.nextLong();
        String numberToString = String.valueOf(number);
        char[] numberToChar = numberToString.toCharArray();
        for(int i = numberToChar.length - 1; i >= 0; i--){
            System.out.print(numberToChar[i]);
        }
        System.out.print("\n");
    }
}