package br.com.alura.escola.domain.aluno;

public class Email {

    private String endereco;

    public Email(String endereco) {
        if(endereco== null || !endereco.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
            throw new IllegalArgumentException("E-mail invalido");
        }
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
