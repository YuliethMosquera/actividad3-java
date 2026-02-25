## 🧩 Descripción

El programa crea objetos de la clase `Product` utilizando:

- ✔ Constructor por defecto  
- ✔ Constructor parametrizado  
- ✔ Métodos *setter* para modificar atributos  
- ✔ Métodos *getter* para obtener valores  

---

## ⚙️ Requisitos

- Java JDK 8 o superior  
- Terminal o consola  
- Editor como Visual Studio Code  

Verificar instalación:

```bash
java -version
javac -version

## Cómo compilar y ejecutar

### 1Compilar el programa
```bash
javac -d bin src/main/java/com/example/*.java

## 2ejecutar el proyecto
java -cp bin com.example.Main

## 3 Agregar ejemplo de salida esperada

Producto 1: Nombre=Laptop, Precio=1500.0, Stock=5
Producto 2: Nombre=Mouse, Precio=55.0, Stock=20

Detalles completos:
Product [name=Laptop, category=Electrónica, price=1500.0, stock=5]
Product [name=Mouse, category=Accesorio, price=55.0, stock=20]
