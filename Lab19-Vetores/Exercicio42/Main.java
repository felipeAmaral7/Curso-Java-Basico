package exercicio42;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);

        Vetor vet = new Vetor();
        int menor;

        System.out.println("Digite 10 elementos: ");
        for(int i = 0; i < vet.getTamVet(); i++){
            int valor = ler.nextInt();
            vet.setElemento(i, valor);
        }

        //vetor atual
        System.out.println("Vetor nao crescente: ");
        for(int i = 0; i < vet.getTamVet(); i++){
           System.out.printf("%d ", vet.getElemento(i));
        }
        System.out.println();

        //ordenando o vetor
        for(int i = 0; i < vet.getTamVet(); i++){
            menor = i;
            for(int j = i + 1; j < vet.getTamVet(); j++){
                if(vet.getElemento(menor) > vet.getElemento(j)){
                    menor = j;
                }
            }
            int temp = vet.getElemento(i);
            vet.setElemento(i, vet.getElemento(menor));
            vet.setElemento(menor, temp);
        }

        //vetor crescente
        System.out.println("Vetor crescente: ");
        for(int i = 0; i < vet.getTamVet(); i++){
            System.out.printf("%d ", vet.getElemento(i));
        }

        ler.close();
    }
}
