import java.util.Scanner;

/**
 * FixedPassword
 */
public class FixedPassword {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
         int password = raf.nextInt();
         while(password != 2002){
             System.out.println("Senha Invalida");
             password = raf.nextInt();
         }
         System.out.println("Acesso Permitido");
    }
}