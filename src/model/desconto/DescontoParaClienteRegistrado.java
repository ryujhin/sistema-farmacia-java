package model.desconto;

import model.Venda;

public class DescontoParaClienteRegistrado implements Desconto {
    @Override
    public void aplicarDesconto(Venda venda) {
        venda.aplicarDesconto(5.0); // 5% para clientes registrados
    }
}