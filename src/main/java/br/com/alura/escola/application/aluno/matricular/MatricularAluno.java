package br.com.alura.escola.application.aluno.matricular;

import br.com.alura.escola.domain.aluno.Aluno;
import br.com.alura.escola.domain.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    public void executa(MatricularAlunoDTO dados){
        Aluno novo = dados.criarAluno();
        repositorio.matricular(novo);
    }
}
