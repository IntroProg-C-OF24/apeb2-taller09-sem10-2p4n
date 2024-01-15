
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Ejercicio_05_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numero;
        System.out.println("Ingrese el número de filas de la primera matriz:");
        int filas1 = scanner.nextInt();

        System.out.println("Ingrese el número de columnas de la primera matriz:");
        int columnas1 = scanner.nextInt();

        System.out.println("Ingrese el número de filas de la segunda matriz:");
        int filas2 = scanner.nextInt();

        System.out.println("Ingrese el número de columnas de la segunda matriz:");
        int columnas2 = scanner.nextInt();
    
        int[][] matriz1 = new int[filas1][columnas1];
        int[][] matriz2 = new int[filas2][columnas2];
        int[][] resultado = new int[filas1][columnas2];
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                matriz1[i][j] = 0;
            }
        }
        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                matriz2[i][j] = 0;
            }
        }
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                    numero = random.nextInt(19) - 9;
                    matriz1[i][j] = numero;
                    System.out.print(matriz1[i][j]);
            }
            System.out.println(" \n");
        }
        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                    numero = random.nextInt(19) - 9;
                    matriz2[i][j] = numero;
                    System.out.print(matriz2[i][j]);
            }
            System.out.println(" \n");
        }       
        int sum = 0;
        filas1 = matriz1.length;
        columnas1 = matriz1[0].length;
        columnas2 = matriz2[0].length;
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    sum += matriz1[i][k] * matriz2[k][j];
                }
                resultado[i][j] = sum;
                
        System.out.println("Resultado de la multiplicación:");
        
        for (i = 0; i < filas1; i++) {
            for (j = 0; j < columnas2; j++) {
                System.out.println(resultado[i][j]);
            }
            System.out.println(" ");
        }
            }
        }
    }
}

