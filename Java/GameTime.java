import java.util.Scanner;

/**
 * GameTime
 */
public class GameTime {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int numberOne = raf.nextInt();
        int numberTwo = raf.nextInt();
        
        int temp = 0;
        if(numberOne > numberTwo){
            for(int i = numberOne; i < 24 + numberTwo; i++){
                temp++;
            }
            System.out.println("O JOGO DUROU " + temp + " HORA(S)");
        }
        else if(numberTwo > numberOne){
            for (int i = numberOne; i < numberTwo; i++) {
                temp++;
            }
            System.out.println("O JOGO DUROU " + temp + " HORA(S)");
        }
        else{
            for (int i = numberOne; i < 24 + numberTwo; i++) {
                temp++;
            }
            System.out.println("O JOGO DUROU " + temp + " HORA(S)"); 
        }
    }
}