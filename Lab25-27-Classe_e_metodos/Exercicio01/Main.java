package Exercicio01;

public class Main {
    public static void main(String[] args) {
    
        Lampada lamp = new Lampada();

        lamp.verEstadoDaLampada();

        lamp.ligarLampada();
        lamp.verEstadoDaLampada();
        lamp.desligarLampada();
        lamp.verEstadoDaLampada();
    }
}
