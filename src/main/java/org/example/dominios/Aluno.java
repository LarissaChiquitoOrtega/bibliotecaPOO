package org.example.dominios;

public class Aluno extends Usuario implements IUsuarioAutenticacao{
    private final TipoAluno tipoAluno;
    public Aluno(String nome, String matricula, TipoAluno tipoAluno) {
        super(nome, matricula);
        this.tipoAluno = tipoAluno;
    }

    public TipoAluno getTipoAluno() {
        return tipoAluno;
    }

    protected String senha;


    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String matricula, String senha) {
        return true;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nMatricula: " + matricula +
                "\nTipo Aluno: " + tipoAluno.getDescricao() +
                "\nSenha: " + senha;
    }
}
