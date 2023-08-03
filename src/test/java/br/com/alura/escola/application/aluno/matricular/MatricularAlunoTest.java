package br.com.alura.escola.application.aluno.matricular;

import br.com.alura.escola.domain.aluno.Aluno;
import br.com.alura.escola.domain.aluno.CPF;
import br.com.alura.escola.domain.aluno.RepositorioDeAlunos;
import br.com.alura.escola.infraestructure.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido(){
        RepositorioDeAlunos repositorioDeAlunos = new RepositorioDeAlunosEmMemoria();
        MatricularAluno matricularAluno = new MatricularAluno(repositorioDeAlunos);

        MatricularAlunoDTO fulano = new MatricularAlunoDTO("Fulano", "123.456.789-00", "fulano@email.com");
        matricularAluno.executa(fulano);

        Aluno found = repositorioDeAlunos.buscarPorCPF(new CPF("123.456.789-00"));

        assertNotNull(found);
        assertEquals("Fulano", found.getNome());
        assertEquals("123.456.789-00", found.getCpf());
        assertEquals("fulano@email.com", found.getEmail());

    }

}