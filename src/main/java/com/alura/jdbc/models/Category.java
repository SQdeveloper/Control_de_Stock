/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.jdbc.models;

/**
 *
 * @author PC
 */
public class Category {
    
    int id;
    String name;
    
    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    @Override
    
    public String toString() {
        return this.name;
    }
}
