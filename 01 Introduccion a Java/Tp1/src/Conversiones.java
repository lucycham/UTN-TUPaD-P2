
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lucia
 */
public class Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        double division;
        
        
        System.out.println("Ingrese un número entero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese otro número entero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        division = num1 / num2;
        System.out.println("\nDivisión con resultado sin decimal: "+num1+ "/" + num2+ "= " +division);
        
        division = (double) num1/num2;
        System.out.println("\nDivisión con resultado con decimal: "+num1+ "/" + num2+ "= " +division);
    }
    
}
