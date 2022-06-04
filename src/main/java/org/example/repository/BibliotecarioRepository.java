package org.example.repository;

import org.example.dominios.Bibliotecario;

import java.util.HashSet;
import java.util.Objects;

public class BibliotecarioRepository {
    private static HashSet<Bibliotecario> bibliotecariosCadastrados;

    private BibliotecarioRepository() {
    }
    public static void gravarBibliotecarioRepositorio(Bibliotecario bibliotecario) {
        if(Objects.isNull(bibliotecariosCadastrados)) {
            bibliotecariosCadastrados = new HashSet<Bibliotecario>();
        }
        bibliotecariosCadastrados.add(bibliotecario);
    }
    
    public static Bibliotecario retornarBibliotecario(String matricula){
        for (Bibliotecario bibliotecarioCadastrado : bibliotecariosCadastrados) {
            if(bibliotecarioCadastrado.getMatricula().equals(matricula)){
                return bibliotecarioCadastrado;
            }
        }
        return null;
    }
}
