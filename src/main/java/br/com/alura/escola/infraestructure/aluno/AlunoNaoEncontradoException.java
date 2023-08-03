package br.com.alura.escola.infraestructure.aluno;

import br.com.alura.escola.domain.aluno.CPF;

public class AlunoNaoEncontradoException extends RuntimeException {

    private final String message;

    public AlunoNaoEncontradoException(CPF cpf){
        this.message = "Aluno não encontrado cpf: " + cpf.getNumero();
    }

}
