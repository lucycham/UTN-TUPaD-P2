
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author lucia
 */
public class Ej05 {

//--- Suma de Números Pares (while) ---
//  Escribe un programa que solicite números al usuario y sume solo los
//  números pares. El ciclo debe continuar hasta que el usuario ingrese el número
//  0, momento en el que se debe mostrar la suma total de los pares ingresados.
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            int sumaPares = 0;

            System.out.println("•Ingresa los números (Se sumarán los pares)\n");
           
            while (true) {
                System.out.print("Ingresa un número(0 para finalizar): ");
                numero = scanner.nextInt();

                if (numero == 0) {
                    break; // Termina el ciclo si el usuario ingresa 0
                }

                if (numero % 2 == 0) {
                    sumaPares += numero; // Suma solo si es par
                }
            }

            System.out.println("\nLa suma de los números pares ingresados es: " + sumaPares);
            
        }
    }
}
