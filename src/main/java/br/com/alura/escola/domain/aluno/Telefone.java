package br.com.alura.escola.domain.aluno;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero){
        if((ddd == null || ddd.matches("^\\(\\d{3}\\) \\d{3}-\\d{4}$")) || (numero == null && numero.matches("^[2-9]{1}\\d{7,8}$\n"))){
            throw new IllegalArgumentException();
        }

        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
