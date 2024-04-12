package Exercicio02;

public class Somatorio {
        
    protected static int soma(int num){
        int resp = 0;
        if(num == 1){
            System.out.printf("%d ", num);
            resp = 1;
        }
        else{
            resp += num + soma(num - 1);
            System.out.printf("%d ", num);
        }
        return resp;
    }
}
