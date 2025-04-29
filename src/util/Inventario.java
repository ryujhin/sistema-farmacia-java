package util;

import model.Medicamento;
import java.util.HashMap;

public class Inventario {
    private HashMap<String, Medicamento> estoque = new HashMap<>();

    public void adicionarMedicamento(Medicamento m) {
        estoque.put(m.getNome(), m);
    }

    public Medicamento buscar(String nome) {
        return estoque.get(nome);
    }
}