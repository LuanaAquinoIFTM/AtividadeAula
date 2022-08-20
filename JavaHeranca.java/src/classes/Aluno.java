package classes;
public class Aluno extends Pessoa {

  
    private String matricula;
    private String curso;

    public Aluno() {
    }

    public Aluno(String nome, int idade, char sexo, String matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }



    public void fazerAniversario(){
        this.idade++;
        System.out.println("Parabéns " + this.nome + " pelo seu aniversário de " + this.idade +
        " anos de idade. Felicidades!!!✨🎇🍰🎂❤❤❤❤❤💗💗💗💗");
    }

    public void cancelarMatricula(){
        System.out.println("Sua matricula foi cancelada.");
        this.curso = "";
        this.matricula = "";
    }

    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
