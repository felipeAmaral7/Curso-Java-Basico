package exercicio42;

public class Vetor {
    private int []vet;
    private int tamVet;
    
    Vetor(){
        vet = new int[10];
        this.setTamVet(10);
    }

    public int getElemento(int index){
        return vet[index];
    }
    public void setElemento(int index, int novoValor){
        vet[index] = novoValor;
    }
    public int getTamVet(){
        return tamVet;
    }
    public void setTamVet(int novoValor){
        tamVet = novoValor;
    }
}
