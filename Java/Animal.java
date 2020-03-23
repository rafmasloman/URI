import java.util.Scanner;

/**
 * Animal
 */
public class Animal {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        String animal1 = raf.next();
        String animal2, animal3;
        switch(animal1){
            case "vertebrado":
            animal2 = raf.next();
                switch (animal2) {
                    case "ave":
                    animal3 = raf.next();
                    switch (animal3) {
                        case "carnivoro":
                        System.out.println("aguia");
                        break;
                    
                        case "onivoro":
                        System.out.println("pomba");
                        break;
                    }
                    break;
                
                    case "mamifero":
                    animal3 = raf.next();
                    switch (animal3) {
                        case "onivoro":
                        System.out.println("homem");    
                        break;
                    
                        case "herbivoro":
                        System.out.println("vaca");    
                        break;
                    }
                    break;
                }
                break;
            case "invertebrado":
            animal2 = raf.next();
                switch (animal2) {
                    case "inseto":
                    animal3 = raf.next();
                    switch (animal3) {
                        case "hematofago":
                        System.out.println("pulga");    
                        break;
                        case "herbivoro":
                        System.out.println("lagarta");
                        break;
                        default:
                        break;
                    }
                    break;
                
                    default:
                    break;
                    case "anelideo":
                    animal3 = raf.next();
                    switch (animal3) {
                        case "hematofago":
                        System.out.println("sanguessuga");    
                        break;
                        case "onivoro":
                        System.out.println("minhoca");
                        break;
                        default:
                        break;
                    }
                    break;
                
                }
            

        }
    }
}