package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class Main {

    public static void main(String[] args) {
        String nome = "Fulano da silva";
        String cpf = "338.074.808-03";
        String email = "fulano@email.com";

        RepositorioDeAlunos repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno matricularAluno = new MatricularAluno(repositorio);
        matricularAluno.executa(new MatricularAlunoDTO(nome, cpf, email));
    }
}
