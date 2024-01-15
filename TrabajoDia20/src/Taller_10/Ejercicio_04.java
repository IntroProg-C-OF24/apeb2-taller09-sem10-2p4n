/*
Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3. Permita
a dos jugadores marcar sus movimientos alternativamente. El juego debe verificar
si alguno de los jugadores ha ganado o si hay un empate.
 */
package Taller_10;
import java.util.Scanner;
/**
 * @author Juan Diego Guerrero y Ricardo Espinosa
 */
public class Ejercicio_04 {
    private static char[][] tablero = new char[3][3];
    private static char jugadorActual = 'X';

    public static void main(String[] args) {
        inicializarTablero();
        mostrarTablero();

        while (true) {
            realizarMovimiento();
            mostrarTablero();

            if (haGanado()) {
                System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                break;
            }

            if (hayEmpate()) {
                System.out.println("¡Empate!");
                break;
            }

            cambiarJugador();
        }
    }

    private static void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    private static void mostrarTablero() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static void realizarMovimiento() {
        Scanner scanner = new Scanner(System.in);
        int fila, columna;

        do {
            System.out.println("Jugador " + jugadorActual + ", ingresa la fila (0-2) y la columna (0-2) separadas por espacio:");
            fila = scanner.nextInt();
            columna = scanner.nextInt();
        } while (!esMovimientoValido(fila, columna));

        tablero[fila][columna] = jugadorActual;
    }

    private static boolean esMovimientoValido(int fila, int columna) {
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ';
    }

    private static void cambiarJugador() {
        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
    }

    private static boolean haGanado() {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) ||
                (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual)) {
                return true;
            }
        }

        // Verificar diagonales
        if ((tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) ||
            (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual)) {
            return true;
        }

        return false;
    }

    private static boolean hayEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false; // Todavía hay celdas vacías, no hay empate
                }
            }
        }
        return true; // Todas las celdas están ocupadas, hay empate
    }
}