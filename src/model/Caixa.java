package model;

public class Caixa extends Funcionario {
    public Caixa(int id, String nome) {
        super(id, nome);
    }

    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado por " + nome);
    }
}