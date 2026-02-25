package com.example;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("P001", "Laptop", 2500.5, 10);
        Product p2 = new Product("P002", "Mouse", 50.0, 100);

        System.out.println("Producto 1:");
        System.out.println(p1);

        System.out.println("\nProducto 2:");
        System.out.println(p2);
    }
}