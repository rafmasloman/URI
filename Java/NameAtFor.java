import java.util.Scanner;

/**
 * NameAtFor
 */
public class NameAtFor {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        String L = raf.nextLine();
        int panjangL = L.length();
        if(panjangL > 80){
            System.out.println("NO");
        }
        else if(panjangL <= 80){
            System.out.println("YES");
        }
    }
}