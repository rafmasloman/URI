import java.util.Scanner;

/**
 * Ages
 */
public class Ages {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int age = raf.nextInt();
        int temp = age;
        int count = 1;
        while(age > 0){
            age = raf.nextInt();
            if(age > 0){
            temp += age;
                if(age > 0){
                count++;
                }
            }
        }
        System.out.printf("%.2f\n",temp / (double) count);
    }
}