package exercicio02;

public class Triangulo extends Figura2D implements DimensaoSuperficial{
    private double altura;
    private double base;
    private double area;

    public Triangulo(String nome, String cor, double altura, double base) {
        super(nome, cor);
        this.altura = altura;
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }


    @Override
    public double calcularArea() {
        double area = (this.getBase() * this.getAltura()) / 2;
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
