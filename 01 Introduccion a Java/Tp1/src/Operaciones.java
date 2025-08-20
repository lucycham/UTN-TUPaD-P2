
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lucia
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int Suma;
        int Resta;
        int Multiplicacion;
        double Division;
        
        System.out.println("Ingrese un número entero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese otro número entero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        Suma = num1 + num2;
        Resta = num1 - num2;
        Multiplicacion = num1 * num2;
        Division = (double)num1 / num2;
        
        System.out.println("\nSuma: "+num1+ "+" + num2+ "= " +Suma);
        System.out.println("Resta: "+num1+ "-" + num2+ "= " +Resta);
        System.out.println("Multiplicación: "+num1+ "x" + num2+ "= " +Multiplicacion);
        System.out.println("División: "+num1+ "/" + num2+ "= " +Division);
    }
    
}
