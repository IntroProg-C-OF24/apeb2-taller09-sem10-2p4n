/*
Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio
cualitativo de los parámetros. Si el promedio es: De 0 a 5 el promedio cualitativo
es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el promedio es Muy Bueno 
De 9.1 a 10 el promedio es Sobresaliente. A la función se la debe llamar desde un
método principal. Los parámetros necesarios para llamar a la función, deben ser 
ingresados solicitados al usuario.
 */
package taller_11;

import java.util.Scanner;

public class Problema_03 {
    static int lim = 4; 
    static String[] promedio = new String [lim];
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double notas[] = new double [lim];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota del estudiante " + (i+1));
            notas[i] = tc.nextDouble();
        }
        promedioCualitativo(notas, promedio);
        presentarPromedioCualitativo(promedio);
    }
    public static void promedioCualitativo(double notas[], String promedio[]){
        for (int i = 0; i < notas.length; i++) {
            if((notas[i]>=0)&(notas[i]<=5)){
                promedio[i] = "Regular";
            }else{
                if((notas[i]>=5.1)&(notas[i]<=8)){
                promedio[i] = "Bueno";
                }else{
                    if((notas[i]>=8.1)&(notas[i]<=9)){
                    promedio[i] = "Muy bueno";
                    }else{
                    promedio[i] = "Sobresaliente";
                    }   
                }   
            }
        }
    }
    public static void presentarPromedioCualitativo(String promedio[]){
        for (int i = 0; i < promedio.length; i++) {
            System.out.println("El estudiante numero " + (i+1) + " tiene una nota " + promedio[i]);
        }
    }
}
    