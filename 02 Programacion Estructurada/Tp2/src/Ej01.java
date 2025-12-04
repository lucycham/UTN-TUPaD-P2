
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lucia
 */

public class Ej01 {

      //--- Verificación de Año Bisiesto ---
     // Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. 
    // Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { //Se utiliza try para que scanner se cierre automaticamente al finalizar
            System.out.print("Ingresa un año: ");
            int anio = scanner.nextInt();
            
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                System.out.println(anio + " es un año bisiesto.");
            } else {
                System.out.println(anio + " no es un año bisiesto.");
            }
        }
    }
}
    
