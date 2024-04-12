package exercicio04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double countryA = 80000;
        double countryB = 200000;

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
