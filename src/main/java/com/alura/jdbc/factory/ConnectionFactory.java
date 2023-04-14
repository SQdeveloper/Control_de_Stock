/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.jdbc.factory;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.PooledDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author PC
 */
public class ConnectionFactory {
    
    DataSource dataSource;    
    
    public ConnectionFactory() {
        var pooled = new ComboPooledDataSource();        
        pooled.setJdbcUrl("jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC");
        pooled.setUser("root");
        pooled.setPassword("964324188");
        this.dataSource = pooled;
    }
    
    public Connection createConnection() {
        try {
            return dataSource.getConnection();
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
