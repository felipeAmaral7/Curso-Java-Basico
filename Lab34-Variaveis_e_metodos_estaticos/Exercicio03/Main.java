package Exercicio03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int opcao;
        do{

            System.out.printf("\n1 - somar\n2 - subtrair\n3 - multiplicar\n4 - dividir\n5 - elevar a potencia\n6 - Fatorial\n0 - Sair\n");

            opcao = ler.nextInt();
            double num1;
            double num2;
            switch (opcao){
                case 1:
                    System.out.println("Digite dois numeros para somar: ");
                    num1 = ler.nextDouble();
                    num2 = ler.nextDouble();
                    System.out.println("A soma resultou em: " + Calculadora.soma(num1, num2));
                    break;

                case 2:
                    System.out.println("Digite dois numeros que deseja subtrair: ");
                    num1 = ler.nextDouble();
                    num2 = ler.nextDouble();
                    System.out.println("A subtracao resultou em: " + Calculadora.subtrai(num1, num2));
                    break;

                case 3:
                    System.out.println("Digite dois numeros que deseja multiplicar: ");
                    num1 = ler.nextDouble();
                    num2 = ler.nextDouble();
                    System.out.println("A multiplicacao resultou em: " + Calculadora.multiplica(num1, num2));
                    break;

                case 4:
                    System.out.println("Digite dois numeros que deseja dividir: ");
                    num1 = ler.nextDouble();
                    num2 = ler.nextDouble();
                    System.out.println("A divisao resultou em: " + Calculadora.divide(num1, num2));
                    break;

                case 5: 
                    System.out.println("Digite um numero que deseja elevar a potencia e outra que sera elevado: ");
                    num1 = ler.nextDouble();
                    int n = ler.nextInt();
                    System.out.println("A potencia resultou em: " + Calculadora.potencia(num1, n));
                    break;

                case 6: 
                    System.out.println("Digite um numero que deseja saber o fatorial: ");
                    num1 = ler.nextDouble();
                    System.out.println("O fatorial resultou em: " + Calculadora.fatorial((int)num1));
                    break;
            
                default:
                    System.out.println("Digie uma opcao valida!");
                    break;
            }
        }while(opcao != 0);

        ler.close();
    }
}
