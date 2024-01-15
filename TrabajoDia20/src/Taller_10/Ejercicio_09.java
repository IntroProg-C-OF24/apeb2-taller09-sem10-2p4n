/*
Con el objetivo de manipular correctamente los ciclos repetitivos anidados, se 
solicita, dado la altura de la salida, generar por pantalla las siguientes figuras.
Nota: Ud. puede elegir libremente el caracter a mostrar en la figura.

*
* *
* * *
* * * *
*/
package Taller_10;

import java.util.Scanner;
/**
 * @author Juan Diego Guerrero y Ricardo Espinosa
 */
public class Ejercicio_09 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int lim;
        System.out.println("Ingrese el limite");
        lim = tc.nextInt();
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
        System.out.println("");    
        }
    }
}
