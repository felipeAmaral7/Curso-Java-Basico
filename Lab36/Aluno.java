package Exercicio02;
import java.util.Scanner;

public class Aluno {
    String name;
    String matricula;
    double []nota;

    Aluno(){

    }
    Aluno(String name, String matricula){
        this.setName(name);
        this.setMatricula(matricula);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double[] getNota() {
        return nota;
    }
    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public double imprimirMedia(){
        System.out.printf("ALUNO: %s\n", this.getName());
        double mediaNotas = 0;
        for(int i = 0; i < 4; i++){
            mediaNotas += this.getNota()[i];
        }
        
        mediaNotas /= 4;
        System.out.printf("Sua media eh de %.2f\n", mediaNotas);
        verificaSePassou(mediaNotas);
        System.out.println();
        
        return mediaNotas;
    }
    public void verificaSePassou(double media){
        if(media >= 7){
            System.out.println("Voce esta aprovado :)");
        }
        else{
            System.out.println("Voce esta reprovado :(");
        }
    }

    public void lerAluno(Scanner sc){
        System.out.println("Digite o nome do aluno: ");
        this.setName(sc.nextLine());
        
        double []nota = new double[4];                  //cria um vetor de notas
        for(int i = 0; i < 4; i++){
            System.out.println("Digite a nota " + (i + 1) + ":");
            nota[i] = sc.nextDouble();                  //acumula no vetor as notas
        }
        sc.nextLine();
        this.setNota(nota);                             //faz o set das notas no objeto
    }
}
