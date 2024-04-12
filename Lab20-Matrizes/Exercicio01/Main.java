package Exericico01;

//import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args) {

        int [][] matriz = new int[4][4];

        Random gerador = new Random();

        for(int i = 0; i < matriz.length; i ++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = gerador.nextInt(10);
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
        int maior = matriz[0][0];
        int maiorI = 0;
        int maiorJ = 0;
        for(int i = 0; i < matriz.length; i ++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] > matriz[maiorI][maiorJ]){
                    maior = matriz[i][j];
                    maiorI = i;
                    maiorJ = j;
                }
            }
        }
        System.out.println("O maior elemento eh: " + maior);
        System.out.println("Posicao: " + maiorI + " " + maiorJ);
    }
}
