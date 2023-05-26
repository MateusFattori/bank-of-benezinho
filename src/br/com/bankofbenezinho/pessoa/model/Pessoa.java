package br.com.bankofbenezinho.pessoa.model;

public abstract class Pessoa {

    private String nome;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + getNome() + '\'' +
                '}';
    }
}
