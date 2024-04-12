public class Vetor {
    private int []vet;
    private int tamVet;

    Vetor(){
        setTamVet(5);
        vet = new int[getTamVet()];
    }

    Vetor(int tamanho){
        vet = new int[tamanho];
        setTamVet(tamanho);
    }

    public int getVetor(int index){
        return vet[index];
    }

    public void setVetor(int index, int novoValor){
        vet[index] = novoValor;
    }
    public int getTamVet(){
        return tamVet;
    }
    
    public void setTamVet(int novoValor){
        tamVet = novoValor;
    }
}
