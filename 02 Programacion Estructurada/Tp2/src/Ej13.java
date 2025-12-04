/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lucia
 */

/**
Ej 13) Impresión recursiva de arrays antes y después de modificar un elemento.
    Crea un programa que:
    a. Declare e inicialice un array con los precios de algunos productos.
    b. Use una función recursiva para mostrar los precios originales.
    c. Modifique el precio de un producto específico.
    d. Use otra función recursiva para mostrar los valores modificados.
 
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // Se llama a la función y se muestran los precios originales
        System.out.println("Precios originales:");
        mostrarPreciosConRecursion(precios, 0);
        
        // Modificación del precio, posición 2
        precios [2] = 129.99;
        
        //Se llama a la funcion y se muestran los precios modificados
        System.out.println("Precios modificados:");
        mostrarPreciosConRecursionActualizado(precios, 0);
        
    }
        
    // Función recursiva para mostrar precios originales
    public static void mostrarPreciosConRecursion(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarPreciosConRecursion(precios, indice + 1);
        }
    }
        
    // Función recursiva para mostrar precios actualizados
    public static void mostrarPreciosConRecursionActualizado(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarPreciosConRecursionActualizado(precios, indice + 1);
        }
    }
}
    
    

