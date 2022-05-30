package org.example.telas;

import org.example.dominios.Livro;

import java.util.Scanner;

public class CriarLivro {
    public static Livro executar(Scanner scanner){
        System.out.println("---- Cadastro de Livros ----");

        System.out.println("Insira o código ISBN:");
        int isbn = scanner.nextInt();
        System.out.println("Insira o título do livro:");
        String titulo = scanner.next();
        System.out.println("Insira o autor");
        String autor = scanner.next();
        System.out.println("Insira a quantidade de exemplares disponíveis para empréstimo:");
        int qtdExemplares = scanner.nextInt();

        return new Livro(isbn, titulo, autor, qtdExemplares);

    }
}
