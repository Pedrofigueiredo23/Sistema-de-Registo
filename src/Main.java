import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //criar instâncias Alunos
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        boolean continuarPrograma=true;

        while (continuarPrograma) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Criar instâncias de alunos");
            System.out.println("2. Exibir informações do(s) aluno(s)");
            System.out.println("3. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); //Limpar o buffer de entrada porque estava a saltar do scanner.nextInt para o scanner.nextLine e vice versa


            switch (escolha) {
                case 1 -> {
                    System.out.println("Digite o nome do aluno:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a idade do aluno:");
                    int idade = scanner.nextInt();
                    scanner.nextLine();//Limpar o buffer de entrada porque estava a saltar do scanner.nextInt para o scanner.nextLine e vice versa
                    System.out.println("Digite o curso do aluno:");
                    String curso = scanner.nextLine();
                    System.out.println("Digite o numero de matricula do aluno:");
                    String numeroMatricula = scanner.nextLine();

                    // método construtor
                    Aluno aluno = new Aluno(nome, idade, curso, numeroMatricula);
                    System.out.println("Aluno criado com sucesso");
                    listaAlunos.add(aluno);
                }
                case 2 -> {
                    System.out.println("Numero de alunos " + listaAlunos.size());
                    for (Aluno listaAluno : listaAlunos) {

                        System.out.println("Informações do(s) aluno(s):");
                        System.out.println("Nome: " + listaAluno.getNome());
                        System.out.println("Idade: " + listaAluno.getIdade());
                        System.out.println("Curso: " + listaAluno.getCurso());
                        System.out.println("Matricula: " + listaAluno.getNumeroMatricula());
                    }
                }
                case 3 -> {
                    System.out.println("A sair do programa...");
                    continuarPrograma = false;
                }
                default -> System.out.println("Opção inválida.");
            }

            }
        }

    }
