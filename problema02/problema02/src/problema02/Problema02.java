/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author utpl
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);
        String vehiculo="";
        String nombre;
        int tipo;
        double avaluo=0; 
        double porcentaje;
        double peaje=0;
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();
        System.out.println("Ingrese el tipo de vehiculo\n"
                + " 1: vehículo liviano particular\n" +
                  " 2: vehículo grande particular\n" +
                  " 3: taxi\n" +
                  " 4: bus urbano");
        tipo = leer.nextInt();
        System.out.println("Ingrese el valor del vehículo");
        avaluo = leer.nextDouble();
        
        switch (tipo){
            case 1:
                vehiculo = "Vehiculo liviano particular";
                porcentaje = 0.01;
                peaje = avaluo * porcentaje + 2;
            break;
            case 2:
                vehiculo = "Vehiculo grande particular";
                porcentaje = 0.02;
                peaje = avaluo * porcentaje + 2.5;
            break;
            case 3:
                vehiculo = "Taxi";
                porcentaje = 0.04;
                peaje = avaluo * porcentaje + 1.5;
            break;
            case 4:
                vehiculo = "Bus urbano";
                porcentaje = 0.05;
                peaje = avaluo * porcentaje + 2.2;
            break;
        
        }
        
        System.out.printf("Peaje Buena vía \n\tPropietario: %s\nTipo: %s\n\t"
                + "Valor: $%.1f\n\tPeaje: $%.1f\n",nombre,vehiculo,avaluo,peaje);
        
    }
    
}
