package org.example.telas;

import org.example.dominios.Livro;
import org.example.repository.LivroRepository;

import java.util.Scanner;

public class TelaBuscarLivro {
    public static void executar(Scanner scanner){

        System.out.println("---- Buscando Livro ----");
        System.out.println("Insira o ISBN do livro");
        int isbn = scanner.nextInt();
        Livro livro = LivroRepository.procurarLivroISBN(isbn);

        System.out.println("------ RESULTADO DA BUSCA ------");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("ISBN: " + livro.getIsbn());
    }
}
