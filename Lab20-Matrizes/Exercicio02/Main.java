package Exercicio02;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        int [][] matriz = new int[10][10];
        Random gerador = new Random();

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = gerador.nextInt(10);
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
        int maiorLinha5 = matriz[5][0];
        int menorLinha5 = matriz[5][0];

        int maiorColuna7 = matriz[0][7];
        int menorColuna7 = matriz[0][7];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                //quando a linha for igual a 5
                if(i == 5){
                    //verifica se o elemento eh maior que o anterior
                    if(matriz[i][j] > maiorLinha5){
                        maiorLinha5 = matriz[i][j];
                    }
                    //verifica se o elemento eh menor que o anterior
                    if(matriz[i][j] < menorLinha5){
                        menorLinha5 = matriz[i][j];
                    }
                }
                //quando a coluna for igual a 7
                if(j == 7){
                    //verifica se o elemento eh maior que o anterior
                    if(matriz[i][j] > maiorColuna7){
                        maiorColuna7 = matriz[i][j];
                    }
                    //verifica se o elemento eh menor que o anterior
                    if(matriz[i][j] < menorColuna7){
                        menorColuna7 = matriz[i][j];
                    }
                }
            }
        }
        System.out.printf("Maior elemento da linha 5: %d\n", maiorLinha5);
        System.out.printf("Menor elemento da linha 5: %d\n", menorLinha5);

        System.out.printf("Maior elemento da linha 7: %d\n", maiorColuna7);
        System.out.printf("Maior elemento da linha 7: %d\n", menorColuna7);
    }
}
