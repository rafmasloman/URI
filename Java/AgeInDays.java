import java.util.Scanner;

/**
 * AgeInDays
 */
public class AgeInDays {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int days = raf.nextInt();
        int ano = (days / 365) % days;
        int mes = (days % 365) / 30;
        int dia = (days % 365) % 30;
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

        //System.out.println(dia);
    }
}