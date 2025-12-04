
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author lucia
 */
/**
 * Ej 10) Actualización de stock a partir de venta y recepción de productos.
 * Crea un método actualizarStock(int stockActual, int cantidadVendida, int
 * cantidadRecibida), que calcule el nuevo stock después de una venta y
 * recepción de productos:
 *
 * NuevoStock = StockActual − CantidadVendida + CantidadRecibida 
 * NuevoStock = CantidadVendida + CantidadRecibida
 *
 * Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
 * cantidad recibida, y muestra el stock actualizado.
 *
 */
public class Ej10 {

    // Método actualización de stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    //Inicialización de variables
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int stockActual = 0;
            int cantidadVendida = 0;
            int cantidadRecibida = 0;
            
            // Validar stock actual ≥ 0 y entrada válida
            while (true) {
                System.out.print("Ingrese el stock actual: ");
                if (scanner.hasNextInt()) {
                    stockActual = scanner.nextInt();
                    if (stockActual >= 0) {
                        break;// Sale del bucle por ser valor mayor o igual a cero
                    } else {
                        System.out.println("El stock no puede ser negativo.");
                    }
                } else {
                    System.out.println("Entrada inválida. Debe ingresar un número entero");
                    scanner.next(); 
                }
            }
            
            // Validar cantidad vendida ≥ 0 y ≤ stockActual
            while (true) {
                System.out.print("Ingrese la cantidad vendida: ");
                if (scanner.hasNextInt()) { // verifica que el num sea int
                    cantidadVendida = scanner.nextInt();
                    if (cantidadVendida >= 0 && cantidadVendida <= stockActual) {
                        break;// Sale del bucle por cumplir la condición
                    } else {
                        System.out.println("La cantidad vendida debe ser entre 0 y " + stockActual);
                    }
                } else {
                    System.out.println("Entrada inválida. Debe ingresar un número entero.");
                    scanner.next();
                }
            }
            
            // Validar cantidad recibida ≥ 0
            while (true) {
                System.out.print("Ingrese la cantidad recibida: ");
                if (scanner.hasNextInt()) { //Verifica que el num sea int
                    cantidadRecibida = scanner.nextInt();
                    if (cantidadRecibida >= 0) {
                        break; // Sale del bucle si es mayor o igual a cero
                    } else {
                        System.out.println("La cantidad recibida no puede ser negativa.");
                    }
                } else {
                    System.out.println("Entrada inválida. Debe ingresar un número entero.");
                    scanner.next();
                }
            }
            
            // Cálculo del nuevo stock
            int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
            
            // Resultado
            System.out.println("El stock actualizado es: " + nuevoStock);
        }
    }
}