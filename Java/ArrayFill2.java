import java.util.Scanner;

/**
 * ArrayFill2
 */
public class ArrayFill2 {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int T = raf.nextInt();
        int n[] = new int[1000];
        int temp = 0;
        for(int i = 0; i < n.length; i++){
            System.out.print("N["+i+"] = " + temp + "\n");
            temp++; 
            if(temp == T){
                temp -= T;
            }
        }
    }
}