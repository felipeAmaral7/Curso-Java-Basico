import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor da tabuada: ");
        int valorDaTabuada = ler.nextInt();

        int comeca;
        int termina;

        do{
            System.out.println("Digite qual numero a tabuada comeca: ");
            comeca = ler.nextInt();

            System.out.println("Digite qual numero a tabuada termina: ");
            termina = ler.nextInt();

            if(comeca > termina){
                System.out.println("DIGITE UM NUMERO DE COMECO MENOR QUE O DE FINAL");
            }
        }while(comeca > termina);
        
        for(int i = comeca; i <= termina; i++){
            System.out.printf("%d x %d = %d\n", valorDaTabuada, i, (valorDaTabuada * i));
        }
        ler.close();
    }
}
