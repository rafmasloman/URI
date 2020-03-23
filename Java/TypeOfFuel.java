import java.util.Scanner;

/**
 * TypeOfFuel
 */
public class TypeOfFuel {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int input = raf.nextInt();

        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;
        int end = 0;

        while(input != 4){
            input = raf.nextInt();
            switch(input){
                case 1:
                    alcohol++;
                break;
                case 2:
                    gasoline++;
                break;
                case 3:
                    diesel++;
                break;
                case 4:
                break;
            }
        }
        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n",alcohol,gasoline,diesel);
    }
}