package com.example;

public class Main {
    public static void main(String[] args) {
        // Producto con constructor por defecto
        Product p1 = new Product();
        p1.setName("Laptop");
        p1.setCategory("Electrónica");
        p1.setPrice(1500.0);
        p1.setStock(5);

        // Producto con constructor parametrizado
        Product p2 = new Product("Mouse", "Accesorio", 50.0, 20);

        // ✅ Usar setters para ambos objetos
        p1.setPrice(1550.0); // ejemplo: actualizar precio de p1
        p2.setStock(25);      // ✅ actualizar stock de p2

        // Mostrar información usando getters
        System.out.println("Producto 1: Nombre=" + p1.getName() + ", Precio=" + p1.getPrice() + ", Stock=" + p1.getStock());
        System.out.println("Producto 2: Nombre=" + p2.getName() + ", Precio=" + p2.getPrice() + ", Stock=" + p2.getStock());

        // Mostrar objetos completos usando toString()
        System.out.println("\nDetalles completos:");
        System.out.println(p1);
        System.out.println(p2);
    }
}