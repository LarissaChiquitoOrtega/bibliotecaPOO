package org.example.dominios;

public abstract class Usuario  {
    protected String nome;
    protected String matricula;

    public Usuario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
