import java.util.Scanner;
class Aluno {

    private String nome;
    private int idade;
    private String curso;
    private String numeroMatricula;


    //construtor padrão
    public Aluno (){
        this.nome = "Sem nome";
        this.idade = 0;
        this.curso = "Sem curso";
        this.numeroMatricula = "Sem matricula";
    }
    //Construtor  personalizado
    public Aluno (String nome, int idade, String curso, String numeroMatricula){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.numeroMatricula = numeroMatricula;
    }



    //Métodos para obter informações do aluno
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getCurso(){
        return curso;
    }

    public String getNumeroMatricula(){
        return numeroMatricula;
    }
}
