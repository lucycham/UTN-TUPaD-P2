
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lucia
 */
public class Ej06 {

//--- Contador de Positivos, Negativos y Ceros (for) ---
//  Escribe un programa que pida al usuario ingresar 10 números enteros y
//  cuente cuántos son positivos, negativos y cuántos son ceros.
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int positivos = 0;
            int negativos = 0;
            int ceros = 0;

            System.out.println("--- Contador de Positivos, Negativos y Ceros ---");

            for (int i = 1; i <= 10; i++) {
                System.out.print("Ingresa el número " + i + ": ");
                int numero = scanner.nextInt();

                if (numero > 0) {
                    positivos++; // suma 1 al contador de positivos
                } else if (numero < 0) {
                    negativos++; // suma 1 al contador de negativos
                } else {
                    ceros++; // suma 1 al contador de ceros
                }
            }
            //Resultados
            System.out.println("\n--- Resultados ---");
            System.out.println("Positivos: " + positivos);
            System.out.println("Negativos: " + negativos);
            System.out.println("Ceros: " + ceros);
        }
    }
}
    
