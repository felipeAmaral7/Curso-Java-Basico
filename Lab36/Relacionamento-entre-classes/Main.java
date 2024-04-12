package Exercicio02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem-vindo a nossa classe!");

        System.out.println("Digite o nome do curso: ");
        String cursoName = sc.nextLine();

        System.out.println("Digite o horario do curso: ");
        String horarioCurso = sc.nextLine();

        Classe classe = new Classe(cursoName, horarioCurso);

        Aluno[] alunos = new Aluno[5];

        for(int i = 0; i < 3; i++){
            System.out.printf("-----ALUNO %d -----\n", (i + 1));
            Aluno alun = new Aluno();

            alun.lerAluno(sc);
            alunos[i] = alun;
        }
        classe.setAlunos(alunos);

        double mediaClasse = 0;
        System.out.printf("\n");
        System.out.println("Classe: " + classe.getNome());
        for(int i = 0; i < 3; i++){
            mediaClasse += classe.getAlunos()[i].imprimirMedia();
            System.out.println();
        }
        mediaClasse /= 3;
        System.out.printf("A media da classe eh: %.2f\n", mediaClasse);
        sc.close();
    }
}
