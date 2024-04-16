package Exercicio01;
import java.util.Random;

public class ContaPoupanca extends Conta {
    private double diaRendimento;

    ContaPoupanca(){
        Random gerador = new Random();
        this.setNumConta(gerador.nextInt(10000));
        this.setSaldo(0);
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }
    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    public void calcularNovoSaldo(){
        double resultTaxa = 0;

        resultTaxa = this.getSaldo() * (this.getDiaRendimento() / 100);
        
        this.setSaldo(this.getSaldo() + resultTaxa);
    }
}