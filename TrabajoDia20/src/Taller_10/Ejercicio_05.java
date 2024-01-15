/*
Desarrolla una solución que permita multiplicar dos matrices bidimensionales. 
El usuario debe ingresar las dimensiones y los elementos de ambas matrices. 
Realiza la multiplicación y muestra el resultado al final. Nota: Las matrices se
deben llenar con número aleatorios únicos enteros positivos o negativos (-9-0, 0-9).
 */
package Taller_10;
import java.util.Scanner;
/**
 * @author Juan Diego Guerrero y Ricardo Espinosa
 */
public class Ejercicio_05 {
    public static void main(String[] args) {
        Scanner tc = new Scanner (System.in);
        int limFilas = 4, limColum = 4, numero;
        System.out.println("Ingrese las filas");
        limFilas = tc.nextInt();
        System.out.println("Ingrese las columnas");
        limColum = tc.nextInt();
        int mat1 [][] = new int [limFilas][limColum];
        int mat2 [][] = new int [limFilas][limColum];
        int result[][] = new int [limFilas][limColum];
        for (int i = 0; i < limFilas; i++) 
            for (int j = 0; j < limColum; j++) 
                mat1[i][j] = (numero = (int) (Math.random() * 10) + 1);
        for (int k = 0; k < limFilas; k++) 
            for (int l = 0; l < limColum; l++) 
                mat2[k][l] = (numero = (int) (Math.random() * 10) + 1);
        for (int i = 0; i < limFilas; i++) 
            for (int j = 0; j < limColum; j++) 
                result[i][j] = mat1[i][j] * mat2[j][i];
        for (int i = 0; i < limFilas; i++) {
            for (int j = 0; j < limColum; j++) {
                System.out.print(mat1[i][j]+ "\t");   
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 0; i < limFilas; i++) {
            for (int j = 0; j < limColum; j++) {
                System.out.print(mat2[i][j]+ "\t");   
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 0; i < limFilas; i++) {
            for (int j = 0; j < limColum; j++) {
                System.out.print(result[i][j]+ "\t");   
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
