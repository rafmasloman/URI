import java.util.Scanner;

/**
 * BalonOfHonour
 */
public class BalonOfHonour {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        String alphabet = raf.next();
        char[] toChar = alphabet.toCharArray();
        char[] huruf = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int i = 0; i < huruf.length; i++){
            if(huruf[i] == toChar[0]){
                System.out.println(i + 1);
            }
        }
        
    }
}