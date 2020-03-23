import java.util.Scanner;

/**
 * GameTimeWithMinutes
 */
public class GameTimeWithMinutes {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        //Waktu Mulai
        int startHour = raf.nextInt();
        int startMinute = raf.nextInt();
        //Waktu Berakhir
        int endHour = raf.nextInt();
        int endMinute = raf.nextInt();
        //Variabel Hitung Waktu
        int countHour = 0;
        int countMinute = 0;

        if(startHour < endHour && startMinute < endMinute){
            for (int i = startHour; i < endHour; i++) {
                countHour++;
            }
            for (int i = startMinute; i < endMinute; i++) {
                countMinute++;
            }
            System.out.println("O JOGO DUROU " + countHour + " HORA(S) E " + countMinute + " MINUTO(S)");
        }
        else if (startHour < endHour && startMinute > endMinute) {
            for (int i = startHour; i < endHour - 1; i++) {
                countHour++;
            }
            for (int i = startMinute; i < 60 + endMinute; i++) {
                countMinute++;
            }
            System.out.println("O JOGO DUROU " + countHour + " HORA(S) E " + countMinute + " MINUTO(S)");
        }
        else if(startHour > endHour && startMinute > endMinute){
            for (int i = startHour; i < (24 + endHour) - 1; i++) {
                countHour++;
            }
            for (int i = startMinute; i < 60 + endMinute; i++) {
                countMinute++;
            }
            System.out.println("O JOGO DUROU " + countHour + " HORA(S) E " + countMinute + " MINUTO(S)");
        }
        else if (startHour > endHour && startMinute < endMinute) {
            for (int i = startHour; i < 24 + endHour; i++) {
                countHour++;
            }
            for (int i = startMinute; i < endMinute; i++) {
                countMinute++;
            }
            System.out.println("O JOGO DUROU " + countHour + " HORA(S) E " + countMinute + " MINUTO(S)");
        }
        else if(startHour == endHour && startMinute == endMinute){
            for(int i = startHour; i < 24 + endHour; i++){
                countHour++;
            }
            for(int i = startMinute; i < endMinute; i++){
                countMinute++;
            }
            System.out.println("O JOGO DUROU " + countHour + " HORA(S) E " + countMinute + " MINUTO(S)");
        }
        else if (startHour > endHour && startMinute == endMinute) {
            for (int i = startHour; i < 24 + endHour; i++) {
                countHour++;
            }
            for (int i = startMinute; i < endMinute; i++) {
                countMinute++;
            }
            System.out.println("O JOGO DUROU " + countHour + " HORA(S) E " + countMinute + " MINUTO(S)");
        }
        else if (startHour == endHour && startMinute > endMinute) {
            for (int i = startHour; i < (24 + endHour) - 1; i++) {
                countHour++;
            }
            for (int i = startMinute; i < 60 + endMinute; i++) {
                countMinute++;
            }
            System.out.println("O JOGO DUROU " + countHour + " HORA(S) E " + countMinute + " MINUTO(S)");
        }
        else if (startHour < endHour && startMinute == endMinute) {
            for (int i = startHour; i < 24 + endHour; i++) {
                countHour++;
            }
            for (int i = startMinute; i < endMinute; i++) {
                countMinute++;
            }
            System.out.println("O JOGO DUROU " + countHour + " HORA(S) E " + countMinute + " MINUTO(S)");
        } 
        else if (startHour == endHour && startMinute < endMinute) {
            for (int i = startHour; i < endHour; i++) {
                countHour++;
            }
            for (int i = startMinute; i < endMinute; i++) {
                countMinute++;
            }
            System.out.println("O JOGO DUROU " + countHour + " HORA(S) E " + countMinute + " MINUTO(S)");
        }
        
    }
}