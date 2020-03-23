import java.util.Scanner;
public class SimpleProduct{
    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int produc1 = raf.nextInt();
        int produc2 = raf.nextInt();
        System.out.println("PROD = " + (produc1 * produc2));
    }
}