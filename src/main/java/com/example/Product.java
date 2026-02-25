package com.example;

public class Product {
    private String name;
    private String category;
    private double price;
    private int stock;

    // Constructor por defecto
    public Product() {
        this.name = "Desconocido";
        this.category = "General";
        this.price = 0.0;
        this.stock = 0;
    }

    // Constructor parametrizado
    public Product(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    // Getters
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setCategory(String category) { this.category = category; }
    public void setPrice(double price) { this.price = price; }
    public void setStock(int stock) { this.stock = stock; }

    // toString sobrescrito
    @Override
    public String toString() {
        return "Product [name=" + name + ", category=" + category + ", price=" + price + ", stock=" + stock + "]";
    }
}