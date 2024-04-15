package exercicio03;

public class Mamifero extends Animal{

    private String alimento;

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        String s = super.toString() + "Alimento: " + this.getAlimento();
        return s ;
    }
}
