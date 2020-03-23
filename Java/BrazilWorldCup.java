import java.util.Scanner;
public class BrazilWorldCup{
    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int n = raf.nextInt();
        while(n == 0){
            System.out.println("vai ter copa!");
            n = raf.nextInt();
            if(n != 0){
                while(n != 0){
                System.out.println("vai ter duas!");
                n = raf.nextInt();
                }
            }
        }
        while (n != 0) {
            System.out.println("vai ter duas!");
            n = raf.nextInt();
            if (n == 0) {
                while (n == 0) {
                    System.out.println("vai ter copa!");
                    n = raf.nextInt();
                }
            }
        }
    }
}