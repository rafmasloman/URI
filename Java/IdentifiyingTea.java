import java.util.Scanner;

/**
 * IdentifiyingTea
 */
public class IdentifiyingTea {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int t = raf.nextInt();
        int temp = 0;
        for(int i = 0; i < 5; i++){
            int answer = raf.nextInt();
            if(t == answer){
                temp++;
            }
        }
        System.out.println(temp);
    }
}