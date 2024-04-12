package Exercicio06_jogoDaVelha;
import java.util.Scanner;
import java.io.IOException;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char [][] mat = new char[3][3];

        System.out.println("OLA, BEM VINDO AO JOGO DA VELHA");
        System.out.println("Jogador 1, digite 'X' ou 'O' como escolha: ");

        char escolhaJogador1;

        do{
            escolhaJogador1 = sc.next().charAt(0);
            if(escolhaJogador1 != 'X' && escolhaJogador1 != 'x' && escolhaJogador1 != 'O' && escolhaJogador1 != 'o'){
                System.out.println("Digite um valor valido!");
            }
        }while(escolhaJogador1 != 'X' && escolhaJogador1 != 'x' && escolhaJogador1 != 'O' && escolhaJogador1 != 'o');

        char escolhaJogador2;
        if(escolhaJogador1 == 'X' || escolhaJogador1 == 'x'){
            escolhaJogador1 = 'X';
            escolhaJogador2 = 'O';
        }
        else{
            escolhaJogador1 = 'O';
            escolhaJogador2 = 'X';
        }

        //inicializa a matriz com "-"
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = '-';
            }
        }

        int vez = 1;        //indica a vez do jogador
        int jogadaI;        //posicao que o jogador ira indicar na linha
        int jogadaJ;        //posicao que o jogador ira indicar na coluna

        boolean continuaJogo = true;

        do{
            //jogador 1
            if(vez == 1){
                System.out.println("Jogador 1, digite a posicao da sua jogada: ");
                for(int i = 0; i < mat.length; i++){
                    for(int j = 0; j < mat[i].length; j++){
                        System.out.printf("|%d %d|", i, j);
                    }
                    System.out.println();
                }

                if(escolhaJogador1 == 'O'){
                    do{
                        jogadaI = sc.nextInt();
                        jogadaJ = sc.nextInt();
                        if((jogadaI < 0 || jogadaI > 2) || (jogadaJ < 0 || jogadaJ > 2)){
                            System.out.println("Digite valores no intervalo [0 - 2]");
                        }
                        if(mat[jogadaI][jogadaJ] == 'X'){
                            System.out.println("Ja esta ocupado!");
                        }
                    }while((jogadaI < 0 || jogadaI > 2) || (jogadaJ < 0 || jogadaJ > 2) || mat[jogadaI][jogadaJ] == 'X');
                    
                }
                else{
                    do{
                        jogadaI = sc.nextInt();
                        jogadaJ = sc.nextInt();
                        if((jogadaI < 0 || jogadaI > 2) || (jogadaJ < 0 || jogadaJ > 2)){
                            System.out.println("Digite valores no intervalo [0 - 2]");
                        }
                        if(mat[jogadaI][jogadaJ] == 'O'){
                            System.out.println("Ja esta ocupado!");
                        }
                    }while((jogadaI < 0 || jogadaI > 2) || (jogadaJ < 0 || jogadaJ > 2) || mat[jogadaI][jogadaJ] == 'O');
                }

                mat[jogadaI][jogadaJ] = escolhaJogador1;

                //printa a matriz
                for(int i = 0; i < mat.length; i++){
                    for(int j = 0; j < mat[i].length; j++){
                        System.out.printf("%c ", mat[i][j]);
                    }
                    System.out.println();
                }

                //formas de ganhar: horizontal, vertical e diagonal

                for(int i = 0; i < mat.length; i++){
                    if(mat[i][0] == escolhaJogador1 && mat[i][1] == escolhaJogador1 && mat[i][2] == escolhaJogador1){       //analisa se ganhou na horizontal
                        continuaJogo = false;
                    }
                    if(mat[0][i] == escolhaJogador1 && mat[1][i] == escolhaJogador1 && mat[2][i] == escolhaJogador1){       //analisa se ganhou na vertical
                        continuaJogo = false;
                    }
                    if(mat[0][0] == escolhaJogador1 && mat[1][1] == escolhaJogador1 && mat[2][2] == escolhaJogador1){       //analisa se ganhou na diagonal principal
                        continuaJogo = false;
                    }
                    if(mat[0][2] == escolhaJogador1 && mat[1][1] == escolhaJogador1 && mat[2][0] == escolhaJogador1){       //analisa se ganhou na diagonal secundaria
                        continuaJogo = false;
                    }
                }
                if(continuaJogo == false){
                    System.out.println("Jogador 1 venceu!");
                }

                vez = 2;
            }

            //jogador 2
            else{
                System.out.println("Jogador 2, digite a posicao da sua jogada: ");

                for(int i = 0; i < mat.length; i++){
                    for(int j = 0; j < mat[i].length; j++){
                        System.out.printf("|%d %d|", i, j);
                    }
                    System.out.println();
                }

                if(escolhaJogador2 == 'O'){
                    do{
                        jogadaI = sc.nextInt();
                        jogadaJ = sc.nextInt();
                        if((jogadaI < 0 || jogadaI > 2) || (jogadaJ < 0 || jogadaJ > 2)){
                            System.out.println("Digite valores no intervalo [0 - 2]");
                        }
                        if(mat[jogadaI][jogadaJ] == 'X'){
                            System.out.println("Ja esta ocupado!");
                        }
                    }while((jogadaI < 0 || jogadaI > 2) || (jogadaJ < 0 || jogadaJ > 2) || mat[jogadaI][jogadaJ] == 'X');
                    
                }
                else{
                    do{
                        jogadaI = sc.nextInt();
                        jogadaJ = sc.nextInt();
                        if((jogadaI < 0 || jogadaI > 2) || (jogadaJ < 0 || jogadaJ > 2)){
                            System.out.println("Digite valores no intervalo [0 - 2]");
                        }
                        if(mat[jogadaI][jogadaJ] == 'O'){
                            System.out.println("Ja esta ocupado!");
                        }
                    }while((jogadaI < 0 || jogadaI > 2) || (jogadaJ < 0 || jogadaJ > 2) || mat[jogadaI][jogadaJ] == 'O');
                }

                mat[jogadaI][jogadaJ] = escolhaJogador2;

                //printa a matriz
                for(int i = 0; i < mat.length; i++){
                    for(int j = 0; j < mat[i].length; j++){
                        System.out.printf("%c ", mat[i][j]);
                    }
                    System.out.println();
                }

                for(int i = 0; i < mat.length; i++){
                    if(mat[i][0] == escolhaJogador2 && mat[i][1] == escolhaJogador2 && mat[i][2] == escolhaJogador2){       //analisa se ganhou na horizontal
                        continuaJogo = false;
                    }
                    if(mat[0][i] == escolhaJogador2 && mat[1][i] == escolhaJogador2 && mat[2][i] == escolhaJogador2){       //analisa se ganhou na vertical
                        continuaJogo = false;
                    }
                    if(mat[0][0] == escolhaJogador2 && mat[1][1] == escolhaJogador2 && mat[2][2] == escolhaJogador2){       //analisa se ganhou na diagonal principal
                        continuaJogo = false;
                    }
                    if(mat[0][2] == escolhaJogador2 && mat[1][1] == escolhaJogador2 && mat[2][0] == escolhaJogador2){       //analisa se ganhou na diagonal secundaria
                        continuaJogo = false;
                    }
                }

                if(continuaJogo == false){
                    System.out.println("Jogador 2 venceu!");
                }

                vez = 1;
            }
            //verifica se deu velha
            boolean empatou = true;
            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat[i].length; j++){
                    if(mat[i][j] != escolhaJogador1 && mat[i][j] != escolhaJogador2){
                        empatou = false;
                    }
                }
            }
            if(empatou){
                System.out.println("Deu velha!");
                continuaJogo = false;
            }

        }while(continuaJogo);
        sc.close();
    }
}
