package Exericicio02;
import java.util.Random;

public class Conta {
    private int numeroDaConta;
    private int saldo;
    private boolean status;
    private int limite;
    Conta(){
    }
    Conta(boolean status_){
        Random gerador = new Random();
        this.numeroDaConta = gerador.nextInt(10000);
        this.saldo = 0;
        this.status = status_;
        this.limite = 0;
    }

    Conta(int saldo_, boolean status_, int limite_){
        saldo = saldo_;
        status = status_;
        limite = limite_;
    }

    public void realizarSaque(double valorSacado){
        if(valorSacado > saldo){
            System.out.println("Valor para saque maior que o disponivel em saldo!");
        }
        else{
            saldo -= valorSacado;
        }
    }

    public void depositarDinheiro(double valor){
        saldo += valor;
        System.out.println("O valor de " + valor + " foi depositado em sua conta!");
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo e de " + saldo + " ");
    }

    public void verificarEspecial(){
        if(status){
            System.out.println("eh especial");
        }
        else{
            System.out.println("nao eh especial");
        }
    }
    public void imprimeConta(){
        System.out.println("O numero da sua conta eh: " + numeroDaConta);
        System.out.println("Seu saldo eh de: " + saldo);
        System.out.println("Sua conta " + (status == true ? "eh especial": "nao eh especial"));
        System.out.println("Seu limite eh de: " + limite);
    } 
}
