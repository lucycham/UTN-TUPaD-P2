/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lucia
 */
/*

Ej 11) Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
método calcularDescuentoEspecial(double precio) que use la variable global para
calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena
el valor del descuento y muestra el precio final con descuento.
 */
public class Ej11 {

    static double descuentoEspecial = 0.10; //Variable global

    // Método para calcular el descuento
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuentoEspecial;
        double precioFinal = precio - descuentoAplicado;
        
        // Resultados de descuento y precio final con redondeo de decimales a dos dígitos
        System.out.print("Descuento aplicado: $" + String.format("%.2f\n", descuentoAplicado));
        System.out.print("Precio final con descuento: $" + String.format("%.2f\n", precioFinal));

    }

    public static void main(String[] args) {
        double precioProducto = 1100.00; // Ingreso un valor fijo
        
        // Se muestra el precio original con redondeo de decimales a dos dígitos)
        System.out.print("Precio original: $" + String.format("%.2f\n", precioProducto));
        
        // Se llama al método
        calcularDescuentoEspecial(precioProducto);
    }
}
