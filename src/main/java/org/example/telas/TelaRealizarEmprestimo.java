package org.example.telas;

import org.example.dominios.Aluno;
import org.example.dominios.Emprestimo;
import org.example.dominios.Livro;
import org.example.repository.AlunosRepository;
import org.example.repository.LivroRepository;

import java.util.Scanner;

public class TelaRealizarEmprestimo {
    public static void executar(Scanner scanner){
        System.out.println("Insira a matricula do aluno");
        String matricula = scanner.next();
        System.out.println("Insira o isbn do livro:");
        int isbn = scanner.nextInt();
        try{
            Livro livro = LivroRepository.procurarLivroISBN(isbn);
            Aluno aluno = AlunosRepository.retornarAluno(matricula);
            Emprestimo emprestimo = new Emprestimo(aluno, livro);
            System.out.println(emprestimo.toString());
        }catch(Exception e){
            System.out.println("Dados inválidos! Necessário entrar com matrícula e ISBN cadastrados.");
            executar(scanner);
        }
    }


}
