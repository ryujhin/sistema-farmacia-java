package model;

public class Gerente extends Caixa {
    public Gerente(int id, String nome) {
        super(id, nome);
    }

    public void aplicarDesconto(Venda venda, double percentual) {
        venda.aplicarDesconto(percentual);
    }
}