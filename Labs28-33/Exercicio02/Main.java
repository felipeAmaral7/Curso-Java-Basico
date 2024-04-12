package Exercicio02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta myConta = new Conta(false);
        System.out.println("Sua conta foi criada!");
        myConta.imprimeConta();

        System.out.println("Deseja adicionar dinheiro em sua conta? [S/N]");

        char addMoney = sc.next().charAt(0);

        if(addMoney == 'S'){
            System.out.println("Certo, digite o valor que deseja adicionar em sua conta: ");
            double valor = sc.nextDouble();
            myConta.depositarDinheiro(valor);
            myConta.consultarSaldo();
        }
        else{
            System.out.println("OK!");
        }
        System.out.println("Deseja sacar dinheiro em sua conta? [S/N]");
        
        char sacaMoney = sc.next().charAt(0);

        if(sacaMoney == 'S'){
            System.out.println("Certo, digite o valor que deseja sacar em sua conta: ");
            double valor = sc.nextDouble();
            myConta.realizarSaque(valor);
            myConta.consultarSaldo();
        }
        else{
            System.out.println("OK!");
        }

        sc.close();
    }
}
