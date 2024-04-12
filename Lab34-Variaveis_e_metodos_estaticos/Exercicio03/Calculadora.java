package Exercicio03;
import java.lang.Math;

public class Calculadora {

    public static double soma(double num1, double num2){
        return num1 + num2;
    }

    public static double subtrai(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplica(double num1, double num2){
        return num1 * num2;
    }

    public static double divide(double num1, double num2){
        return num1 / num2;
    }

    public static double potencia(double num1, int n){
        return Math.pow(num1, n);
    }

    public static int fatorial(int num){

        int valor = 1;
        for(int i = 1; i < num; i++){
            valor *= i;
        }

        /*for(int i = num; i > 0; i--){
            valor *= i;
        }*/

        return valor;
    }
}
