package exercicio02;

public class FiguraGeometrica {
    private String nome;
    private String cor;

    public FiguraGeometrica(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        String s = "Nome: " + this.getNome() + "\ncor: " + this.getCor() + "\n";
        return s;
    }
    
}
