package br.com.alura.escola;

import static org.junit.jupiter.api.Assertions.assertThrows;

import br.com.alura.escola.domain.aluno.Email;
import org.junit.jupiter.api.Test;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos(){
        assertThrows(IllegalStateException.class, ()-> new Email(null));
        assertThrows(IllegalStateException.class, ()-> new Email(""));
        assertThrows(IllegalStateException.class, ()-> new Email("emailInvlido"));
    }

}