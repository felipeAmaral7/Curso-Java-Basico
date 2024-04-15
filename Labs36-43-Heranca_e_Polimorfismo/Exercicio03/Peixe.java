package exercicio03;

public class Peixe extends Animal{

    private String caracteristicas;

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "Caracteristicas : " + this.getCaracteristicas() + "\n";
        return s;
    }
}
