import java.util.Scanner;

/**
 * TriangleTypes
 */
public class TriangleTypes {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        double a = raf.nextDouble();
        double b = raf.nextDouble();
        double c = raf.nextDouble();
        if(a >= (b + c)){
            System.out.println("NAO FORMA TRIANGULO");
        }
        if(Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)){
            System.out.println("TRIANGULO RETANGULO");
        }
        if((Math.pow(a, 2)) > (Math.pow(b, 2) + Math.pow(c, 2))){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if(Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a == b || c == b || a == c) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}