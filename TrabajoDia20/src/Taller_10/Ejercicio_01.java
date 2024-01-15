/*
El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al finalizar
el periodo, la Dirección de la carrera de Computación a solicitado las siguientes
estadísticas de la materia INTRODUCCIÓN A LA PROGRAMACIÓN en función a los promedios
por estudiante, dichos promedios se deben calcular (ponderar) de 3 calificaciones
(ACD que representa el 35% de la nota, APE del 35% y la nota del AA con un peso del 30%).
En resumen, los requerimientos son los siguientes:
- Registre los nombres de cada estudiante de dicho paralelo.
- Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts.
- Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación: ACD->35%, APE->35%, y el AA->30%.
- Obtenga el promedio del curso, del paralelo C.
- Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso.
- Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso.
- Muestre el estudiante con su calificación, si es el del mayor promedio (el más alto de la clase).
- Muestre el estudiante con su calificación, si es el del menor promedio (el más bajo de la clase).
*/
package Taller_10;
/*
@author Juan Diego Guerrero y Ricardo Espinosa
*/
public class Ejercicio_01 {
    public static void main(String[] args) {
        String nomAbad[] = {"Juan S.", "Juan D.", "Ricardo", "Carlos", "Flor", "Jesus"};
        int limEst = nomAbad.length, limNotas = 3;
        double matNotas [][] = new double [limEst][limNotas];
        double arrPromedio[] = new double[limEst];
        double numeroMayor, numeroMenor, promedioTotal = 0;
        String nombreMayor, nombreMenor;
        for (int i = 0; i < limEst; i++) 
            for (int j = 0; j < limNotas; j++)
                matNotas[i][j] = (double)(Math.random()*9+1);
        for (int i = 0; i < limEst; i++) {
            arrPromedio[i] = (matNotas[i][0]*0.35)+(matNotas[i][1]*0.35)+(matNotas[i][2]*0.30);
        }
        for (int i = 0; i < limEst; i++) {
            promedioTotal += arrPromedio[i];
        }
        promedioTotal = promedioTotal/limEst;
        numeroMayor = arrPromedio[0];
        numeroMenor = arrPromedio[0];
        nombreMayor = nomAbad [0];
        nombreMenor = nomAbad [0];
        for (int i = 1; i < limEst; i++) {
            if (numeroMayor<arrPromedio[i]){
                numeroMayor = arrPromedio[i];
                nombreMayor = nomAbad[i];
            }
            else 
                if (numeroMenor>arrPromedio[i]){
                    numeroMenor = arrPromedio[i];
                    nombreMenor = nomAbad[i];
                }
        }
        System.out.println("NOMBRES | ACD   | APE   | AA    | PROMEDIOS");
        for (int i = 0; i < limEst; i++){
            System.out.print(nomAbad[i] + "\t");
            for (int j = 0; j < limNotas; j++)
                    System.out.printf("| %.2f \t", matNotas[i][j]);
            System.out.printf("| %.2f \t", arrPromedio[i]);
            System.out.println("");
        }
        System.out.printf("%s%.2f\n","Promedio del curso: ", promedioTotal);
        System.out.println("Mayores al promedio del curso: ");
        for (int i = 0; i < limEst; i++) {
            if(arrPromedio[i]>promedioTotal)
                System.out.printf("%s | %.2f\n", nomAbad[i],arrPromedio[i]);
        }
        System.out.println("Menores al promedio del curso: ");
        for (int i = 0; i < limEst; i++) {
            if(arrPromedio[i]<promedioTotal)
                System.out.printf("%s | %.2f\n", nomAbad[i],arrPromedio[i]);
        }
        System.out.printf("%s%.2f%s%s\n", "Nota mayor: ", numeroMayor, " que pertenece a ", nombreMayor);
        System.out.printf("%s%.2f%s%s" , "Nota menor: ", numeroMenor, " que pertenece a ", nombreMenor);
        System.out.println("");
    }
    
}
