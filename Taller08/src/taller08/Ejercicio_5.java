/*
El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al finalizar
el ciclo, la Dirección de la carrera de Computación a solicitado las siguientes
estadísticas en función a los promedios obtenidos del ciclo por estudiantes
(use 1 arreglo, no matrices, y para el promedio por estudiante, no ingrese 
el valor, si se debe autogenerar).

Promedio del ciclo, del paralelo C.
Listado de estudiantes con su nota por encima del promedio.
Listado de estudiantes con su nota por debajo del promedio.
Estudiante con la mejor calificación.
Estudiante con la calificación mas baja.
 */
package taller08;

/**
 *
 * @author Juan Diego Guerrero Camargo
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        int limEst = 10;
        double promedio = 0, numeroMayor = 0, numeroMenor = 0, promedioCurso;
        double notaEst[] = new double[limEst];
        for (int i = 0; i < notaEst.length; i++) {
            notaEst[i] = (double)(Math.random()*(9-0+1)+0);
            promedio += notaEst[i];
        }
        System.out.println("Notas de los estudiantes del curso C: \n");
        for (int i = 0; i < notaEst.length; i++) {
                System.out.printf("%s %d: %.2f \n","Nota del estudiante", (i+1), notaEst[i]);
        }
        numeroMayor = notaEst[0];
        numeroMenor = notaEst[0];
        promedioCurso = promedio/notaEst.length;
        for (int i = 1; i < notaEst.length; i++) {
            //notaMayor = (notaEst[i]>numeroMayor) ? notaEst[i]: notaEst[i-1];
            if (numeroMayor<notaEst[i])
                numeroMayor = notaEst[i];
            else if (numeroMenor>notaEst[i])
                    numeroMenor = notaEst[i];
        }
        System.out.printf("%s %.2f \n" , "Promedio del curso: " , (promedio/notaEst.length));
        for (int i = 0; i < notaEst.length; i++) {
            if (notaEst[i]>promedioCurso)
                System.out.printf("%s %d: %.2f \n", "Mayor al promedio", (i), notaEst[i]);
        }
        System.out.printf("%s %.2f \n", "Nota Mayor: ", numeroMayor);
        System.out.printf("%s %.2f \n","Nota menor: ", numeroMenor);
    }
    
}


