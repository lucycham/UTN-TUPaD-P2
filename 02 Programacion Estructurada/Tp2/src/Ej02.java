
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author lucia
 */
public class Ej02 {

    //--- Determinar el Mayor de Tres Números ---
    // Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { //Se utiliza try para que scanner se cierre automaticamente al finalizar
            System.out.print("Ingrese el primer número: ");
            int num1 = scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();
            System.out.print("Ingrese el tercer número: ");
            int num3 = scanner.nextInt();

            if (num1 > num2 && num1 > num2) {
                System.out.println("El mayor es: " + num1);
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("El mayor es: " + num2);
            } else {
                System.out.println("El mayor es: " + num3);
            }
        }
    }
}
