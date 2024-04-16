package exercicio02;
import java.lang.Math;

public class Cilindro extends Figura3D implements DimensaoVolumetrica{

    private final double pi = 3.14;
    private double altura;
    private double raio;
    private double area;

    public Cilindro(String nome, String cor, double altura, double raio) {
        super(nome, cor);
        this.altura = altura;
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double calcularVolume() {
        double area = pi * Math.pow(this.getRaio(), 2) * this.getAltura();
        this.setArea(area);

        return this.getArea();
    }
    
    @Override
    public String toString() {
        String s = super.toString();
        s += "Volume: " + this.getArea();
        return s;
    }
}
