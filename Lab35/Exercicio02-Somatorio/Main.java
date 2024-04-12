package Exercicio02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero que voce deseja saber o somatorio: ");
        int num = sc.nextInt();
        
        System.out.printf("\nSomatorio: %d\n", Somatorio.soma(num));
        sc.close();
    }
}
