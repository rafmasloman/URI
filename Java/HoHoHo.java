import java.util.Scanner;

/**
 * HoHoHo
 */
public class HoHoHo {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int n = raf.nextInt();
        if(n > 0 && n <= 1000000){
        for(int i = 1; i < n; i++){
            System.out.print("Ho" + " ");
        }
        System.out.print("Ho" + "!");
        }
    }
}