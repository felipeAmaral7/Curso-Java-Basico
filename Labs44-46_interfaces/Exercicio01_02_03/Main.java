package exercicio02;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo("Circulo", "Azul", 5);
        circulo.calcularArea();

        Quadrado quadrado = new Quadrado("Quadrado legal", "Verde",  4);
        quadrado.calcularArea();

        Triangulo triangulo = new Triangulo("Trian", "Rosa", 7,4);
        triangulo.calcularArea();

        Cilindro cilindro = new Cilindro("Cilin", "Roxo", 9, 4.5);
        cilindro.calcularVolume();

        Cubo cubo = new Cubo("Cubo legal", "Preto", 5);
        cubo.calcularVolume();
        
        Piramide piramide = new Piramide("Piran", "Amarelo", 4.5, 8);
        piramide.calcularVolume();

        FiguraGeometrica []figuraGeometrica = new FiguraGeometrica[6];
        figuraGeometrica[0] = circulo;
        figuraGeometrica[1] = quadrado;
        figuraGeometrica[2] = triangulo;
        figuraGeometrica[3] = cilindro;
        figuraGeometrica[4] = cubo;
        figuraGeometrica[5] = piramide;

        for(int i = 0; i < figuraGeometrica.length; i++){

            System.out.println(figuraGeometrica[i]);
            System.out.println("----------------------------------------------------");
        }
    }
}
