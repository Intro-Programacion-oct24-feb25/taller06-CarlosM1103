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
        double resultado = 0;
        String operacion;
 
        System.out.println("Ingrese el primer número");
        num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextDouble();
        leer.nextLine();
        System.out.println("Ingrese una de las siguientes operaciones: "
                + "suma, resta, multiplicación, división, módulo, potencia.");
        operacion = leer.nextLine();
        
        operacion = operacion.toLowerCase();
        
        if (num1 > num2){
            switch(operacion){
            case "suma":
                resultado = num1 + num2;
                break;
            case "resta":
                resultado = num1 - num2;
                break;
            case "multiplicación":
            case "multiplicacion":
                resultado = num1 * num2;
                break;
            case "división":
            case "division":
                resultado = num1 / num2;
                break;
            case "módulo":
            case "modulo":
                resultado = num1 % num2;
                break;
            case "potencia":
                resultado = Math.pow(num1, num2);
                break;}
            System.out.println(resultado);
            }     
        else {
                System.out.println("Datos incorrectos");
                }
        
        
    }
    
}
