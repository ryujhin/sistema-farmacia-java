package model;

public class Cliente {
    private int clienteId;
    private String nome;
    private String cpf;

    public Cliente(int id, String nome, String cpf) {
        this.clienteId = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() { return cpf; }
}