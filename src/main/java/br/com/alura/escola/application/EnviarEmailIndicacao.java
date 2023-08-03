package br.com.alura.escola.application;

import br.com.alura.escola.domain.aluno.Aluno;

public interface EnviarEmailIndicacao {
    void enviarPara(Aluno aluno);
}
