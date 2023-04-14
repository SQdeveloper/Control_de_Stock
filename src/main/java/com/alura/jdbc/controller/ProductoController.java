package com.alura.jdbc.controller;

import com.alura.jdbc.dao.ProductoDAO;
import com.alura.jdbc.models.Producto;
import java.util.ArrayList;
import java.util.List;

public class ProductoController {

    private ProductoDAO productodao;

    public ProductoController() {
        productodao = new ProductoDAO();
    }

    public void modificar(String nombre, String descripcion, Integer id) {
            // TODO
    }

    public void eliminar(Integer id) {
        productodao.delete(id);
    }

    public List<Producto> listar() {	
        return productodao.toList();
    }

    public void guardar(Producto producto) {
        productodao.save(producto);
    }

}
