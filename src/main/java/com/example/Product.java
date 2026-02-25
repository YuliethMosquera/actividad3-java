package com.example;

public class Product {
    private String id;
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Product(String id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    // Setters
    public void setPrecio(double precio) { this.precio = precio; }
    public void setStock(int stock) { this.stock = stock; }

    // toString
    @Override
    public String toString() {
        return "Producto [ID: " + id +
               ", Nombre: " + nombre +
               ", Precio: " + precio +
               ", Stock: " + stock + "]";
    }
}