package exercicio02;

public class Quadrado extends Figura2D implements DimensaoSuperficial{
    private double lado;
    private double area;

    public Quadrado(String nome, String cor, double lado) {
        super(nome, cor);
        this.lado = lado;
    }
    
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        this.setArea(this.getLado() * this.getLado());
        return this.getArea();
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "Area: " + this.getArea();
        return s;
    }

   
}
