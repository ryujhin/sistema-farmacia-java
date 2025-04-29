package model.desconto;

import model.Venda;

public interface Desconto {
    void aplicarDesconto(Venda venda);
}