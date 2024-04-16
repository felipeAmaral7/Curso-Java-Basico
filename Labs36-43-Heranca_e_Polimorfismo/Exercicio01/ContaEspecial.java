package Exercicio01;
import java.util.Random;

public class ContaEspecial extends Conta{
    private double limite;

    ContaEspecial(){
        Random gerador = new Random();
        this.setNumConta(gerador.nextInt(10000));
        this.setSaldo(0);
        this.setLimite(100);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacar(double valor){
        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
        }
        else if(this.getLimite() >= valor){
            this.setLimite(this.getLimite() - valor);
        }
        else if(this.getSaldo() + this.getLimite() >= valor){
            double soma = this.getSaldo() + this.getLimite();
            soma -= valor;
            this.setSaldo(soma);
            this.setLimite(0);
        }
        else{
            System.out.println("Valor maior que o disponivel em conta!");
        }
    }
    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println("Limite disponivel: " + this.getLimite());
    }
}
