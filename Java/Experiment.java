import java.util.Scanner;

/**
 * Experiment
 */
public class Experiment {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int n = raf.nextInt();
        int amount[] = new int[n];
        String animal;

        int total = 0;
        int coelho = 0;
        int rato = 0;
        int sapo = 0;
        
        for(int i = 0; i < n; i++){
            amount[i] = raf.nextInt();
            
                animal = raf.next();
                switch(animal){
                    case "C":
                        coelho += amount[i];
                        break;
                    case "R":
                        rato += amount[i];
                        break;
                    case "S":
                        sapo += amount[i];
                        break;
                }

            
            total += amount[i];
        }
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        
        System.out.printf("Percentual de coelhos: %.2f %c\n",((double)coelho/(double)total)*100,37);
        System.out.printf("Percentual de ratos: %.2f %c\n", ((double) rato / (double) total) * 100, 37);
        System.out.printf("Percentual de sapos: %.2f %c\n", ((double) sapo / (double) total) * 100, 37);
    }
}