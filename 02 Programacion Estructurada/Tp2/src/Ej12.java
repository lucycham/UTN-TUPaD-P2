/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lucia
 */

/*
Ej 12) Modificación de un array de precios y visualización de resultados.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Muestre los valores originales de los precios.
c. Modifique el precio de un producto específico.
d. Muestre los valores modificados.
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // Valores originales
        System.out.println("Precios originales:");
        // Se utiliza el for-each para recorrer el array y se muestran los precios originales
        for (double precio : precios) { 
            System.out.println("Precio: $" + precio);

        }
        
        // Modificación del precio del producto de la posición 2
        precios[2] = 129.99;
        
        // Valores modificados
        System.out.println("Precios modificados:");
        // Se utiliza el for-each para recorrer el array y se muestran los precios modificados
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);

        }
 
    }
    
}