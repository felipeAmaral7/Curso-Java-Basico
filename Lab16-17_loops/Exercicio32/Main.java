package exercicio32;

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor para calcular o fatorial: ");
        int valor = ler.nextInt();
        int calculaFatorial = 1;

        System.out.printf("%d!= ", valor);
        for(int i = valor; i > 0; i--){
            if(i != 1){
                System.out.printf(" %d.", i);
            }
            else{
                System.out.printf(" %d", i);
            }
            calculaFatorial *= i;
        }
        System.out.printf(" = %d\n", calculaFatorial);

        ler.close();
    }
}
