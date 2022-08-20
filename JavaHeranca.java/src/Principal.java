import classes.Aluno;
import classes.Pedagoga;
import classes.Professor;

public class Principal {

    public static void main(String[] args) {
        Aluno a = new Aluno("Pedro", 17, 'M', "12345678", "Técnico em Informática");

        Professor p = new Professor("Andre", 36, 'M', "Programacao", 100000);

        Pedagoga pe = new Pedagoga("Maria", 25, 'F', "Setor Pedagogico", "Tecnico em Informatica");

        a.fazerAniversario();
        p.fazerAniversario();
        System.out.println("Salario do professor e: " + p.getSalario());
        p.receberAumento();
        System.out.println("Salario do professor e: " + p.getSalario());
        pe.fazerAniversario();
        pe.mudarTrabalho("Tecnico em Química");
    }
    
}
