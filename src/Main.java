import model.*;
import model.desconto.*;
import util.Inventario;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Medicamento m1 = new Medicamento("123", "Paracetamol", 10.5, 100, "2025-12-31");
        Medicamento m2 = new Medicamento("456", "Ibuprofeno", 15.0, 50, "2024-08-15");
        inventario.adicionarMedicamento(m1);
        inventario.adicionarMedicamento(m2);

        Cliente cliente = new Cliente(1, "João da Silva", "123.456.789-00");
        Caixa caixa = new Caixa(101, "Maria Caixa");
        Gerente gerente = new Gerente(201, "Carlos Gerente");

        Venda venda = new Venda(1, caixa, cliente);
        venda.adicionarItem(m1, 2);
        venda.adicionarItem(m2, 1);
        venda.calcularTotal();

        System.out.println("\n--- Venda Inicial ---");
        System.out.println(venda);

        Desconto d1 = new DescontoParaClienteRegistrado();
        Desconto d2 = new DescontoParaGerente(gerente, 10.0);

        d1.aplicarDesconto(venda);
        d2.aplicarDesconto(venda);

        System.out.println("\n--- Venda com Descontos ---");
        System.out.println(venda);
    }
}