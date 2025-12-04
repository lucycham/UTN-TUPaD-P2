
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author lucia
 */
public class Ej07 {

// --- Validación de Nota entre 0 y 10 (do-while) ---
//  Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
//  usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
//  hasta que ingrese un valor válido.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Ingresa una nota entre 0 y 10: ");
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Error, nota inválida. Ingrese una nota entre 0 y 10.\n");
            }

        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente");

    }
}
