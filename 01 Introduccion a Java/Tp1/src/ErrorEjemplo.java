
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lucia
 */
public class ErrorEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);// Se cambia Scanner scanner por Scanner input

    System.out.print("Ingresa tu nombre: ");

    String nombre = input.nextLine(); // ERROR. Se cambia scanner.nextInt(); por input.nextLine() ya que hay un String

    System.out.println("Hola, " + nombre);


}

}
   
    
