package Exercicio01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados da conta poupanca: ");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.lerConta(sc);

        int opcao;
        do{

            System.out.println("-----CONTA POUPANCA-----");
            System.out.printf("1 - Depositar\n2 - Sacar\n3 - Status da Conta\n0 - Sair\n");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor que deseja depositar: ");
                    double deposito = sc.nextDouble();
                    contaPoupanca.depositar(deposito);

                    System.out.println("Digite a taxa da poupanca");

                    contaPoupanca.setDiaRendimento(sc.nextDouble());            //atribui a taxa de rendimento no atributo diaRendimento
                    contaPoupanca.calcularNovoSaldo();                          //calcula o novo saldo baseado na taxa de rendimento colocado
                    break;

                case 2:
                    System.out.println("Digite o valor que deseja sacar");
                    double saque = sc.nextDouble();
                    contaPoupanca.sacar(saque);
                    break;

                case 3: 
                    System.out.println("-----Status da conta-----");
                    contaPoupanca.imprimirInformacoes();
                    break;
                
                case 0:
                    System.out.println("Saindo, press enter para continuar...");
                    sc.nextLine();
                    sc.nextLine();
                    break;

                default:
                    System.out.println("Digite um valor valido!");
                    break;
            }
        }while(opcao != 0);
    
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.lerConta(sc);

        do{

            System.out.println("-----CONTA ESPECIAL-----");
            System.out.printf("1 - Depositar\n2 - Sacar\n3 - Status da Conta\n0 - Sair\n");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor que deseja depositar: ");
                    double deposito = sc.nextDouble();
                    contaEspecial.depositar(deposito);    
                    break;

                case 2:
                    System.out.println("Digite o valor que deseja sacar");
                    double saque = sc.nextDouble();
                    contaEspecial.sacar(saque);
                    break;

                case 3: 
                    System.out.println("-----Status da conta-----");
                    contaEspecial.imprimirInformacoes();
                    break;
                
                case 0:
                    System.out.println("Saindo, press enter para continuar...");
                    sc.nextLine();
                    sc.nextLine();
                    break;

                default:
                    System.out.println("Digite um valor valido!");
                    break;
            }
        }while(opcao != 0);

        //contaPoupanca.imprimirInformacoes();
        //System.out.println();
        //contaEspecial.imprimirInformacoes();
    }
}
