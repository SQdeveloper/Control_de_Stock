/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.jdbc.dao;

import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.models.Category;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class categoryDAO {
    public List<Category> toList() {
        Connection con = new ConnectionFactory().createConnection();
        List<Category> categoryList = new ArrayList();
        
        try(con) {
            Statement statement = con.createStatement();
            
            try(statement) {
                ResultSet resultSet = statement.executeQuery("SELECT * FROM CATEGORY");
                
                try(resultSet) {
                    while(resultSet.next()) {
                        Category category = new Category(resultSet.getInt("id"), resultSet.getString("name"));
                        categoryList.add(category);                        
                    }
                }
            }
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
        
        return categoryList;
    }
}
