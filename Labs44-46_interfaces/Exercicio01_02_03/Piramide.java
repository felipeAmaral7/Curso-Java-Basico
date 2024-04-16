package exercicio02;

public class Piramide extends Figura3D implements DimensaoVolumetrica{
    private double base;
    private double altura;
    private double area;

    public Piramide(String nome, String cor, double base, double altura) {
        super(nome, cor);
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double calcularVolume() {
        double area = this.getBase() * this.getAltura() * 1 / 3;
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
