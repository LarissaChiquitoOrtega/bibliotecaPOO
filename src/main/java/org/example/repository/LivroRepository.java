package org.example.repository;

import org.example.dominios.Livro;

import java.util.ArrayList;
import java.util.Objects;

public class LivroRepository {

    private LivroRepository() {
    }
    private static ArrayList<Livro> livrosCadastrados;

    public static void addLivro(Livro livro) {
        if(Objects.isNull(livrosCadastrados)) {
           livrosCadastrados = new ArrayList<>();
        }

        livrosCadastrados.add(livro);
    }



    public static Livro procurarLivroISBN(int isbnBusca) {
        for (Livro livroBuscado : livrosCadastrados) {
            int isbn = livroBuscado.getIsbn();
            if(isbn == isbnBusca){
                return livroBuscado;
            }
        }
        return null;
    }


}
