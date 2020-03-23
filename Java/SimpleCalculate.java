import java.util.Scanner;

/**
 * SimpleCalculate
 */
public class SimpleCalculate {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);

        int codeProduct1 = raf.nextInt();
        int numberProduct1 = raf.nextInt();
        double priceProduct1 = raf.nextDouble();

        int codeProduct2 = raf.nextInt();
        int numberProduct2 = raf.nextInt();
        double priceProduct2 = raf.nextDouble();

        double harga1 = numberProduct1 * priceProduct1;
        double harga2 = numberProduct2 * priceProduct2;
        double valueToPay = harga1 + harga2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",valueToPay);
    }
}