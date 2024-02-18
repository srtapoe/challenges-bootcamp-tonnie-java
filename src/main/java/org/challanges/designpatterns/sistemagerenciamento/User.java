package org.challanges.designpatterns.sistemagerenciamento;

public class User {

    private static int nextId = 1;
    private int id;
    private String nome;

    public User() {
    }

    User(String nome) {
        this.id = nextId++;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
