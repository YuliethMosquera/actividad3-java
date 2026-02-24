public class Main {
    public static void main(String[] args) {

        Product p1 = new Product();
        p1.setId("P001");
        p1.setName("Laptop");
        p1.setPrice(2500.50);
        p1.setStock(10);

        Product p2 = new Product("P002", "Mouse", 50.0, 100);

        p2.setPrice(45.99);  

        System.out.println("=== Datos con Getters ===");
        System.out.println("Producto 1 Nombre: " + p1.getName());
        System.out.println("Producto 1 Precio: " + p1.getPrice());

        System.out.println("Producto 2 Nombre: " + p2.getName());
        System.out.println("Producto 2 Stock: " + p2.getStock());

        System.out.println("\n=== Datos completos ===");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}