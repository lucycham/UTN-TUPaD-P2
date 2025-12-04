
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author lucia
 */
public class Ej09 {

    /**
     * Composición de funciones para calcular costo de envío y total de compra.
 a.calcularCostoEnvio(double peso, String zona): Calcula el costo de
 envío basado en la zona de envío (Nacional o Internacional) y el peso del
 paquete.Nacional: $5 por kg Internacional: $10 por kg

 b. calcularTotalCompra(double precioProducto, double costoEnvio): Usa
 calcularCostoEnvio para sumar el costo del producto con el costo de
 envío.

 Desde main(), solicita el peso del paquete, la zona de envío y el precio
 del producto. Luego, muestra el total a pagar.
     
     * @param peso
     * @param zona
     * @return 
     */
    
    
    // Función para cálculo de costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg;

        if (zona.equalsIgnoreCase("Nacional")) {
            costoPorKg = 5.0;
        } else { 
            costoPorKg = 10.0;
        }

        return peso * costoPorKg;

    }
    //Función para cálculo del total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    // Inicialización de variables
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precioProducto = 0;
        double peso = 0;
        String zona;
      
        // Ingreso precio del producto y validación de entrada
        while (true) {
            System.out.print("Ingrese el precio del producto: ");
            if (scanner.hasNextDouble()) { // Verificación de que sea num double
                precioProducto = scanner.nextDouble();
                if (precioProducto > 0) {
                    break; // Finaliza si es mayor a cero
                } else {
                    System.out.println("El precio debe ser mayor que cero.");
                }
            } else {
                System.out.println("Entrada no válida. Debe ingresar un número.");
                scanner.next();
            }
        }

        // Ingreso peso del paquete
        while (true) {
            System.out.print("Ingrese el peso del paquete (en kg): ");
            if (scanner.hasNextDouble()) { // Verificación de que sea un num double
                peso = scanner.nextDouble();
                if (peso > 0) {
                    break;// Finaliza si es mayor a cero
                } else {
                    System.out.println("El peso debe ser mayor que cero.");
                }
            } else {
                System.out.println("Entrada no válida. Debe ingresar un número.");
                scanner.next(); 
            }
        }
        
        scanner.nextLine(); // salto
        
        // Ingreso de zona 
        while (true) {
            System.out.print("Ingrese la zona de envío (Nacional o Internacional): ");
            zona = scanner.nextLine();

            if (zona.equalsIgnoreCase("Nacional") || zona.equalsIgnoreCase("Internacional")) {
                break; // zona válida, sale del bucle
            } else {
                System.out.println("Zona no válida. Intente de nuevo.");
            }
        }

        // Cálculo costo de envío
        double costoEnvio = calcularCostoEnvio(peso, zona);

        // Cálculo total de la compra
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        // Resultados con redondeo de dos decimales
        System.out.printf("Costo de envío: $ %.2f\n", costoEnvio);
        System.out.printf("Total a pagar: $ %.2f\n", total);

    }

}
