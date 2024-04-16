package Exercicio01;
import java.util.Scanner;

public abstract class Conta {
    private String nomeCliente;
    private int numConta;
    private double saldo;

    Conta(){}

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
            System.out.printf("O valor de %f foi sacado!\n", valor);
        }
        else{
            System.out.println("Valor maior que o disponivel");
        }
    }
    
    public void depositar (double valor){
        this.setSaldo(valor);
        System.out.printf("O valor de %f foi depositado!\n", valor);
    }

    public void imprimirInformacoes(){
        System.out.println("O nome do cliente eh: " + this.getNomeCliente());
        System.out.println("A conta do cliente eh: " + this.getNumConta());
        System.out.println("Seu saldo eh de: " + this.getSaldo());
    }

    public void lerConta(Scanner sc){
        System.out.println("Digite seu nome: ");
        this.setNomeCliente(sc.nextLine());
    }
}
