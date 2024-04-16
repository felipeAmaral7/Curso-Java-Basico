package exercicio02;

public class Circulo extends Figura2D implements DimensaoSuperficial {
    private final double pi = 3.14;
    private double raio;
    private double area;

    public Circulo(String nome, String cor, double raio) {
        super(nome, cor);
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area = pi * (this.getRaio() * this.getRaio());
        this.setArea(area);
        return this.getArea();
    }
    @Override
    public String toString() {
        String s = super.toString();
        s += "Area: " + this.getArea();
        return s;
    }
}
