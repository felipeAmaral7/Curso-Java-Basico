package exercicio05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double countryA;
        double countryB;

        do{
            System.out.print("Digite quantos habitantes tem no pais A: ");
            countryA = sc.nextDouble();

            System.out.print("Digite quantos habitantes tem no pais B: ");
            countryB = sc.nextDouble();

            if(countryA >= countryB){
                System.out.println("Digite um valor no pais A, menor que o pais B!");
            }
        }while(countryA >= countryB);

        int anos = 0;
        while(countryA < countryB){
            countryA = countryA * 1.03;
            countryB = countryB * 1.015;
            anos++;
        }
        System.out.println("Em " + anos + " anos os paises irao se igualar!");

        sc.close();
    }    
}
