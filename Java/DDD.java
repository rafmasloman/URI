import java.util.Scanner;

/**
 * DDD
 */
public class DDD {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        int ddd = raf.nextInt();
        System.out.printf(ddd == 61 ? "Brasilia\n" : ddd == 71 ? "Salvador\n" : ddd == 11 ?  "Sao Paulo\n" : ddd == 21 ? "Rio de Janeiro\n" : 
                          ddd == 32 ? "Juiz de Fora\n" : ddd == 19 ? "Campinas\n" : ddd == 27 ? "Vitoria\n" : ddd == 31 ? "Belo Horizonte\n" : "DDD nao cadastrado\n");
        /*
        if(ddd == 61){
            System.out.println("Brasilia");
        }
        else if(ddd == 71){
            System.out.println("Salvador");
        }
        else if(ddd == 11){
            System.out.println("Sao Paulo");
        }
        else if(ddd == 21){
            System.out.println("Rio de Janeiro");
        }
        else if(ddd == 32){
            System.out.println("Juiz de Fora");
        }
        else if(ddd == 19){
            System.out.println("Campinas");
        }
        else if(ddd == 27){
            System.out.println("Vitoria");
        }
        else if(ddd == 31){
            System.out.println("Belo Horizonte");
        }
        else{
            System.out.println("DDD nao cadastrado");
        }
        */
    }
}