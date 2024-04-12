import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Vetor vet1 = new Vetor(5);
        Vetor vet2 = new Vetor(5);

        for(int i = 0; i < vet1.getTamVet(); i++){
            System.out.printf("Insira um valor na posicao %d: ", i);
            int valor = ler.nextInt();
            vet1.setVetor(i, valor);
        }

        System.out.println("---VETOR 1---");
        for(int i = 0; i < vet1.getTamVet(); i++){
            System.out.printf("Valor na posicao %d: %d\n", i, vet1.getVetor(i));
            vet2.setVetor(i, vet1.getVetor(i));
        }
        System.out.println("---VETOR 2---");
        for(int i = 0; i < vet1.getTamVet(); i++){
            System.out.printf("Valor na posicao %d: %d\n", i, vet2.getVetor(i));
        }

        ler.close();
    }
}
