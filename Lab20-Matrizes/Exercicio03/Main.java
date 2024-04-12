package Exercicio03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] mat = new int[3][3];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j< mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int quantPares = 0;
        int quantImpares = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j< mat[i].length; j++){
                if(mat[i][j] % 2 == 0){
                    quantPares += 1;
                }
                else{
                    quantImpares += 1;
                }
                System.out.printf("%d ", mat[i][j]);
            }
            System.out.println();
        }
        System.out.println("Quantidade de pares: " + quantPares);
        System.out.println("Quantidade de impares: " + quantImpares);

        sc.close();
    }
}
