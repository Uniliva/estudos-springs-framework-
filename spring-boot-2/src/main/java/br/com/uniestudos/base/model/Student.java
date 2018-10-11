package br.com.uniestudos.base.model;

public class Student {
    private String nome;

    public Student() {
    }

    public Student(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
