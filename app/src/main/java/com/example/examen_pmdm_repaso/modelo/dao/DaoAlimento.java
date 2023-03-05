package com.example.examen_pmdm_repaso.modelo.dao;

import com.example.examen_pmdm_repaso.modelo.Alimento;

import java.util.ArrayList;
import java.util.List;

public class DaoAlimento {

    private List<Alimento> listaAlimentos = new ArrayList<>();

    public DaoAlimento() {
        listaAlimentos.add(new Alimento("platano", 12f));
        listaAlimentos.add(new Alimento("manzana", 13f));
        listaAlimentos.add(new Alimento("naranja", 14f));
    }

    // Obtiene todos los alimentos
    public List<Alimento> getAll() {
        return listaAlimentos;
    }

    // Añade un alimento
    public void addAlimento(Alimento a) {
        listaAlimentos.add(a);
    }
}
