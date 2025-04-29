package model;

public class Medicamento {
    private String id;
    private String nome;
    private double preco;
    private int quantidade;
    private String dataValidade;

    public Medicamento(String id, String nome, double preco, int quantidade, String dataValidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }
    public void reduzirQuantidade(int q) { this.quantidade -= q; }

    @Override
    public String toString() {
        return "Medicamento: Nome=" + nome + ", Preço=" + preco + ", Quantidade=" + quantidade + ", ID=" + id + ", Validade=" + dataValidade;
    }
}