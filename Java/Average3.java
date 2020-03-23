import java.util.Scanner;

/**
 * Average3
 */
public class Average3 {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        double grade1 = raf.nextDouble() * 2;
        double grade2 = raf.nextDouble() * 3;
        double grade3 = raf.nextDouble() * 4;
        double grade4 = raf.nextDouble() * 1;
        double score = raf.nextDouble();

        double media = (grade1 + grade2 + grade3 + grade4) / 10;
        System.out.println("Media: " + media);

        if(media >= 5.0 && media <= 6.9){
            System.out.println("Aluno em exame.");
        }
        else if(media < 5.0){
            System.out.println("Aluno reprovado.");
        }
        else if(media >= 7.0){
            System.out.println("Aluno aprovado.");
        }

        double examScore = (score + media) / 2;
        System.out.println("Nota do exame: " + score);

        if (examScore >= 5.0) {
            System.out.println("Aluno aprovado.");
        }
        else if(examScore <= 4.9){
            System.out.println("Aluno reprovado.");
        }

        System.out.println("Media final: " + examScore);
    } 
}