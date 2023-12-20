/*
Analice el siguiente código

Scanner entrada = new Scanner(System.in);
String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
String inicial;
boolean bandera = true;
while(bandera){
    System.out.println("Ingrese una letra");
    inicial = entrada.nextLine();
 }
Modifique el ciclo repetitivo para que salga del mismo, cuando el usuario ingrese
por teclado una letra que coincida con alguna de las primeras letras de los nombres
del arreglo estudiantes. Debe usar un ciclo repetitivo para recorrer el arreglo estudiantes.
 */
package taller08;

import java.util.Scanner;

/**
 * @author Juan Diego Guerrero Camargo
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial, estudiante;
        boolean bandera = true;
        int i = 0;
        while(bandera){
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            for (i = 0; i < estudiantes.length; i++) {
                estudiante = estudiantes[i];
                if (estudiante.startsWith(inicial)){
                    System.out.println("La letra " + inicial + " concidio con el nombre: " + estudiantes[i]);
                    System.out.println("Saliendo del programa");
                    bandera = false;  
            }
            }
    }
    }
}
