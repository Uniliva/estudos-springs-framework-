package br.com.uniestudos.base.model;

public class Aluno {
    private String nome;

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome) {
        this.nome = nome;
    }
}
