import java.util.Scanner;

/**
 * Interval2
 */
public class Interval2 {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int n = raf.nextInt();
        int temp = 0;
        int temp2 = 0;
        for(int i = 0; i < n; i++){
            int x = raf.nextInt();
            if(x >= 10 && x <= 20){
                temp++;
            }
            else{
                temp2++;
            }
        }
        System.out.println(temp + " in");
        System.out.println(temp2 + " out");
    }
}