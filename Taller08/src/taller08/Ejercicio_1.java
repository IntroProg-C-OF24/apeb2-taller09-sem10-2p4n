/*
Genera una aplicación que permita ingresar valores a un arreglo de cadenas.
El arreglo almacena el número de elementos que el usuario lo disponga. Se puede 
plantear el escenario que se ingresen nombres de marcas de vehículos.
Por ejemplo, si el usuario decide ingresar 5 marcas; el arreglo solo debe permitir 
ingresar ese número elementos.
Considerar las siguientes excepciones, no se contabilizan dentro del número de 
elementos, marcas que empiecen con las letras A, C, T.
 */
package taller08;
import java.util.Scanner;

/**
 * @author Juan Diego Guerrero Camargo
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int lim = 0, i = 0;
        String marca;
        System.out.println("Ingrese el numero de elementos que va a ingresar: ");
        lim = tc.nextInt();
        String [] marcas = new String[lim]; 
        while (i<lim){
        System.out.println("Ingrese la marcas " + (i+1) + ":");
        marca = tc.next();
            if (marca.startsWith("A") || marca.startsWith("C") || marca.startsWith("T")){
                System.out.println("La marca ingresada no sera contado por la condicion");
            }else{
                marcas[i] = marca;
                i++;    
            }        
        }
        System.out.println("\nMarcas contabilizadas: ");
        for (i = 0; i < lim; i++) {
            System.out.printf("%d %s\n", i+1, marcas[i] );
        }
    }
}
