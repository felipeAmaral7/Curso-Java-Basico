package Exercicio01;

public class Contador {
    private static int contador;

    //Contador(){
    //    this.setContador(this.getContador() + 1);
    //}

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Contador.contador = contador;
    }

    public static void incrementar(){
        setContador(getContador() + 1);
    }
    public static void decrementar(){
        setContador(getContador() - 1);
    }
    public static void imprimeContador(){
        System.out.println(getContador());
    }
    public static void zerar(){
        Contador.contador = 0;
    }

}
