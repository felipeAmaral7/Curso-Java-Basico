package exercicio02;
import java.lang.Math;

public class Cubo extends Figura3D implements DimensaoVolumetrica{
    private double lado;
    private double area;

    public Cubo(String nome, String cor,double lado) {
        super(nome, cor);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double calcularVolume() {
        double area = 6 * Math.pow(this.getLado(), 2);
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
