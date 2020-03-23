import java.util.Scanner;

/**
 * SalaryIncrease
 */
public class SalaryIncrease {

    public static void main(String[] args) {
        Scanner raf = new Scanner(System.in);
        double input = raf.nextDouble();
        double newSalary;
        if(input >= 0 && input <= 400.00){
            newSalary = input + ((input * 15) / 100);
            System.out.printf("Novo salario:  %.2f \n",newSalary);
            System.out.printf("Reajuste ganho: %.2f \n",(input * 15) / 100);
            System.out.println("Em percentual: 15 %" );
        }
        else if(input >= 400.01 && input <= 800.00){
            newSalary = input + ((input * 12) / 100);
            System.out.printf("Novo salario: %.2f \n",newSalary);
            System.out.printf("Reajuste ganho: %.2f \n",(input * 12) / 100);
            System.out.println("Em percentual: 12 %" );
        }
        else if(input >= 800.01 && input <= 1200.00){
            newSalary = input + ((input * 10) / 100);
            System.out.printf("Novo salario: %.2f \n",newSalary);
            System.out.printf("Reajuste ganho: %.2f \n",(input * 10) / 100);
            System.out.println("Em percentual: 10 %" );
        }
        else if(input >= 1200.01 && input <= 2000.00){
            newSalary = input + ((input * 7) / 100);
            System.out.printf("Novo salario: %.2f \n",newSalary);
            System.out.printf("Reajuste ganho: %.2f \n",(input * 7) / 100);
            System.out.println("Em percentual: 7 %" );
        }
        else if(input >= 2000.00){
            newSalary = input + ((input * 4) / 100);
            System.out.printf("Novo salario: %.2f \n",newSalary);
            System.out.printf("Reajuste ganho: %.2f \n",(input * 4) / 100);
            System.out.println("Em percentual: 4 %" );
        }
    }
}