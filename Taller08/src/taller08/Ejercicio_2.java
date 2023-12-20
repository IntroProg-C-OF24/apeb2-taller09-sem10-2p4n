/*
Dado el arreglo; determinar cuantos elementos están arriba de la media aritmética y cuantos están por debajo de la medía aritmética.

int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
*/
package taller08;
/**
 * @author Juan Diego Guerrero Camargo
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double media = 0;
        int porEncima = 0, porDebajo = 0;
        for (int i = 0; i < arreglo.length; i++) {
            media += arreglo[i];
        }
        media = media/arreglo.length;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]>media)
               porEncima += 1;
            else if (arreglo[i]<media)
                porDebajo += 1;
        }
        System.out.println("Media: " + media);
        System.out.println("Hay " + porEncima + " elementos por encima de la media");
        System.out.println("Hay " + porDebajo + " elementos por debajo de la media");
    }
    
}
