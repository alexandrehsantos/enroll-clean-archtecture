package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;

public class AlunoNaoEncontradoException extends RuntimeException {

    private final String message;

    public AlunoNaoEncontradoException(CPF cpf){
        this.message = "Aluno não encontrado cpf: " + cpf.getNumero();
    }

}
