import java.util.Scanner;

/**
 * Multiple
 */
public class Multiple {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int numberOne = raf.nextInt();
        int numberTwo = raf.nextInt();

        if((numberTwo % numberOne == 0) ||(numberOne % numberTwo == 0)){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }

    }
}