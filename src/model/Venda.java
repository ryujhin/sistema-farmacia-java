package model;

import java.time.LocalDateTime;
import java.util.*;

public class Venda {
    private int vendaId;
    private List<Medicamento> itensVendidos = new ArrayList<>();
    private double valorTotal = 0;
    private LocalDateTime dataHora;
    private Funcionario funcionario;
    private Cliente cliente;

    public Venda(int id, Funcionario funcionario, Cliente cliente) {
        this.vendaId = id;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.dataHora = LocalDateTime.now();
    }

    public void adicionarItem(Medicamento m, int qtd) {
        m.reduzirQuantidade(qtd);
        for (int i = 0; i < qtd; i++) {
            itensVendidos.add(m);
        }
    }

    public void calcularTotal() {
        valorTotal = 0;
        for (Medicamento m : itensVendidos) {
            valorTotal += m.getPreco();
        }
    }

    public void aplicarDesconto(double percentual) {
        valorTotal -= valorTotal * (percentual / 100);
    }

    public double getValorTotal() { return valorTotal; }

    @Override
    public String toString() {
        return "Venda #" + vendaId + " - Total: R$" + valorTotal + " - Data: " + dataHora + "\nItens: " + itensVendidos;
    }
}