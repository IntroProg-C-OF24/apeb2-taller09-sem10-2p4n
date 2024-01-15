/*
Generar las funciones/métodos que devuelvan las suma, resta y multiplicación de 
un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 */
package taller_11;
public class Problema_05 {
    public static void main(String[] args) {
        int limF = 3, limC = 3;
        int matriz1[][] = new int [limF][limC];
        int matriz2[][] = new int [limF][limC];
        int matriz3[][] = new int [limF][limC];
        int matriz4[][] = new int [limF][limC];
        int matriz5[][] = new int [limF][limC];
        generarMatriz(matriz1);
        generarMatriz(matriz2);
        System.out.println("Matriz 1");
        System.out.println(devolverMatriz(matriz1));
        System.out.println("Matriz 2");
        System.out.println(devolverMatriz(matriz2));
        sumaMatrices(matriz1, matriz2, matriz3);
        System.out.println("Suma de matrices");
        System.out.println(devolverMatriz(matriz3));
        restaMatrices(matriz1, matriz2, matriz4);
        System.out.println("Resta de matrices");
        System.out.println(devolverMatriz(matriz4));
        multMatrices(matriz1, matriz2, matriz5);
        System.out.println("Multiplicacion de matrices");
        System.out.println(devolverMatriz(matriz5));
    }
    public static void generarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int)(Math.random()*(9-0+1)+0);
            }
        }
    }
    
    public static String devolverMatriz(int matriz[][]){
        String cadena = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                cadena += String.format("%d\t", matriz[i][j]);
            }
            cadena += "\n";
        }
        return cadena;
    }
    public static void sumaMatrices (int matriz1[][], int matriz2[][],int matriz3[][]){
           for (int i = 0; i < matriz1.length; i++) {
               for (int j = 0; j < matriz1[0].length; j++) {
                   matriz3[i][j] = matriz1[i][j]+ matriz2[i][j];
               }
        }
    }
        public static void restaMatrices (int matriz1[][], int matriz2[][],int matriz4[][]){
           for (int i = 0; i < matriz1.length; i++) {
               for (int j = 0; j < matriz1[0].length; j++) {
                   matriz4[i][j] = matriz1[i][j] - matriz2[i][j];
               }
        }
    }
        public static void multMatrices(int matriz1[][], int matriz2[][],int matriz5[][]){
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz2[0].length; j++) {
                    for (int k = 0; k < matriz1[0].length; k++) {
                        matriz5[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                }
            }
        }
}