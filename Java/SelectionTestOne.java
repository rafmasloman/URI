import java.util.Scanner;

/**
 * SelectionTestOne
 */
public class SelectionTestOne {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int a = raf.nextInt();
        int b = raf.nextInt();
        int c = raf.nextInt();
        int d = raf.nextInt();

        int cd = c + d;
        int ab = a + b;
        if(b > c && d > a){ 
            if(cd > ab){
                if(c > 0 && d > 0){
                    if(a % 2 == 0){
                        System.out.println("Valores aceitos");
                    }
                    else if(a % 2 != 0){
                        System.out.println("Valores nao aceitos");
                    }
                }
                else if(c < 0 && d < 0){
                    System.out.println("Valores nao aceitos");
                }
            }
        else if(cd < ab){
                System.out.println("Valores nao aceitos");
            if (c < 0 && d < 0) {
                System.out.println("Valores nao aceitos");
                if (a % 2 != 0) {
                    System.out.println("Valores nao aceitos");
                }
            }
            else if (c < 0 && d > 0) {
                System.out.println("Valores nao aceitos");
                if (a % 2 != 0) {
                    System.out.println("Valores nao aceitos");
                }
            }
            else if (c > 0 && d < 0) {
                System.out.println("Valores nao aceitos");
                if (a % 2 != 0) {
                    System.out.println("Valores nao aceitos");
                    }
            }
            
        }
    }
    else if (b < c && d > a) {
            if (cd > ab) {
                if (c > 0 && d > 0) {
                    if (a % 2 == 0) {
                        System.out.println("Valores aceitos");
                    } else if (a % 2 != 0) {
                        System.out.println("Valores nao aceitos");
                    }
                } else if (c < 0 && d < 0) {
                    System.out.println("Valores nao aceitos");
                }
            } else if (cd < ab) {
                System.out.println("Valores nao aceitos");
                if (c < 0 && d < 0) {
                    System.out.println("Valores nao aceitos");
                    if (a % 2 != 0) {
                        System.out.println("Valores nao aceitos");
                    }
                } else if (c < 0 && d > 0) {
                    System.out.println("Valores nao aceitos");
                    if (a % 2 != 0) {
                        System.out.println("Valores nao aceitos");
                    }
                } else if (c > 0 && d < 0) {
                    System.out.println("Valores nao aceitos");
                    if (a % 2 != 0) {
                        System.out.println("Valores nao aceitos");
                    }
                }

            }
        }
        
            
    }
}