package exercicio42;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = 0;

        int valoresDe0Ate25 = 0;
        int valoresDe25Ate50 = 0;
        int valoresDe50Ate75 = 0;
        int valoresDe75Ate100 = 0;

        do{
            System.out.print("Digite um valor: ");

            entrada = sc.nextInt();
            valoresDe0Ate25 += (entrada > 0 && entrada <= 25) ? 1 : 0;
            
            valoresDe25Ate50 += (entrada > 25 && entrada <= 50) ? 1 : 0;

            valoresDe50Ate75 += ( entrada > 50 && entrada <= 75) ? 1 : 0;

            valoresDe75Ate100 += (entrada > 75 && entrada <= 100) ? 1 : 0;
            
        }while(entrada != 0);

        System.out.printf("Valores entre[0 - 25]: %d\n", valoresDe0Ate25);
        System.out.printf("Valores entre[26 - 50]: %d\n", valoresDe25Ate50);
        System.out.printf("Valores entre[51 - 75]: %d\n", valoresDe50Ate75);
        System.out.printf("Valores entre[76 - 100]: %d\n", valoresDe75Ate100);

        sc.close();
    }    
}
