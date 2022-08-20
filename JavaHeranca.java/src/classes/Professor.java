package classes;
public class Professor extends Pessoa {
    //extends é herança

    //a classe prof nn tem classes filhas, por isso do private
    private String especialidade;
    private double salario;


    public Professor(String nome, int idade, char sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumento(){
        this.salario = this.salario + (this.salario * 0.1);
    }

    public String getespecialidade() {
        return especialidade;
    }

    public void setespecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
    
   
}
