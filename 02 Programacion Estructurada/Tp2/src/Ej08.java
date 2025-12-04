
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author lucia
 */
public class Ej08 {

    /*  --- Cálculo del Precio Final con impuesto y descuento ---
*   Crea un método calcularPrecioFinal(double impuesto, double
*   descuento) que calcule el precio final de un producto en un e-commerce. La
*   fórmula es:
*
*   PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
*   PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \timesDescuento)
*
*   Desde main(), solicita el precio base del producto, el porcentaje de
*   impuesto y el porcentaje de descuento, llama al método y muestra el precio final.
     */
    static double precioBase; //Variable global accesible para el método y main()

    // Método con la fórmula    
    public static double calcularPrecioFinal(double impuesto, double descuento) {

        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }

    //Main, se solicita los datos al usuario
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        precioBase = scanner.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (por ejemplo, 10 para 10%): ");
        double impuestoPorcentaje = scanner.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (por ejemplo, 5 para 5%): ");
        double descuentoPorcentaje = scanner.nextDouble();

        // Se convierten los porcentajes a decimales
        double impuesto = impuestoPorcentaje / 100.0;
        double descuento = descuentoPorcentaje / 100.0;

        // Cálculo del precio final, se llama al método
        double precioFinal = calcularPrecioFinal(impuesto, descuento);

        // Resultado con redondeo de dos decimales
        System.out.print("El precio final del producto es: $ " + String.format("%.2f\n",precioFinal));

    }

}
