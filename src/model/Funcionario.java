package model;

public abstract class Funcionario {
    protected int funcionarioId;
    protected String nome;

    public Funcionario(int id, String nome) {
        this.funcionarioId = id;
        this.nome = nome;
    }

    public int getFuncionarioId() { return funcionarioId; }
    public String getNome() { return nome; }
}