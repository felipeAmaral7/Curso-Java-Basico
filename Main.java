package Exercicio01;

public class Main{
    public static void main(String[] args) {
        for( int i = 0; i < 10; i++){
            System.out.printf("%d ",Fibonacci.calculaFinonacci(i));
        }
        System.out.println();
        System.out.println(Fibonacci.calculaFinonacci(1));
    }
}