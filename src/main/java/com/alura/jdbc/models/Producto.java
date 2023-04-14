/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.jdbc.models;

/**
 *
 * @author PC
 */
public class Producto {
    
    private int id;
    private String name;
    private String description;
    private int amount;
    private int id_category;
    
    public Producto(int id, String name, String description, int amount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.amount = amount;        
    }
    
    public Producto(String name, String description, int amount, int id_category) {
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.id_category = id_category;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getAmount() {
        return amount;
    }

    public int getId_category() {
        return id_category;
    }
}
