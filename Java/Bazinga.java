import java.util.Scanner;

/**
 * Bazinga
 */
public class Bazinga {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int t = raf.nextInt();
        String sheldon[] = new String[t];
        String raj[] = new String[t];
        for(int i = 0; i < t; i++){
            sheldon[i] = raf.next();
            raj[i] = raf.next();
        }
        for (int i = 0; i < t; i++){
            //1       
            if(sheldon[i].equals("tesoura") && raj[i].equals("papel")){
                System.out.println("Caso #" + (i + 1) + ":" + " Bazinga!");
            }
            else if (sheldon[i].equals("papel") && raj[i].equals("tesoura")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Raj trapaceou!");
            }
            //6
            else if (sheldon[i].equals("tesoura") && raj[i].equals("lagarto")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Bazinga!");
            }
            else if (sheldon[i].equals("lagarto") && raj[i].equals("tesoura")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Raj trapaceou!");
            }
            //2
            else if (sheldon[i].equals("papel") && raj[i].equals("pedra")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Bazinga!");
            }
            else if (sheldon[i].equals("pedra") && raj[i].equals("papel")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Raj trapaceou!");
            }
            //3
            else if (sheldon[i].equals("pedra") && raj[i].equals("lagarto")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Bazinga!");
            }
            else if (sheldon[i].equals("lagarto") && raj[i].equals("pedra")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Raj trapaceou!");
            }
            //4
            else if (sheldon[i].equals("lagarto") && raj[i].equals("Spock")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Bazinga!");
            } 
            else if (sheldon[i].equals("Spock") && raj[i].equals("lagarto")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Raj trapaceou!");
            }
            //5
            else if (sheldon[i].equals("Spock") && raj[i].equals("tesoura")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Bazinga!");
            } 
            else if (sheldon[i].equals("tesoura") && raj[i].equals("Spock")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Raj trapaceou!");
            }
            //7
            else if (sheldon[i].equals("lagarto") && raj[i].equals("papel")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Bazinga!");
            } 
            else if (sheldon[i].equals("papel") && raj[i].equals("lagarto")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Raj trapaceou!");
            }
            //8
            else if (sheldon[i].equals("papel") && raj[i].equals("Spock")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Bazinga!");
            } 
            else if (sheldon[i].equals("Spock") && raj[i].equals("papel")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Raj trapaceou!");
            }
            //9
            else if (sheldon[i].equals("Spock") && raj[i].equals("pedra")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Bazinga!");
            } 
            else if (sheldon[i].equals("pedra") && raj[i].equals("Spock")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Raj trapaceou!");
            }
            //10
            else if (sheldon[i].equals("pedra") && raj[i].equals("tesoura")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Bazinga!");
            } 
            else if (sheldon[i].equals("tesoura") && raj[i].equals("pedra")) {
                System.out.println("Caso #" + (i + 1) + ":" + " Raj trapaceou!");
            }
            else if(sheldon[i].equalsIgnoreCase(raj[i])){
                System.out.println("Caso #" + (i + 1) + ":" + " De novo!");
            }
        }
    }
}