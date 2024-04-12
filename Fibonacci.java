package Exercicio01;

public class Fibonacci {
    
    protected static int calculaFinonacci(int num){
        if(num < 2){
            return num;
        }
        else{
            return calculaFinonacci(num - 1) + calculaFinonacci(num - 2);
        }
    }

    //0 + 1 = 1
    //1 + 1 = 2
    //2 + 1 = 3
    //3 + 2 = 5
}
