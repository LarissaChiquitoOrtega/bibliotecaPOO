package org.example.dominios;

public class Bibliotecario extends Usuario implements IUsuarioAutenticacao{
    protected String senha;

    public Bibliotecario(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String matricula, String senha) {
        return true;
    }

}
