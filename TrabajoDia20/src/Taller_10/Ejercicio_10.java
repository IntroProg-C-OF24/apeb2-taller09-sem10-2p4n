/*
Con el objetivo de manipular correctamente los ciclos repetitivos anidados,
se solicita, dado la altura de las salida, generar por pantalla las siguientes 
figuras. Nota: Ud. puede elegir libremente el caracter a mostrar. Nota: Analice 
cual debería ser el límite correcto (mínimo y máximo) de la doble img para que 
sea una doble pirámide legible, validar ese dato de entrada.

   *
  * *
 * * *
* * * *
 * * *
  * *
   *
 */
package Taller_10;
import java.util.Scanner;
/**
 * @author Juan Diego Guerrero y  Ricardo Espinosa
 */
public class Ejercicio_10 {
        public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int lim;
        System.out.println("Ingrese el limite");
        lim = tc.nextInt();
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*   ");
            }
        System.out.println("");    
        }
    }
}


