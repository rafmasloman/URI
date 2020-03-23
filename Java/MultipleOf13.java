import java.util.Scanner;

/**
 * MultipleOf13
 */
public class MultipleOf13 {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int x = raf.nextInt();
        int y = raf.nextInt();

        int temp = 0;
        
        if(x > y){
            for(int i = y; i <= x; i++){
                if(i % 13 != 0){
                    temp += i;
                }
            }
            System.out.println(temp);
        }
        else if(y > x){
            for (int i = x; i <= y; i++) {
                if (i % 13 != 0) {
                    temp += i;
                }
            }
            System.out.println(temp);
        }
        else{
            for (int i = x; i <= y; i++) {
                if (i % 13 != 0) {
                    temp += i;
                }
            }
            System.out.println(temp);
        }
    }
}