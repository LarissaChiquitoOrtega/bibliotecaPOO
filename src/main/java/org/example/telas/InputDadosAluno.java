package org.example.telas;

import org.example.dominios.Aluno;

import java.util.Scanner;

public class InputDadosAluno {
    public static Aluno executar(Scanner scanner){

        System.out.println("Insira o nome do aluno:");
        String nome = scanner.next();
        System.out.println("Insira a matrícula:");
        String matricula = scanner.next();

        return new Aluno(nome,matricula);

    }
}
