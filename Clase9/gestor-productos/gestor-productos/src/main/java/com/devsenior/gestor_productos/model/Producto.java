package com.devsenior.gestor_productos.model;

public class Producto {

    private int id;
    private String nombre;
    private double precio;


    // Siempre crear constructor vacio en SpringBoot

    public Producto(){
    }

    public Producto(int id, String nombre, double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters
    public int getId(){
        return id;
    }
    public String nombre (){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }

    // Setters

    public void setId(int id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

}
