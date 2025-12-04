
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author lucia
 */
public class Ej04 {

//  --- Calculadora de Descuento según categoría ---
//  Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
//  Luego, aplique los siguientes descuentos:
//    Categoría A: 10% de descuento
//    Categoría B: 15% de descuento
//    Categoría C: 20% de descuento
//El programa debe mostrar el precio original, el descuento aplicado y el precio final
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();

           
            System.out.print("Ingrese la categoría del producto (A, B o C): ");
            String categoria = scanner.next().toUpperCase(); // Se convierte a mayúscula

            double descuento;
            // se utiliza el switch para las categorias
            switch (categoria) {
                case "A" -> descuento = 0.10;
                case "B" -> descuento = 0.15;
                case "C" -> descuento = 0.20;
                default -> {
                    System.out.println("Categoría inválida.");
                    return;
                }
            }
            
            
            double descuentoAplicado = precio * descuento;
            double precioFinal = precio - descuentoAplicado;

            //Resultados
            System.out.println("\n--- Resultado ---");
            System.out.println("Precio original: $" + precio);
            System.out.println("Descuento aplicado: $" + descuentoAplicado);
            System.out.println("Precio final: $" + precioFinal);
        }
    }
}


