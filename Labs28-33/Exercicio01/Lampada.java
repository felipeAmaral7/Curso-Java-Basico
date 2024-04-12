package Exercicio01;

public class Lampada {
    private boolean lampadaLigado;

    Lampada(){
       this.setLampadaLigado(false);
    }

    public boolean getLampadaLigado(){
        return lampadaLigado;
    }
    public void setLampadaLigado(boolean novoValor){
        lampadaLigado = novoValor;
    }

    protected void ligarLampada(){
        this.setLampadaLigado(true);
        System.out.println("A lampada ligou!");
    }

    public void desligarLampada(){
        this.setLampadaLigado(false);
        System.out.println("A lampada desligou!");
    }

    public void verEstadoDaLampada(){
        if(this.getLampadaLigado()){
            System.out.println("A lampada esta ligada!");
        }
        else{
            System.out.println("A lampada esta desligada!");
        }
    }
}
