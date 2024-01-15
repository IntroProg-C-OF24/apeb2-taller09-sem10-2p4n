/*
Generar un procedimiento para calcular el valor de la planilla de luz y otro 
procedimiento para calcular el valor del predio de un bien inmueble. Cada 
procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, 
cédula del cliente).
En el procedimiento de planilla de luz se debe pedir los siguiente datos valor 
del kilowatio y el número de kilowatios del mes. Y se genera en pantalla el 
siguiente reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar el 
valor de $10

En el procedimiento del predio se debe pedir el valor de inmueble y el para 
obtener el valor del predio se saca el 2% del valor del inmueble. Y se genera 
el siguiente reporte:

Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $
30000 y tiene que pagar de predio $ 600.

En el método principal; si el usuario ingresa 1 se llama al procedimiento 
calcularValorLuz; 2 se llama al procedimiento calcularPredio. Los datos que se 
necesita en cada procedimiento se los debe ingresar por teclado.
 */
package taller_11;

import java.util.Scanner;

public class Problema_04 {
    public static void main(String[] args) {
        Scanner tc = new Scanner (System.in);
        int opcion;
        double kilovatio, kilovatioMes, resultado1 = 0, resultado2 = 0, inmueble;
        String nombre, cedula;
        System.out.println("Ingrese su nombre y apellido");
        nombre = tc.nextLine();
        System.out.println("Ingrese su cedula");
        cedula = tc.nextLine();
        System.out.println("[1] Generar planilla de luz");
        System.out.println("[2] Generar Predio de un bien");
        opcion = tc.nextInt();
        if (opcion == 1){
            System.out.println("Ingrese el valor del kilovatio: ");
            kilovatio = tc.nextDouble();
            System.out.println("Ingrese el numero de kilovatios gastados en el mes");
            kilovatioMes = tc.nextDouble();
            System.out.println("Cliente " + nombre + " con cedula " + cedula + " debe cancelar el valor de: " + valorPlanillaLuz(kilovatio, kilovatioMes, resultado1));
        }
        if (opcion == 2){
            System.out.println("Ingrese el valor del inmueble: ");
            inmueble = tc.nextDouble();
            System.out.println("Cliente " + nombre + " con cedula " + cedula + " debe cancelar el valor de: " + predioBienInmueble(inmueble, resultado2));

        }
    }
    public static double valorPlanillaLuz(double kilovatio, double kilovatioMes, double resultado1){
        resultado1 = kilovatio*kilovatioMes;
        return resultado1;
    }
    public static double predioBienInmueble(double inmueble, double resultado2){
        resultado2 = inmueble*0.02;
        return resultado2;
    }    
}
