package Exercicio02;
import java.util.Random;

public class Conta {
    private int numeroDaConta;
    private double saldo;
    private boolean status;
    private int limite;

    Conta(){
    }
    Conta(boolean status_){
        Random gerador = new Random();
        this.setNumeroDaConta(gerador.nextInt(10000));
        this.setSaldo(0);
        this.setStatus(status_);
        this.setLimite(0);
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public int getLimite() {
        return limite;
    }
    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void realizarSaque(double valorSacado){
        if(valorSacado > this.getSaldo()){
            System.out.println("Valor para saque maior que o disponivel em saldo!");
        }
        else{
            this.setSaldo(this.getSaldo() - valorSacado);
            System.out.println("O valor de " + valorSacado + " foi retirado!");
        }
    }

    public void depositarDinheiro(double valor){
        this.setSaldo(this.getSaldo() + valor);

        System.out.println("O valor de " + valor + " foi depositado em sua conta!");
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo e de " + this.getSaldo() + " ");
    }

    public void verificarEspecial(){
        if(this.getStatus()){
            System.out.println("eh especial");
        }
        else{
            System.out.println("nao eh especial");
        }
    }
    public void imprimeConta(){
        System.out.println("O numero da sua conta eh: " + this.getNumeroDaConta());
        System.out.println("Seu saldo eh de: " + this.getSaldo());
        System.out.println("Sua conta " + (this.getStatus() == true ? "eh especial": "nao eh especial"));
        System.out.println("Seu limite eh de: " + this.getLimite());
    } 
}
