package org.example.dominios;

public class Livro {
    private int isbn;
    private String titulo;
    private String autor;

    private int quantidadeExemplar;

    private int exemplaresDisponiveis;


    public Livro() {
    }
    public Livro(int isbn, String titulo, String autor, int quantidadeExemplar) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeExemplar = quantidadeExemplar;
        this.exemplaresDisponiveis = quantidadeExemplar;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidadeExemplar() {
        return quantidadeExemplar;
    }

    public void setQuantidadeExemplar(int quantidadeExemplar) {
        this.quantidadeExemplar = quantidadeExemplar;
    }

    public int getExemplaresDisponiveis() {
        return exemplaresDisponiveis;
    }

    public void setExemplaresDisponiveis(int exemplaresDisponiveis) {
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public void verificarDisponibilidade(){
        //TODO
    }
}
