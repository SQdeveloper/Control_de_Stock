package com.alura.jdbc.controller;

import com.alura.jdbc.dao.categoryDAO;
import com.alura.jdbc.models.Category;
import java.util.ArrayList;
import java.util.List;

public class CategoriaController {

    private categoryDAO categorydao;

    public CategoriaController() {
        this.categorydao = new categoryDAO();
    }

    public List<Category> listar() {		
        return categorydao.toList();
    }

    public List<?> cargaReporte() {
        // TODO
        return new ArrayList<>();
    }

}
