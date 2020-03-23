import java.util.Scanner;

/**
 * Mjolnir
 */
public class Mjolnir {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int c = raf.nextInt();
        int n[] = new int[c];
        String name[] = new String[c];
        for(int i = 0; i < n.length; i++){
           name[i] = raf.next();
           n[i] = raf.nextInt();
        }
        for (int i = 0; i < n.length; i++){
            if(name[i].equals("Thor")){
                System.out.println("Y");
            }
            else{
                System.out.println("N");
            }
        }
    }
}