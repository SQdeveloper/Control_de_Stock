/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.jdbc.dao;

import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.models.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class ProductoDAO {
    
    public List<Producto> toList() {
        final Connection con = new ConnectionFactory().createConnection();
        List<Producto> productsList = new ArrayList();
               
        try(con) {
            Statement statement = con.createStatement();

            try(statement) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM PRODUCTS");
                
                try(resultSet) {
                    while(resultSet.next()) {
                        Producto producto = new Producto(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("description"), resultSet.getInt("amount"));
                        productsList.add(producto);
                    }
                }
            }
            
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
        return  productsList;
    }
    
    public void save(Producto producto) {
        Connection con = new ConnectionFactory().createConnection();
        
        try(con) {
            PreparedStatement statement = con.prepareStatement(
                "INSERT INTO PRODUCTS (name, description, amount, id_category) values (?, ?, ?, ?)"
            );
            
            try(statement) {                
                statement.setString(1, producto.getName());
                statement.setString(2, producto.getDescription());
                statement.setInt(3, producto.getAmount());
                statement.setInt(4, producto.getId_category());
                
                statement.execute();                            
            }
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void delete(int id) {
        Connection con = new ConnectionFactory().createConnection();
        
        try(con) {
            Statement statement = con.createStatement();
            try(statement) {
                statement.execute("DELETE FROM PRODUCTS WHERE ID=" + id);
            }
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
