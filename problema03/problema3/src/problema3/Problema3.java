/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;
import java.util.Scanner;
/**
 *
 * @author CDML
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre;
        int tipo_empleado;
        double sueldo;
        int porcentaje = 0;
        double añadido;
        double sueldo_final;
       
        System.out.println("Ingrese el nombre de el empleado");
        nombre = leer.nextLine();
        System.out.println("Ingrese el sueldo del empleado");
        sueldo = leer.nextDouble();
        System.out.println("Ingrese el tipo de empleado ");
        tipo_empleado = leer.nextInt();
        
        switch (tipo_empleado){
            
            case 1:
                porcentaje = 5;
            break;
            
            case 2:
                porcentaje = 7;
            break;
            
            case 3:
                porcentaje = 9;
            break;
            
            case 4:
                porcentaje = 12;
            break;
            
            default:
                porcentaje = 15;
            break;
           
         }
        
        
        añadido = (sueldo * porcentaje) / 100;
        
        sueldo_final = sueldo + añadido;
        
        System.out.printf("\nEl nombre del empleado es: %s\n"
                + "Tipo de empleado seleccionado: %d\n"
                + "Porcentaje de sueldo añadido: %d\n"
                + "Añadido en dolares: $%.2f\n"
                + "Sueldo final: $%.2f\n",
                nombre,
                tipo_empleado,
                porcentaje,
                añadido,
                sueldo_final);
        
    }
    
}
