package exercicio03;

public class Main {
    public static void main(String[] args) {

System.out.println("MY ZOOLOGICO");
imprimeLinhas('-', 50);

        //animal generico
        Animal animal = new Animal();

        animal.setNome("Camelo");
        animal.setCor("Amarelo");
        animal.setNumeroPatas(4);
        animal.setAmbiente("Terra");
        animal.setComprimento(150);
        animal.setVelocidade(2.0);
        System.out.println(animal);
        imprimeLinhas('-', 50);

        //peixe
        Peixe tubarao = new Peixe();

        tubarao.setNome("Tubarao");
        tubarao.setCor("Cinzento");
        tubarao.setNumeroPatas(0);
        tubarao.setAmbiente("Mar");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);
        tubarao.setCaracteristicas("Barbatanas e cauda");
        System.out.println(tubarao);
        imprimeLinhas('-', 50);

        //mamifero
        Mamifero mamifero = new Mamifero();
        mamifero.setNome("Urso-do-canadá");
        mamifero.setCor("Vermelho");
        mamifero.setNumeroPatas(4);
        mamifero.setAmbiente("Terra");
        mamifero.setComprimento(180);
        mamifero.setVelocidade(0.5);
        mamifero.setAlimento("Mel");
        System.out.println(mamifero);
        imprimeLinhas('-', 50);
    }

    public static void imprimeLinhas(char c, int tam){
        for(int i = 0; i < tam; i++){
            System.out.printf("%c", c);
        }
        System.out.println();
    }
}
