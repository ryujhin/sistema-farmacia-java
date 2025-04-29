package model.desconto;

import model.*;

public class DescontoParaGerente implements Desconto {
    private Gerente gerente;
    private double percentual;

    public DescontoParaGerente(Gerente gerente, double percentual) {
        this.gerente = gerente;
        this.percentual = percentual;
    }

    @Override
    public void aplicarDesconto(Venda venda) {
        gerente.aplicarDesconto(venda, percentual);
    }
}