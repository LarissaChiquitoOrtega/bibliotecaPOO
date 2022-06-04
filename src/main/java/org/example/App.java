package org.example;

import org.example.dominios.Aluno;
import org.example.dominios.Init;
import org.example.dominios.Livro;
import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;
import org.example.telas.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //inicialização de elementos para facilitar os testes
        Init.executar();

        System.out.println("----------------------------- Projeto Biblioteca -  Grupo 04 ---------------------------- \t");
        System.out.println("Andressa Raffler - Gabriela Coelho - Isabella Barra - Larissa Ortega - Marthina de Castro \t");

        Scanner sc = new Scanner(System.in);
        int option;

        //menu principal
        do {
            System.out.println("----------- Biblioteca Livrão -----------");
            System.out.println("O que deseja realizar?");
            System.out.println("1 - Cadastrar um livro");
            System.out.println("2 - Cadastar aluno");
            System.out.println("3 - Realizar empréstimo");
            System.out.println("4 - Realizar devolução");
            System.out.println("5 - Consultar livro por ISBN");
            System.out.println("6 - Consultar aluno");
            System.out.println("6 - Relatório de empréstimos");
            System.out.println("0 - Sair");

            option = sc.nextInt();

            switch (option) {
                case 0:
                    System.out.println("Saindo...");
                    System.exit(1);
                case 1:
                    Livro livro = CriarLivro.executar(sc);
                    LivroRepository.addLivro(livro);
                    break;
                case 2:
                    Aluno aluno = InputDadosAluno.executar(sc);
                    AlunosRepository.gravarAlunoRepositorio(aluno);
                    break;
                case 3:
                    TelaRealizarEmprestimo.executar(sc);
                    break;
                case 4:
                    //devolucao
                    break;
                case 5:
                    TelaBuscarLivro.executar(sc);
                    break;
                case 6:
                    aluno = TelaBuscarAluno.executar(sc);
                    System.out.println(aluno.toString());
                    break;
                default:
                    System.out.println("Opção inválida! \n Escolha uma das opções demonstradas no menu inicial!");
            }
        }while(option != 0);

    }
}