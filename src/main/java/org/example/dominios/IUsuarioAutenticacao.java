package org.example.dominios;

public interface IUsuarioAutenticacao {

    boolean autenticar(String matricula, String senha);

    void setSenha(String senha);
}
