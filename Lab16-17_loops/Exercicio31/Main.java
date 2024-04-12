package exercicio31;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("LOJAS TABAJARA");

        char continuaComprando;
        do{
            double product;
            double soma = 0;

            int i = 1;
            do{
                System.out.printf("Produto %d: ", i);
                product = ler.nextDouble();
                soma += product;
                i++;
            }while(product != 0);

            System.out.println("TOTAL: " + soma);

            double valorPago;

            System.out.print("Dinheiro: ");
            valorPago = ler.nextDouble();

            double troco = valorPago - soma;

            System.out.printf("Troco: %.2f\n\n", troco);

            System.out.print("Deseja efetuar mais uma operacao? 's' para sim 'n' para nao\n");
            continuaComprando = ler.next().charAt(0);

        }while(continuaComprando == 's' || continuaComprando == 'S');
        
        ler.close();
    }
}
