/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;
import java.util.Scanner;
/**
 *
 * @author utpl
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        double num1;
        double num2;
        double resultado;
        String operacion;
 
        System.out.println("Ingrese el primer número");
        num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextDouble();
        System.out.println("Ingrese la operación");
        operacion = leer.nextLine();
    }
    
}
