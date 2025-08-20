
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lucia
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String nombre;
    int edad;
        
    System.out.print("Ingrese su nombre: ");
    nombre = input.nextLine();
    System.out.print("Ingrese su edad: ");
    edad = Integer.parseInt(input.nextLine());
        
    System.out.println("\nNombre: " + nombre);
    System.out.println("Edad: " + edad);
    }
    
}
