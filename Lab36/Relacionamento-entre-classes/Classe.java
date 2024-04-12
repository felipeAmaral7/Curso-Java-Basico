package Exercicio02;

public class Classe {
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] Alunos;

    Classe(){

    }
    Classe(String nome, String horario){
        this.setNome(nome);
        this.setHorario(horario);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Aluno[] getAlunos() {
        return Alunos;
    }
    public void setAlunos(Aluno[] alunos) {
        Alunos = alunos;
    }
}
