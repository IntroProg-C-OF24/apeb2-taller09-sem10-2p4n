/*
Generar una solución que implemente 3 procedimientos. Que permitan calcular el 
área de un cuadrado, área de un triángulo y área de un rectángulo. Cada 
procedimiento/función debe recibir los datos necesarios y generar el valor correspondiente.
Se debe invocar a los procedimientos desde un método principal; Si el usuario ingresa
1 se llama al procedimiento obtenerAreaCuadrado; 2 se llama al procedimiento 
obtenerAreaTriangulo; 3 se llama al procedimiento obtenerAreaCuadrado.
El área del cuadrado es igual a lado x lado x lado x lado
El área del triángulo es igual a (base x altura)/2
El área del rectángulo es igual a base x altura
 */
package taller_11;

import java.util.Scanner;

public class Problema_02 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double num1, num2;
        int opcion;
        System.out.println("[1] Calcular el area de un triangulo");
        System.out.println("[2] Calcular el area de un cuadrado");
        System.out.println("[3] Calcular el area de un rectangulo");
        opcion = tc.nextInt();
        if (opcion == 1) {
            System.out.println("Ingrese la base del triangulo: ");
            num1 = tc.nextDouble();
            System.out.println("Ingrese la altura lado del triangulo: ");
            num2 = tc.nextDouble();
            System.out.println("El area del triangulo es igual a: " + areaTriangulo(num1, num2));
        }
        if (opcion == 2) {
            System.out.println("Ingrese un lado del cuadrado: ");
            num1 = tc.nextDouble();
            System.out.println("El area del cuadrado es igual a: " + areaCuadrado(num1));

        }
        if (opcion == 3) {
            System.out.println("Ingrese la base del rectangulo: ");
            num1 = tc.nextDouble();
            System.out.println("Ingrese la altura del rectangulo: ");
            num2 = tc.nextDouble();
            System.out.println("El area del rectangulo es igual a: " + areaTriangulo(num1, num2));
        }
    }
    public static double areaTriangulo (double num1, double num2){
        double respt;
        respt =+ (num1*num2)/2;
        return respt;
    }
    public static double areaCuadrado(double num1){
        double respt;
        respt = Math.pow(num1, 2);
        return respt;
    }
    public static double areaRectangulo(double num1, double num2){
        double respt;
        respt = num1 * num2;
        return respt;
    }
}
